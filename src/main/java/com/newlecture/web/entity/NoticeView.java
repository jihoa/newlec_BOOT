package com.newlecture.web.entity;

import java.util.Date;

public class NoticeView extends Notice {

	private String memberName;

	public NoticeView(int id, String title, String content, Date regdate, int hit, boolean pub, int memberid) {
		super(id, title, content, regdate, hit, pub, memberid);
		this.memberName = memberName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "NoticeView [memberName=" + memberName + ", getMemberid()=" + getMemberid() + ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getContent()=" + getContent() + ", getRegdate()=" + getRegdate()
				+ ", getHit()=" + getHit() + ", isPub()=" + isPub() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}
