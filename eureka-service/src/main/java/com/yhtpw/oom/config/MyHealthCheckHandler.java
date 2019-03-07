package com.yhtpw.oom.config;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

/**
 * 健康检查处理器
 * 将服务提供者的健康状态传递给eureka服务器
 */
@Component
public class MyHealthCheckHandler implements HealthCheckHandler {

    @Override
    public InstanceInfo.InstanceStatus getStatus(InstanceInfo.InstanceStatus instanceStatus) {
        return InstanceInfo.InstanceStatus.UP;
    }
}