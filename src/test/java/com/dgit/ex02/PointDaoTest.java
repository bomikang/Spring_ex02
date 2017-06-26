package com.dgit.ex02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dgit.persistence.PointDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class PointDaoTest {
	@Autowired
	private PointDao dao;
	
	@Test
	public void updatePointTest() throws Exception{
		dao.updatePoint("user00", 10);
	}
}
