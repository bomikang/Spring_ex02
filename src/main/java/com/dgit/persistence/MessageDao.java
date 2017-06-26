package com.dgit.persistence;

import com.dgit.domain.MessageVO;

public interface MessageDao {
	void create(MessageVO vo) throws Exception;
	MessageVO readMessage(int mid) throws Exception;
	void updateState(int mid) throws Exception;
}
