package com.pnshsh.spring_retry.service;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class Retry {

    @Retryable(maxAttempts=5)
    public void print() {
        System.out.println("test");
        throw new RuntimeException("重试失败");
    }
    
    /**
     * 重试失败之后，进行恢复，可以在此处再次抛出异常
     */
    @Recover
    public void recover(RuntimeException e) {
    	System.err.println(e);
    }
}
