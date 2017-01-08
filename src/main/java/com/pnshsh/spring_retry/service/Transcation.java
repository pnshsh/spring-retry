package com.pnshsh.spring_retry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pnshsh.spring_retry.bean.Man;
import com.pnshsh.spring_retry.mapper.ManMapper;

@Service
public class Transcation {
	
	@Autowired
	private ManMapper manMapper;

	@Transactional
	public void add() {
		Man man = new Man("秦远", "山西");
		manMapper.add(man);
		throw new RuntimeException();
	}
}
