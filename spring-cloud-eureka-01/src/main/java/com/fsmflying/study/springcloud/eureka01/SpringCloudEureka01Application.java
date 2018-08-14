package com.fsmflying.study.springcloud.eureka01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEureka01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEureka01Application.class, args);
	}
}
