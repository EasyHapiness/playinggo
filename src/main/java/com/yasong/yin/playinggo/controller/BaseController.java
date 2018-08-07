package com.yasong.yin.playinggo.controller;

import java.util.HashMap;
import java.util.Map;

public class BaseController {

    /**
     * 成功响应code
     */
    private static final int RES_SUCCESS = 200;

    /**
     * 失败响应code
     */
    private static final int RES_FAIL =0;

    /**
     * 成功响应返回结果
     * @param msg
     * @param object
     * @return
     */
    protected Map<String,Object> getSuccessResult(String msg,Object object){
        return createJson(true,RES_SUCCESS,msg,object);
    }

    /**
     * 失败返回结果
     * @param msg
     * @param object
     * @return
     */
    protected Map<String,Object> getFailResult(String msg,Object object){
        return createJson(true,RES_FAIL,msg,object);
    }


    private Map<String, Object> createJson(boolean isOk, int resCode, String errorMsg, Object obj) {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        jsonMap.put("result", isOk ? "ok" : "fail");
        jsonMap.put("rescode", resCode);
        jsonMap.put("msg", errorMsg);
        jsonMap.put("data", obj);
        return jsonMap;
    }

}
