package com.ydcelad.intelligentizecarsystem.controller;


import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.ydcelad.intelligentizecarsystem.common.Result;
import com.ydcelad.intelligentizecarsystem.entity.User;
import com.ydcelad.intelligentizecarsystem.service.UserService;
import com.ydcelad.intelligentizecarsystem.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.ArrayList;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yindc
 * @since 2022-04-17
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public Result findAll(){
        return Result.success(userService.findAll());
    }

    @GetMapping("/export")
    public void export(HttpServletResponse response)throws Exception{
        //从数据库查询出所有的数据
        List<User> list = userService.findAll();
        //通过工具类创建Writer 写出到磁盘路径
        //ExcelWriter writer = ExcelUtil.getWriter(fileUploadPath + "/用户信息.xlsx")；
        //内存操作，写出到浏览器
        ExcelWriter writer = ExcelUtil.getWriter(true);
        //自定义标题别名
        writer.addHeaderAlias("id","ID");
        writer.addHeaderAlias("username","用户名");
        writer.addHeaderAlias("password","密码");
        writer.addHeaderAlias("nickname","昵称");
        writer.addHeaderAlias("email","邮箱");
        writer.addHeaderAlias("phone","电话");
        writer.addHeaderAlias("address","地址");
        writer.addHeaderAlias("createTime","创建时间");
//        writer.addHeaderAlias("avatarUrl","头像");

        //一次性写出list内的对象到EXCEL,使用默认样式，强制输出标题
        writer.write(list,true);
        //设置浏览器相应的格式
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
        String filename = URLEncoder.encode("用户信息","UTF-8");
        response.setHeader("content-Disposition","attachment;filename"+filename+".xlsx");

        ServletOutputStream out = response.getOutputStream();
        writer.flush(out,true);
        out.close();
        writer.close();
    }

//    @PostMapping("/import")
//    public void imp(MultipartFile file) throws Exception{
//        InputStream inputStream = file.getInputStream();
//        ExcelReader reader = ExcelUtil.getReader(inputStream, "Sheet1");
//        List<User> list = reader.readAll(User.class);
//        System.out.println(list);
////        userService.saveUser(list);
//        for(User user:list){
//            System.out.println(user);
//        }
//
//    }

    @PostMapping("/importt")
    public void impo(MultipartFile file) throws Exception{
        // 1.获取上传文件输入流
        InputStream inputStream = null;
        try{
            inputStream = file.getInputStream();
        }catch (Exception e){
            e.printStackTrace();
            return;
        }
        // 2.应用HUtool ExcelUtil获取ExcelReader指定输入流和sheet
        ExcelReader excelReader = ExcelUtil.getReader(inputStream, "Sheet1");
        // 可以加上表头验证
        // 3.读取第二行到最后一行数据
        List<List<Object>> read = excelReader.read(1, excelReader.getRowCount());
        for (List<Object> objects : read) {
            //objects.get(0),读取某行第一列数据
            //objects.get(1),//读取某行第二列数据
            System.out.println(objects.get(0));
        }
        //read.size是行数，，read.get(i).size()是列数
        System.out.println(read.size()+"!!!"+read.get(1).size());
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < read.size(); i++) {
                  User user = new User();
                  user.setUsername(read.get(i).get(0).toString());
                  user.setPassword(read.get(i).get(1).toString());
                  user.setNickname(read.get(i).get(2).toString());
                  user.setEmail(read.get(i).get(3).toString());
                  user.setPhone(read.get(i).get(4).toString());
                  user.setAddress(read.get(i).get(5).toString());
                users.add(user);
        }
        userService.saveUser(users);

    }
}

