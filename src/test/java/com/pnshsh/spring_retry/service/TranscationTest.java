package com.pnshsh.spring_retry.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pnshsh.spring_retry.BaseTest;

public class TranscationTest extends BaseTest {

	@Autowired
	private Transcation transcation;
	
	@Test
	public void testAdd() {
		transcation.add();
	}
}
