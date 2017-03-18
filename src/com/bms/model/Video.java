package com.bms.model;

import java.io.Serializable;

public class Video implements Serializable {

	private static final long serialVersionUID = 2614209499882600110L;

	private String title;

	private String description;

	private String thumbnail;

	private String url;

	public Video() {

	}

	public Video(String title, String description, String thumbnail, String url) {
		super();
		this.title = title;
		this.description = description;
		this.thumbnail = thumbnail;
		this.url = url;
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
		return "Video [title=" + title + ", description=" + description
				+ ", thumbnail=" + thumbnail + ", url=" + url + "]";
	}

}
