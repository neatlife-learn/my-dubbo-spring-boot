package com.demo.provider;

import com.demo.consumer.dto.PersonDto;
import org.apache.dubbo.config.annotation.Service;
import com.demo.consumer.DemoService;
import org.springframework.beans.factory.annotation.Value;

/**
 * Default {@link DemoService}
 *
 * @see DemoService
 * @since 2.7.0
 */
@Service(version = "${demo.service.version}")
public class DefaultDemoService implements DemoService {

    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }

    @Override
    public PersonDto getPerson() {
        PersonDto personDto = new PersonDto();
        personDto.setName("小明");
        personDto.setAge(20);
        return personDto;
    }
}