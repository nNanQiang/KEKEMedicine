package com.longxiang.kekemed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b> opc-provider 启动类</b>
 *
 * @author ssss
 * @date 2022/7/4
 */
@SpringBootApplication
@EnableEurekaClient
public class OpcProviderStrater {
	public static void main(String[] args) {
		SpringApplication.run(OpcProviderStrater.class,args);
	}
}
