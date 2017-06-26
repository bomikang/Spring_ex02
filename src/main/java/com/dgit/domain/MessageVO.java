package com.dgit.domain;

import java.util.Date;

public class MessageVO {
	private int mid; //메시지 아이디
	private String targetid; //받는 사람
	private String sender; //보내는 사람
	private String message; //메시지 내용
	private Date opendate; //읽은 날짜
	private Date senddate; //보낸 날짜
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getTargetid() {
		return targetid;
	}
	public void setTargetid(String targetid) {
		this.targetid = targetid;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getOpendate() {
		return opendate;
	}
	public void setOpendate(Date opendate) {
		this.opendate = opendate;
	}
	public Date getSenddate() {
		return senddate;
	}
	public void setSenddate(Date senddate) {
		this.senddate = senddate;
	}
	
	@Override
	public String toString() {
		return "MessageVO [mid=" + mid + ", targetid=" + targetid + ", sender=" + sender + ", message=" + message
				+ ", opendate=" + opendate + ", senddate=" + senddate + "]";
	}
	
	
}
