package com.bms.model;

import java.util.List;
import java.util.Map;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the Project Flooring Specification.
 *         </p>
 */
public class Flooring extends Specification {

	private static final long serialVersionUID = -6953838906230899575L;

	public Flooring() {
		super.setTitle("Flooring");
	}

	public Flooring(String title, List<Map<String, List<String>>> items) {
		super.setTitle(title);
		super.setItems(items);
	}

}
