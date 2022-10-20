package com.ydcelad.intelligentizecarsystem.controller;

import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.ydcelad.intelligentizecarsystem.common.Result;
import com.ydcelad.intelligentizecarsystem.entity.ParkingInfo;
import com.ydcelad.intelligentizecarsystem.service.IParkingInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.List;

@RestController
@RequestMapping("/parkingInfo")
public class ParkingInfoController {

    @Resource
    private IParkingInfoService parkingInfoService;

    @PostMapping("/getList")
    public Result list(@RequestBody ParkingInfo parkingInfo){

        List<ParkingInfo> list = parkingInfoService.selectParkingInfoList(parkingInfo);
        return Result.success(list);
    }

    @PostMapping("/getInfo")
    public Result getInfo(@RequestBody Long parkinid){

        ParkingInfo parkingInfo1 = parkingInfoService.selectParkingById(parkinid);
        return Result.success(parkingInfo1);
    }

    @GetMapping("/export")
    public void export(HttpServletResponse response)throws Exception{
        //从数据库查询出所有的数据
        ParkingInfo parkingInfo = new ParkingInfo();
        List<ParkingInfo> list = parkingInfoService.selectParkingInfoList(parkingInfo);
        //通过工具类创建Writer 写出到磁盘路径
        //ExcelWriter writer = ExcelUtil.getWriter(fileUploadPath + "/用户信息.xlsx")；
        //内存操作，写出到浏览器
        ExcelWriter writer = ExcelUtil.getWriter(true);
        //自定义标题别名
        writer.addHeaderAlias("parkinid","ID");
        writer.addHeaderAlias("parkingname","停车场名称");
        writer.addHeaderAlias("parkinglinkman","停车场联系人");
        writer.addHeaderAlias("parkingphone","停车场联系电话");
        writer.addHeaderAlias("parkingaddress","停车场地址");
        writer.addHeaderAlias("parkingencrypt","停车场加密");
        writer.addHeaderAlias("parkingweburl","停车场网址");
        writer.addHeaderAlias("parkingurlport","停车场网址端口");
        writer.addHeaderAlias("parkinginfoweburl","停车场网址端口");
        writer.addHeaderAlias("parkingremark","停车场备注");
        writer.addHeaderAlias("parkingwupaienable","是否支持无牌进出");
        writer.addHeaderAlias("parkingphonepay","是否支持手机支付");
        writer.addHeaderAlias("parkingcarpay","是否支持遥感识别");
//        writer.addHeaderAlias("avatarUrl","头像");

        //一次性写出list内的对象到EXCEL,使用默认样式，强制输出标题
        writer.write(list,true);
        //设置浏览器相应的格式
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
        String filename = URLEncoder.encode("停车场信息","UTF-8");
        response.setHeader("content-Disposition","attachment;filename"+filename+".xlsx");

        ServletOutputStream out = response.getOutputStream();
        writer.flush(out,true);
        out.close();
        writer.close();
    }


}
