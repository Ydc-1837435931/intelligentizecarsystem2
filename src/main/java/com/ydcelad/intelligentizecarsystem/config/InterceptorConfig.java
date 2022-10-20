package com.ydcelad.intelligentizecarsystem.config;

import com.ydcelad.intelligentizecarsystem.interceptor.JwtInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(jwtInterceptor())
                .addPathPatterns("/**") //拦截所有的请求，通过判断token是否合法来决定是否需要登录
                .excludePathPatterns("/userlogin/xclogin","/user/export","/parkingInfo/export","**/import","/file/**","/merchants/getMerchantList");
    }

    @Bean
    public JwtInterceptor jwtInterceptor(){
        return new JwtInterceptor();
    }
}
