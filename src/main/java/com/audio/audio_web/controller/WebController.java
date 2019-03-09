package com.audio.audio_web.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
public class WebController {

    @Resource
    private UserRepository userDao;
    /**
     * 新增用户
     * @param userParam 前台参数封装
     * @param result    请求异常信息封装
     * @param model     请求结果封装
     * @return
     */

    @RequestMapping("/")
    public  ModelMap index(ModelMap map){
        map.addAttribute("index_value","WELCOME TO NEW WORLD!!!");
        return  map;
    }

    @RequestMapping("/login")
    public ModelMap login(ModelMap map){
        map.addAttribute( "index_value","WELCOME TO NEW WORLD!!!");
        return map;
    }


//    @RequestMapping("/admin")
//    public ModelMap admin(ModelMap map){
//        map.addAttribute( "index_value","WELCOME TO NEW WORLD!!!");
//        return map;
//    }
}
