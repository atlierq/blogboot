package com.noone.controller;


import com.noone.common.lang.Result;
import com.noone.entity.User;
import com.noone.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author NoOne
 * @since 2022-04-29
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/index")
    public Object index(){
        User user = userService.getById(1L);
        return Result.success(user);
    }
    @RequiresAuthentication
    @GetMapping("/index2")
    public Object index2(){
        User user = userService.getById(1L);
        return Result.success(user);
    }

    @PostMapping("/test")
    public Result test(@Validated @RequestBody User user){
        return Result.success(user);
    }
}
