package com.yc.jarslink.service.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = {"com.yc.jarslink.service.demo"})
@ImportResource(locations = {"classpath*:META-INF/spring/springContext.xml"})
public class JarslinkDemo {
    public static void main(String[] args) {
        SpringApplication.run(JarslinkDemo.class, args);
    }
}