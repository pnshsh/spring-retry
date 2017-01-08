package com.pnshsh.spring_retry.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pnshsh.spring_retry.BaseTest;

/**
 * Created by pnshsh on 2017/1/7.
 */
public class RetryTest extends BaseTest {

    @Autowired
    private Retry retry;

    @Test
    public void testRetry() {
        retry.print();
    }
}