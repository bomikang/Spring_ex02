package com.dgit.service;

import com.dgit.domain.MessageVO;

public interface MessageService {
	void addMessage(MessageVO vo) throws Exception;
	MessageVO readMessage(String uid, int mid) throws Exception;
	void updateState(int mid) throws Exception;
}
