package com.bms.model;

import java.util.List;
import java.util.Map;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the Project Door Specification.
 *         </p>
 */
public class Door extends Specification {

	private static final long serialVersionUID = -2064669744845993451L;

	public Door() {
		super.setTitle("Doors");
	}

	public Door(String title, List<Map<String, List<String>>> items) {
		super.setTitle(title);
		super.setItems(items);
	}

}
