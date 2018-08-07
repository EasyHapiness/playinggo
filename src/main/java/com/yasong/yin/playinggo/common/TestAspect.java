package com.yasong.yin.playinggo.common;

import com.yasong.yin.playinggo.controller.BaseController;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Aspect
@Component
public class TestAspect extends BaseController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(* com.yasong.yin.playinggo.controller.*.*(..))" + "&& !execution(* com.yasong.yin.playinggo.controller.LoginController.*(..))")
    public void check(){

    }

    @Before("check()")
    public void doCheck(){
        ServletRequestAttributes requestAttributes=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes());
        if (requestAttributes == null){
            logger.info(" user is not login!");
            return;
        }

        HttpSession session = requestAttributes.getRequest().getSession();
        if (null == session){
            logger.info("============================is not login!");
            return;
        }
        logger.info("============================");
    }

}
