package com.yhtpw.oom.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/services", method = RequestMethod.GET)
    public List<String> services() {
        List<String> services = client.getServices();
        services.forEach(service -> {
            logger.info("service: {} ", service);
        });
        List<ServiceInstance> instances = client.getInstances("service1");
        instances.forEach(instance->{
            logger.info("host:{} port:{} url:{}", instance.getHost(), instance.getPort(), instance.getUri());
        });
        return services;
    }

}