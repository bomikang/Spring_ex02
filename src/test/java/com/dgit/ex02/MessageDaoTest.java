package com.dgit.ex02;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dgit.domain.MessageVO;
import com.dgit.persistence.MessageDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MessageDaoTest {
	@Autowired
	private MessageDao dao;
	
//	@Test
	public void createTest() throws Exception{
		MessageVO vo = new MessageVO();
		vo.setSender("user01");
		vo.setSenddate(new Date());
		vo.setTargetid("user00");
		vo.setMessage("강보미가 썻다");
		dao.create(vo);
	}
	
	//@Test
	public void readMessageTest() throws Exception{
		dao.readMessage(1);
	}
	
	@Test
	public void updateStateTest() throws Exception{
		dao.updateState(3);
	}
}
