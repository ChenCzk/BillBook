package com.example.book.controller;

import com.alibaba.fastjson.JSONObject;
import jdk.nashorn.internal.scripts.JS;

public class AbstractController {
    public String showSuccessMessage(String message){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("success",true);
        jsonObject.put("data",message);
        return jsonObject.toJSONString();
    }

    public String showErrorMessage(String message){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("success",false);
        jsonObject.put("data",message);
        return jsonObject.toJSONString();
    }


    public String toJSON(Object message){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("success",true);
        jsonObject.put("data",message);
        return jsonObject.toJSONString();
    }
}
