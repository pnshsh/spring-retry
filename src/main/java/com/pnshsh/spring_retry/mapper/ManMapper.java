package com.pnshsh.spring_retry.mapper;

import org.springframework.stereotype.Repository;

import com.pnshsh.spring_retry.bean.Man;

@Repository
public interface ManMapper {

	public int add(Man man);
}
