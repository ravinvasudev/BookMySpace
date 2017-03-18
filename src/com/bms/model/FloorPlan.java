package com.bms.model;

import java.io.Serializable;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the Floor Plan of Project.
 *         </p>
 */
public abstract class FloorPlan implements Serializable {

	private static final long serialVersionUID = -5101627275374503158L;

	private String title;

	private String thumbnail;

	private String url;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "FloorPlan [title=" + title + ", thumbnail=" + thumbnail
				+ ", url=" + url + "]";
	}

}
