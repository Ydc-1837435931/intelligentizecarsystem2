package com.ydcelad.intelligentizecarsystem.utils;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.ydcelad.intelligentizecarsystem.entity.User;
import com.ydcelad.intelligentizecarsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Component
public class TokenUtils {

    private static UserService staticUserService;

    @Resource
    private UserService userService;

    @PostConstruct
    public void setUserService(){
        staticUserService = userService;
    }



    public  static String getToken(String userId,String sign){
        return JWT.create().withAudience(userId) //将userId存入 Token里面
                    .withExpiresAt(DateUtil.offsetHour(new Date(),2))
                    .sign(Algorithm.HMAC256(sign));
    }

    public static User getCurrentUser(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = request.getHeader("token");
        if(StrUtil.isNotBlank(token)){
            try{
                String userId = JWT.decode(token).getAudience().get(0);
                return staticUserService.getById(userId);
            }catch (Exception e){
                return null;
            }
        }
        return  null;
    }
}
