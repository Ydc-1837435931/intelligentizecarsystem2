package com.ydcelad.intelligentizecarsystem.config;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthAccess {
    boolean name() default true;
}
