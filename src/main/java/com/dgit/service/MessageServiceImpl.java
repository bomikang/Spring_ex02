package com.dgit.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dgit.domain.MessageVO;
import com.dgit.persistence.MessageDao;
import com.dgit.persistence.PointDao;

@Service
public class MessageServiceImpl implements MessageService{
	@Inject
	private MessageDao mDao;
	@Inject
	private PointDao pDao;

	@Override
	@Transactional
	public void addMessage(MessageVO vo) throws Exception {
		/*메시지 보낸 후 보낸사람에게 포인트 증가*/
		mDao.create(vo);
		pDao.updatePoint(vo.getSender(), 10);
	}

	@Override
	public MessageVO readMessage(String uid, int mid) throws Exception {
		/*메시지를 읽으면 5포인트 추가*/
		mDao.updateState(mid);
		pDao.updatePoint(uid, 5);
		return mDao.readMessage(mid);
	}

	@Override
	public void updateState(int mid) throws Exception {
		mDao.updateState(mid);
	}

}
