package com.bms.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the Project Gallery.
 *         </p>
 */
public class Gallery implements Serializable {

	private static final long serialVersionUID = -7829387781342364110L;

	private List<Photo> photos;

	public Gallery() {

	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	public class Photo {

		private String photoName;

		private String photoDescription;

		private String photoPath;

		public String getPhotoName() {
			return photoName;
		}

		public void setPhotoName(String photoName) {
			this.photoName = photoName;
		}

		public String getPhotoDescription() {
			return photoDescription;
		}

		public void setPhotoDescription(String photoDescription) {
			this.photoDescription = photoDescription;
		}

		public String getPhotoPath() {
			return photoPath;
		}

		public void setPhotoPath(String photoPath) {
			this.photoPath = photoPath;
		}

		@Override
		public String toString() {
			return "Photo [photoName=" + photoName + ", photoDescription="
					+ photoDescription + ", photoPath=" + photoPath + "]";
		}
	}

	@Override
	public String toString() {
		return "Gallery [photos=" + photos + "]";
	}

}
