package com.pnshsh.spring_retry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pnshsh.spring_retry.bean.Man;
import com.pnshsh.spring_retry.mapper.ManMapper;

/**
 * 重试、事务整合
 * @author pnshsh
 *
 */
@EnableRetry
@Service
public class RetryTrans {

	@Autowired
	private ManMapper manMapper;
	
	/**
	 * 预期：重试5次，但数据库不增加新的数据
	 * 结果：与预期一致，说明重试与事务同时生效
	 */
	@Retryable(maxAttempts=5)
	@Transactional
	public void retryTrans() {
		
		System.out.println("test");
		
		Man man = new Man("秦远", "山西");
		
		manMapper.add(man);
		
		throw new RuntimeException();
		
	}
	
	/**
     * 重试失败之后，进行恢复，可以在此处再次抛出异常
     */
    @Recover
    public void recover(RuntimeException e) {
    	e.printStackTrace();
//    	throw e;
    }
}
