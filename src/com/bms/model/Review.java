package com.bms.model;

import java.util.Calendar;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the Project review.
 *         </p>
 */
public class Review {

	private Reviewer reviewer;

	private Calendar reviewDate;

	private Calendar purchaseDate;

	private String content;

	public Review() {

	}

	public Reviewer getReviewer() {
		return reviewer;
	}

	public void setReviewer(Reviewer reviewer) {
		this.reviewer = reviewer;
	}

	public Calendar getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Calendar reviewDate) {
		this.reviewDate = reviewDate;
	}

	public Calendar getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Calendar purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return String
				.format("Review [reviewer=%s, reviewDate=%s, purchaseDate=%s, content=%s]",
						reviewer, reviewDate, purchaseDate, content);
	}

}
