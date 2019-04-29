package com.demo.consumer;

import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Dubbo Registry ZooKeeper Consumer Bootstrap
 */
@SpringBootApplication
public class MyConsumerApplication {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(MyConsumerApplication.class);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> log.error(demoService.sayHello("World"));
    }

    @Bean
    public ApplicationRunner runner1() {
        return args -> log.error("{}", demoService.getPerson());
    }
}
