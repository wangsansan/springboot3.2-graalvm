package com.example.springboot32.controller;

import com.example.springboot32.service.AsyncTaskExecutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private AsyncTaskExecutorService asyncTaskExecutorService;

    @GetMapping
    public void test() {
        asyncTaskExecutorService.run();
        System.out.println("Hello, World!");
    }

}
