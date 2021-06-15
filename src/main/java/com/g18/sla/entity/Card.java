package com.g18.sla.entity;

public class Card {
	private String cardId;
	private StudySet studySetId;
	private String front;
	private String back;

	
	public Card() {}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getFront() {
		return front;
	}

	public void setFront(String front) {
		this.front = front;
	}

	public String getBack() {
		return back;
	}

	public void setBack(String back) {
		this.back = back;
	}

	public StudySet getStudySetId() {
		return studySetId;
	}

	public void setStudySetId(StudySet studySetId) {
		this.studySetId = studySetId;
	}
	
	
}
