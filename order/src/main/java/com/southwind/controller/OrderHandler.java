package com.southwind.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderHandler {

    @Value("${server.port}")
    public String port;

    @GetMapping(value = "/index")
    public String index(){
      return "order的端口:"+this.port;
    }

}
