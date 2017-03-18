package com.bms.model;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the 360 degree Floor Plan of Project.
 *         </p>
 */
public class FloorPlan360 extends FloorPlan {

	private static final long serialVersionUID = -6386374132357949382L;

	public FloorPlan360() {
		super.setTitle("360 Floor Plan");
	}

	public FloorPlan360(String title, String thumbnail, String url) {
		super.setTitle(title);
		super.setThumbnail(thumbnail);
		super.setUrl(url);
	}

}
