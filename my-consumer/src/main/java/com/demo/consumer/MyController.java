package com.demo.consumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.dubbo.config.annotation.Reference;

/**
 * @author suxiaolin
 * @date 2019-04-29 15:21
 */
@RestController
@RequestMapping("test")
public class MyController {

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    @GetMapping("/test1")
    public String test1() {
        return demoService.getPerson().toString();
    }
}
