package com.demo.consumer;

import com.demo.consumer.dto.PersonDto;

/**
 * Demo Service interface
 *
 * @since 2.7.0
 */
public interface DemoService {

    String sayHello(String name);

    PersonDto getPerson();

}