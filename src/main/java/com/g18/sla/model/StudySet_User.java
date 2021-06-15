package com.g18.sla.model;

import java.util.Date;

import com.g18.sla.entity.StudySet;
import com.g18.sla.entity.User;

public class StudySet_User {
	private User userId;
	private StudySet studySetId;
	private double progress;
	private double rating;
	private Date createDate;
	private Date updateDate;
	
	public StudySet_User() {}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public StudySet getStudySetId() {
		return studySetId;
	}

	public void setStudySetId(StudySet studySetId) {
		this.studySetId = studySetId;
	}

	public double getProgress() {
		return progress;
	}

	public void setProgress(double progress) {
		this.progress = progress;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
}
