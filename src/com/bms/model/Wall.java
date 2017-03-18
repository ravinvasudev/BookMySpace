package com.bms.model;

import java.util.List;
import java.util.Map;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the Project Wall Specification.
 *         </p>
 */
public class Wall extends Specification {

	private static final long serialVersionUID = 3966247618056132591L;

	public Wall() {
		super.setTitle("Walls");
	}

	public Wall(String title, List<Map<String, List<String>>> items) {
		super.setTitle(title);
		super.setItems(items);
	}
}
