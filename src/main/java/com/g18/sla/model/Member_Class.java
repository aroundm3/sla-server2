package com.g18.sla.model;

import java.util.Date;

import com.g18.sla.entity.Class;
import com.g18.sla.entity.User;

public class Member_Class {
	private User userId;
	private Class classId;
	private boolean isMember;
	private Date enrolledDate;
	
	public Member_Class() {}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Class getClassId() {
		return classId;
	}

	public void setClassId(Class classId) {
		this.classId = classId;
	}

	public boolean isMember() {
		return isMember;
	}

	public void setMember(boolean isMember) {
		this.isMember = isMember;
	}

	public Date getEnrolledDate() {
		return enrolledDate;
	}

	public void setEnrolledDate(Date enrolledDate) {
		this.enrolledDate = enrolledDate;
	}
	
}
