package com.fsmflying.study.springcloud.config.consumer01;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
//@EnableHystrixDashboard
//@EnableHystrix
//@EnableCircuitBreaker
@RefreshScope
public class SpringCloudConfigConsumer01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigConsumer01Application.class, args);
	}

	@Value("${name}")
	private  String name;
	@Value("${age}")
	private  String age;
	@Value("${version}")
	private  String version="开发环境";

	@RequestMapping("/test")
	public String test(){
		return "你好，我是"+name+",年龄："+age+"岁。当前环境："+version;
	}
}
