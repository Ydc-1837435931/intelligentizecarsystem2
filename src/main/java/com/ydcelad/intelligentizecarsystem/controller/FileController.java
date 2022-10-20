package com.ydcelad.intelligentizecarsystem.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.ydcelad.intelligentizecarsystem.common.Constants;
import com.ydcelad.intelligentizecarsystem.common.Result;
import com.ydcelad.intelligentizecarsystem.entity.Files;
import com.ydcelad.intelligentizecarsystem.service.IFileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;


@RestController
@RequestMapping("/file")
public class FileController {

    @Value("${files.upload.path}")
    private String fileUploadPath;

    @Resource
    IFileService iFileService;

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        String type = FileUtil.extName(originalFilename);
        long size = file.getSize();
        //先存储到磁盘
        File uploadParentFile = new File(fileUploadPath);
        if(!uploadParentFile.exists()){
            uploadParentFile.mkdirs();
        }
        //定义一个文件唯一的标识
        String uuid = IdUtil.fastSimpleUUID();
        String fileUUID = uuid + StrUtil.DOT + type;
        File uploadFile = new File(fileUploadPath + fileUUID);

        //查询数据库是否已存在唯一标识md5
//        String md5 = SecureUtil.md5(uploadFile);
        String md5 = SecureUtil.md5(file.getInputStream());
        String url;
        Files files = iFileService.selectMd5(md5);
        if(files != null){
            url = files.getUrl();
        }else {
            //把获取的文件储存到磁盘目录
            file.transferTo(uploadFile);
            url = "http://localhost:8088/file/" + fileUUID;
        }

        //存储到数据库
        Files saveFile = new Files();
        saveFile.setName(originalFilename);
        saveFile.setType(type);
        saveFile.setSize(size/1024);
        saveFile.setUrl(url);
        saveFile.setMd5(md5);
        iFileService.save(saveFile);
        return url;
    }

    @GetMapping("/{fileUUID}")
    public void download(@PathVariable String fileUUID, HttpServletResponse response) {
        //根据文件的唯一标识获取文件
        File uploadFile = new File(fileUploadPath + fileUUID);
        try {
            //设置输出流的格式
            ServletOutputStream outputStream = response.getOutputStream();
            response.addHeader("Content-Disposition","attachment;filename=" + URLEncoder.encode(fileUUID,"UTF-8"));
            response.setContentType("application/octet-stream");
            //读取文件的字节流
            outputStream.write(FileUtil.readBytes(uploadFile));
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @PostMapping("/getlist")
    public Result list(@RequestBody Files files){
        String name = files.getName();
        String type = files.getType();
//        if(StrUtil.isBlank(name) || StrUtil.isBlank(type)){
//            return Result.error(Constants.CODE_400,"参数错误");
//        }
        List<Files> list = iFileService.getlist(files);
        return Result.success(list);
    }


    @PostMapping("/delFile")
    public Result delFile(@RequestBody Integer id){
        int countid = iFileService.searchByid(id);
        if(countid <= 0){
            return Result.error(Constants.CODE_400,"数据不存在");
        }
        iFileService.delFile(id);
        return Result.success();
    }
}
