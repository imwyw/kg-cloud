package com.kg.cloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyuanwei
 * @title: HomeController
 * @projectName kg-cloud
 * @description: 描述
 * @date 2021/4/16 14:35
 */
@RestController
public class HomeController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/asset/serverport")
    public String getServerPort() {
        return serverPort;
    }
}
