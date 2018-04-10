package com.better;

/**
 * 服务提供者接口实现类
 * @author zhangjiuliang
 *
 */
public class HelloServiceImpl implements HelloService {
	 
    public String sayHi(String name) {
        return "Hi, " + name;
    }
 
}
