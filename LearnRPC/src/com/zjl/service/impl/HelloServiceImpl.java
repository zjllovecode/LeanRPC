package com.zjl.service.impl;

import com.zjl.service.HelloService;

/**
 *  HelloServiceImpl 实现自定义服务接口
 *
 */
public class HelloServiceImpl implements HelloService {  
	  
    public String hello(String name) {  
        return "Hello " + name;  
    }  
}
