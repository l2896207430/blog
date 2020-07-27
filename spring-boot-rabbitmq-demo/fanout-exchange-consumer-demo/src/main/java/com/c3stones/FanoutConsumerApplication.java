package com.c3stones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * 
 * @author CL
 *
 */
@SpringBootApplication
public class FanoutConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FanoutConsumerApplication.class, args);
	}

}
