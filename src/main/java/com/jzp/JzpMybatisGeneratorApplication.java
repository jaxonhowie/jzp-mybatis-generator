package com.jzp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Hongyi Zheng
 * @date 2019/5/23
 */
@SpringBootApplication
@Configuration
public class JzpMybatisGeneratorApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(JzpMybatisGeneratorApplication.class);
        app.run(args);
    }
}
