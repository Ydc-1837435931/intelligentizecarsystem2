package com.ydcelad.intelligentizecarsystem.utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;

import java.util.Collections;

/*
* 代码生成器
* */
public class Codegenerator {
    public static void main(String[] args) {
        generate();

    }
    private static void generate(){
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/intelcar?serverTimezone=GMT%2b8",
                "root", "123456")
                .globalConfig(builder -> {
                    builder.author("yindc") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\elad\\intelligentizecarsystem\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.ydcelad.intelligentizecarsystem") // 设置父包名
                            .moduleName(null) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:\\elad\\intelligentizecarsystem\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.entityBuilder().enableLombok();
                    builder.controllerBuilder().enableHyphenStyle().enableRestStyle(); //开启驼峰转连字符 开启RestController
                    builder.addInclude("sys_role") // 设置需要生成的表名
                            .addTablePrefix("t_", "sys_"); // 设置过滤表前缀
                })
//                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
