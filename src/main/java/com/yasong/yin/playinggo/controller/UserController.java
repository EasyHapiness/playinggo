package com.yasong.yin.playinggo.controller;

import com.alibaba.fastjson.JSONObject;
import com.yasong.yin.playinggo.common.TestAnnotation;
import com.yasong.yin.playinggo.conf.Config;
import com.yasong.yin.playinggo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

    @Resource
    UserService userService;

    @Resource
    Config config;

    @RequestMapping("/info")
    @ResponseBody
    public Object getUserById(Long id){

       return getSuccessResult(config.getName(),userService.getUserById(id));
    }

    @TestAnnotation(desc = "test")
    @RequestMapping("/msg")
    @ResponseBody
    public Object getMsg(){

        return getFailResult("失败啦","123456");
    }
}
