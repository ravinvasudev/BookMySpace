package com.bms.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the Tower Construction Status of Project.
 *         </p>
 */
public class TowerConstructionStatus implements Serializable {

	private static final long serialVersionUID = 5377450892985548781L;

	private String towerTitle;

	private List<String> highlights;

	private String imagePath;

	public TowerConstructionStatus() {

	}

	public String getTowerTitle() {
		return towerTitle;
	}

	public void setTowerTitle(String towerTitle) {
		this.towerTitle = towerTitle;
	}

	public List<String> getHighlights() {
		return highlights;
	}

	public void setHighlights(List<String> highlights) {
		this.highlights = highlights;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "TowerConstructionStatus [towerTitle=" + towerTitle
				+ ", highlights=" + highlights + ", imagePath=" + imagePath
				+ "]";
	}

}
