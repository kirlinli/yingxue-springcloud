package com.baizhi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author ljl
 * @Date: 2022/7/22 23:32
 * @Version 1.0
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    public String test() {
        log.info("admin hello");
        return "admin 是的";
    }
}
