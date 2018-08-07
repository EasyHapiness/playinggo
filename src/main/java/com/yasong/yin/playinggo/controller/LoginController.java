package com.yasong.yin.playinggo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping
public class LoginController extends BaseController{

    @RequestMapping("/login")
    public Object login(){

        return getSuccessResult("","login");
    }
}
