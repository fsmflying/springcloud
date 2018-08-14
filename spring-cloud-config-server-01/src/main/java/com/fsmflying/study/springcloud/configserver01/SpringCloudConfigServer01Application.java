package com.fsmflying.study.springcloud.configserver01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class SpringCloudConfigServer01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServer01Application.class, args);
	}
}
