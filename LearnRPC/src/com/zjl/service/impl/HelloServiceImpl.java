package com.zjl.service.impl;

import com.zjl.service.HelloService;

/**
 *  HelloServiceImpl ʵ���Զ������ӿ�
 *
 */
public class HelloServiceImpl implements HelloService {  
	  
    public String hello(String name) {  
        return "Hello " + name;  
    }  
}
