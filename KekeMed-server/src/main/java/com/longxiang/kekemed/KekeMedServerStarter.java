package com.longxiang.kekemed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>项目注册启动类</b>
 *
 * @author ssss
 * @date 2022/7/2
 */
@SpringBootApplication
@EnableEurekaServer
public class KekeMedServerStarter {
	public static void main(String[] args) {
		SpringApplication.run(KekeMedServerStarter.class,args);
	}

}
