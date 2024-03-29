package com.example.springboot2.yang.demo;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

    /**
     * 开启异步支持
     * @param i
     */
    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务: " + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1: " + (i + 1));
    }
}
