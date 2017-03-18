package com.bms.model;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the Location Video of Project.
 *         </p>
 */
public class LocationVideo extends Video {

	private static final long serialVersionUID = 2198584610101742513L;

	public LocationVideo() {

	}

	public LocationVideo(String title, String description, String thumbnail, String url) {
		super.setTitle(title);
		super.setDescription(description);
		super.setThumbnail(thumbnail);
		super.setUrl(url);
	}

}
