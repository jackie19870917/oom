package com.yhtpw.oom.controller;

import com.yhtpw.oom.service.PlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private PlusService plusService;

    @RequestMapping(value = "/services", method = RequestMethod.GET)
    public List<String> add() {
        return plusService.getInfo();
    }


}