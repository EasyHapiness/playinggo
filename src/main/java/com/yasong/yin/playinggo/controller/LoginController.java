package com.yasong.yin.playinggo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping
public class LoginController extends BaseController{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/login")
    public Object login(){

        logger.info("fdsfdsfsdfsdf");
        return getSuccessResult("","login");
    }
}
