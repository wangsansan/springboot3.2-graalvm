package com.example.springboot32.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchedulerService {

    @Scheduled(fixedDelayString = "1500")
    public void run() {
        System.out.println("schedule i am called by :" + Thread.currentThread());
    }

    public static void main(String[] args) throws Exception {
        long start1 = System.currentTimeMillis();
        System.out.println("start1:" + start1);
        int count = 1000;
        List<Long> virtualList = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            Thread.ofVirtual().start(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(50);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    virtualList.add(System.currentTimeMillis() - start1);
                }
            });
        }
        long start2 = System.currentTimeMillis();
        List<Long> platformList = new ArrayList<>(count);
        System.out.println("start2:" + start2);
        for (int i = 0; i < count; i++) {
            Thread.ofPlatform().start(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(50);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    platformList.add(System.currentTimeMillis() - start2);
                }
            });
        }
        Thread.sleep(10000);
        System.out.println(virtualList.stream().max(Long::compareTo));
        System.out.println(platformList.stream().max(Long::compareTo));
    }
}
