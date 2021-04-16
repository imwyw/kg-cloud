package com.kg.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangyuanwei
 * @title: AssetApplication
 * @projectName kg-cloud
 * @description: 描述
 * @date 2021/4/16 14:40
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AssetApplication {
    public static void main(String[] args) {
        SpringApplication.run(AssetApplication.class, args);
    }
}
