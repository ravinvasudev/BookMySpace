package com.bms.model;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the 2D Floor Plan of Project.
 *         </p>
 */
public class FloorPlan2D extends FloorPlan {

	private static final long serialVersionUID = -4858264770828503101L;

	public FloorPlan2D() {
		super.setTitle("2D Floor Plan");
	}

	public FloorPlan2D(String title, String thumbnail, String url) {
		super.setTitle(title);
		super.setThumbnail(thumbnail);
		super.setUrl(url);
	}

}
