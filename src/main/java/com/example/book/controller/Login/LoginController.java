package com.example.book.controller.Login;

import com.alibaba.fastjson.JSONObject;
import com.example.book.bean.Login.User;
import com.example.book.interfacer.UserLoginToken;
import com.example.book.util.Login.LoginUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LoginController {
    //登录
    @PostMapping("/login")
    public Object login(@RequestBody User user){
        JSONObject jsonObject=new JSONObject();
       // User userForBase=userService.findByUsername(user);
        User userForBase = new User("1","admin","admin");

        if(userForBase==null){
            jsonObject.put("message","登录失败,用户不存在");
            return jsonObject;
        }else {
            if (!userForBase.getPassword().equals(user.getPassword())){
                jsonObject.put("message","登录失败,密码错误");
                return jsonObject;
            }else {
                String token = LoginUtils.getToken(userForBase);
                jsonObject.put("token", token);
               // jsonObject.put("user", userForBase);
                System.out.println(jsonObject);
                return jsonObject;
            }
        }
    }
    @UserLoginToken
    @GetMapping("/getMessage")
    public String getMessage(){
        return "你已通过验证";
    }
}
