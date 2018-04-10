package com.better;

import java.io.IOException;

/**
 * 服务中心接口
 * @author zhangjiuliang
 *
 */
public interface Server {
    public void stop();
 
    public void start() throws IOException;
 
    public void register(Class<?> serviceInterface, Class<?> impl);
 
    public boolean isRunning();
 
    public int getPort();
}