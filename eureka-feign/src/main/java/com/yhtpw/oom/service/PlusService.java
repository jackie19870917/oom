package com.yhtpw.oom.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(value = "service1") // 需要调用服务的应用Id
public interface PlusService {

    @GetMapping(value = "/services") // 服务Restfull服务的URL
    List<String> getInfo();
}
