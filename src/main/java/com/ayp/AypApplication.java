package com.ayp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.ayp.web.dao")
@ComponentScan("com.ayp")
public class AypApplication {

	public static void main(String[] args) {
		SpringApplication.run(AypApplication.class, args);
	}
}
