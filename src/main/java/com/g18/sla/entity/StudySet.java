package com.g18.sla.entity;

import com.g18.sla.model.INode;

public class StudySet implements INode{
	private String studySetId;
	private User userId;
	private String title;
	private String description;
	private String tag;
	private boolean isPublic;
	
	
	public StudySet() {}

	public String getStudySetId() {
		return studySetId;
	}

	public void setStudySetId(String studySetId) {
		this.studySetId = studySetId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	
	
}
