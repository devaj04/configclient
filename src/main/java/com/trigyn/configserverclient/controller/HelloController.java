package com.trigyn.configserverclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/port")
    public String getPortDetails(){
        return serverPort;
    }

}
