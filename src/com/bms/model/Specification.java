package com.bms.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the Project Specification.
 *         </p>
 */
public abstract class Specification implements Serializable {

	private static final long serialVersionUID = 570418792487037133L;

	private String title;

	private List<Map<String, List<String>>> items;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Map<String, List<String>>> getItems() {
		return items;
	}

	public void setItems(List<Map<String, List<String>>> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Specification [title=" + title + ", items=" + items + "]";
	}

}
