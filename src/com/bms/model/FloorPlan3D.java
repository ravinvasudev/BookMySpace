package com.bms.model;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the 3D Floor Plan of Project.
 *         </p>
 */
public class FloorPlan3D extends FloorPlan {

	private static final long serialVersionUID = 8938911269756161241L;

	public FloorPlan3D() {
		super.setTitle("3D Floor Plan");
	}

	public FloorPlan3D(String title, String thumbnail, String url) {
		super.setTitle(title);
		super.setThumbnail(thumbnail);
		super.setUrl(url);
	}

}
