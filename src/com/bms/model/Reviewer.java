package com.bms.model;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the Reviewer.
 *         </p>
 */
public class Reviewer extends User {

	private static final long serialVersionUID = 3828178790943834672L;

	private String profession;

	public Reviewer() {

	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return String.format("Reviewer [profession=%s, User=%s]",
										profession, super.toString());
	}	

}
