package com.example.springboot32.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncTaskExecutorService {

    @Async
    public void run() {
        System.out.println("i am called by :" + Thread.currentThread());
    }

}
