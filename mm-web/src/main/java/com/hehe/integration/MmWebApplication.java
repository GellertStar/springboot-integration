package com.hehe.integration;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *  注：为了避免扫描路径不一致，请将启动类放在Root Package 即 com.hehe.integration
 */

@SpringBootApplication
@EnableScheduling
@EnableAsync
@ComponentScan(basePackages = "com.hehe.integration.*")
@MapperScan("com.hehe.integration.mapper")
@Slf4j
public class MmWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmWebApplication.class, args);
	}
}
