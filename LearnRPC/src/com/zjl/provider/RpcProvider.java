package com.zjl.provider;

import com.zjl.RPC.RpcFramework;
import com.zjl.service.HelloService;
import com.zjl.service.impl.HelloServiceImpl;

/** 
 * RpcProvider  ±©Â¶·þÎñ
 *  
 */  
public class RpcProvider {  
  
    public static void main(String[] args) throws Exception {  
        HelloService service = new HelloServiceImpl();  
        RpcFramework.export(service, 1234);  
    }  
  
}  
