package com.pnshsh.spring_retry.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pnshsh.spring_retry.BaseTest;

public class RetryTransTest extends BaseTest {

	@Autowired
	private RetryTrans reTrans;
	
	@Test
	public void testRT() {
		reTrans.retryTrans();
	}
}
