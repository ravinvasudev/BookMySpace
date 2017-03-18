package com.bms.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the Search.
 *         </p>
 */
public final class SearchResult implements Serializable {

	private static final long serialVersionUID = -5793393454347530339L;

	private String title;

	private String subTitle;

	private String description;

	private List<Map<String, String>> highlights;

	private String url;

	public SearchResult() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Map<String, String>> getHighlights() {
		return highlights;
	}

	public void setHighlights(List<Map<String, String>> highlights) {
		this.highlights = highlights;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
