package com.bms.model;

import java.util.List;
import java.util.Map;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the Project Fixture Specification.
 *         </p>
 */
public class Fixture extends Specification {

	private static final long serialVersionUID = -5865070888174171505L;

	public Fixture() {
		super.setTitle("Fixtures");
	}

	public Fixture(String title, List<Map<String, List<String>>> items) {
		super.setTitle(title);
		super.setItems(items);
	}
}