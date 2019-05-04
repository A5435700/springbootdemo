package com.wuyi.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 陈晓萌
 * 2019/5/2 16:41
 */
@RestController
public class TestController {
    @RequestMapping(value = "/test")
     public String test(){
         return "五一期间一定要完成这个任务，认真的，好好的";
     }
}

