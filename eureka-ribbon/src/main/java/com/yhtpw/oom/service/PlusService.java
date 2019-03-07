package com.yhtpw.oom.service;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import java.util.List;

@Service
public class PlusService {

	@Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "Fallback")
    public List<String> plus() {
        return restTemplate.getForEntity("http://service1/services", List.class).getBody();
    }

    public List<String> Fallback() {
        System.out.println("fall back .... ");
        return Lists.newArrayList();
    }
}
