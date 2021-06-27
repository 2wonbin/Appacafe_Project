package com.wb.appacafe.persitence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wb.mapper.TimeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/application-context.xml")
public class TimeMapperTest {
	
	@Autowired
	private TimeMapper timeMapper;

	@Test
	public void testGetTime1() {
		System.out.println("test1 = " + timeMapper.getTime1());
	}
	
	@Test
	public void testGetTime2() {
		System.out.println("test2 = " + timeMapper.getTime2());
	}
}
