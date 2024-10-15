package com.demo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 项目启动类
 */
@Slf4j
@EnableScheduling
@EnableAsync
@MapperScan("com.demo.dao")
@SpringBootApplication(scanBasePackages = {"com.demo"})
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
        log.info("BootApplication start success ...");
    }

}

