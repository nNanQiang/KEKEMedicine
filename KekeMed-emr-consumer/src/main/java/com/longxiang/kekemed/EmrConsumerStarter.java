package com.longxiang.kekemed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b> emr 消费者启动类</b>
 *
 * @author ssss
 * @date 2022/7/4
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EmrConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(EmrConsumerStarter.class,args);
	}
}
