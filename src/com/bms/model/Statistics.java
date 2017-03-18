package com.bms.model;

import java.io.Serializable;
import java.util.Calendar;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the Project Statistics.
 *         </p>
 */
public class Statistics implements Serializable {

	private static final long serialVersionUID = -6216768993327652064L;

	private String subscriptionCount;

	private String viewCount;

	private String shortlistCount;

	private String favoriteCount;

	private Calendar lastSold;

	private Calendar lastUpdated;

	private BMSScore bmsScore;

	public Statistics() {

	}

	public String getSubscriptionCount() {
		return subscriptionCount;
	}

	public void setSubscriptionCount(String subscriptionCount) {
		this.subscriptionCount = subscriptionCount;
	}

	public String getViewCount() {
		return viewCount;
	}

	public void setViewCount(String viewCount) {
		this.viewCount = viewCount;
	}

	public String getShortlistCount() {
		return shortlistCount;
	}

	public void setShortlistCount(String shortlistCount) {
		this.shortlistCount = shortlistCount;
	}

	public String getFavoriteCount() {
		return favoriteCount;
	}

	public void setFavoriteCount(String favoriteCount) {
		this.favoriteCount = favoriteCount;
	}

	public Calendar getLastSold() {
		return lastSold;
	}

	public void setLastSold(Calendar lastSold) {
		this.lastSold = lastSold;
	}

	public Calendar getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Calendar lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public BMSScore getBmsScore() {
		return bmsScore;
	}

	public void setBmsScore(BMSScore bmsScore) {
		this.bmsScore = bmsScore;
	}

	@Override
	public String toString() {
		return String
				.format("Statistics [subscriptionCount=%s, viewCount=%s, shortlistCount=%s, favoriteCount=%s, lastSold=%s, lastUpdated=%s, bmsScore=%s]",
						subscriptionCount, viewCount, shortlistCount,
						favoriteCount, lastSold, lastUpdated, bmsScore);
	}

}
