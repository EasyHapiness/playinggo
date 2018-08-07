package com.yasong.yin.playinggo.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Aspect
@Component
public class OperateLogAop {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("within(com.yasong.yin.playinggo.controller..*) && @annotation(testAnnotation)")

    public void getInfo(TestAnnotation testAnnotation) throws IOException {


        logger.info("=============== "+ testAnnotation.desc());
    }
}
