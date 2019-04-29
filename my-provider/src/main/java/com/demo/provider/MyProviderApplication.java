package com.demo.provider;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Dubbo Registry ZooKeeper Provider Bootstrap
 *
 * @see DefaultDemoService
 * @since 2.7.0
 */
@EnableAutoConfiguration
public class MyProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MyProviderApplication.class).run(args);
    }
}
