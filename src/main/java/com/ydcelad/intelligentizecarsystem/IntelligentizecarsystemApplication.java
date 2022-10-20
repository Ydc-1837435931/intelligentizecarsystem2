package com.ydcelad.intelligentizecarsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.oas.annotations.EnableOpenApi;

//对需要开启缓存的方法加上@Cacheable并且符合SpEL语法

@SpringBootApplication
@EnableOpenApi
@EnableCaching
public class IntelligentizecarsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntelligentizecarsystemApplication.class, args);
    }

}
