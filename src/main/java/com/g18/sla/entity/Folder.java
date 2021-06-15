package com.g18.sla.entity;

import java.util.Date;

import com.g18.sla.model.INode;

public class Folder implements INode{
	private Node nodeId;
	private User adminId;
	private String title;
	private String description;
	private Date createdDate;
	private Date updateDate;
	
	
	public Folder() {}

	public Node getNodeId() {
		return nodeId;
	}

	public void setNodeId(Node nodeId) {
		this.nodeId = nodeId;
	}

	public User getAdminId() {
		return adminId;
	}


	public void setAdminId(User adminId) {
		this.adminId = adminId;
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


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public Date getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}
