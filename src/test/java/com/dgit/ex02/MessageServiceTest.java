package com.dgit.ex02;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dgit.domain.MessageVO;
import com.dgit.service.MessageService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MessageServiceTest {
	@Autowired
	private MessageService mService;
	
//	@Test
	public void addMessageTest() throws Exception{
		MessageVO vo = new MessageVO();
		vo.setSender("user00");
		vo.setMessage("user00이가 보냄");
		vo.setSenddate(new Date());
		vo.setTargetid("user01");
		
		mService.addMessage(vo);
	}
	
	@Test
	public void readMessageTest() throws Exception{
		mService.readMessage("user01", 3);
	}
	
}
