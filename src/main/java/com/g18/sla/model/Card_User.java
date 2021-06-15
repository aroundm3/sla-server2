package com.g18.sla.model;

import com.g18.sla.entity.Card;
import com.g18.sla.entity.User;

public class Card_User {
	private Card cardId;
	private User userId;

	private Integer quality;
	private double interval;
	private double eFactor;
	private String status;
	private boolean isBookmarked;
	private String hint;
	private String learnDate;
	
	public Card_User() {}

	public Card getCardId() {
		return cardId;
	}

	public void setCardId(Card cardId) {
		this.cardId = cardId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public String getLearnDate() {
		return learnDate;
	}

	public void setLearnDate(String learnDate) {
		this.learnDate = learnDate;
	}

	public Integer getQuality() {
		return quality;
	}

	public void setQuality(Integer quality) {
		this.quality = quality;
	}

	public double getInterval() {
		return interval;
	}

	public void setInterval(double interval) {
		this.interval = interval;
	}

	public double geteFactor() {
		return eFactor;
	}

	public void seteFactor(double eFactor) {
		this.eFactor = eFactor;
	}

	public boolean isBookmarked() {
		return isBookmarked;
	}

	public void setBookmarked(boolean isBookmarked) {
		this.isBookmarked = isBookmarked;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}
	
	
	
}
