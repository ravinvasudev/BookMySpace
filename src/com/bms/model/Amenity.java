package com.bms.model;

import java.io.Serializable;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the Project Amenity.
 *         </p>
 */
public class Amenity implements Serializable {

	private static final long serialVersionUID = -8963808227413246809L;

	private String name;

	private String description;

	private String cssClass;

	public Amenity() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCssClass() {
		return cssClass;
	}

	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}

	@Override
	public String toString() {
		return "Amenity [name=" + name + ", description=" + description
				+ ", cssClass=" + cssClass + "]";
	}

}
