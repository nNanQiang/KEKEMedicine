package com.longxiang.kekemed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b> system-Consumer 启动类</b>
 *
 * @author ssss
 * @date 2022/7/4
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SystemConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(SystemConsumerStarter.class,args);
	}
}
