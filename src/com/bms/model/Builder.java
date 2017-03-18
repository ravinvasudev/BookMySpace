package com.bms.model;

public class Builder {

	private String name;

	private String description;

	private Address address;

	private String reputation;

	public Builder() {

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getReputation() {
		return reputation;
	}

	public void setReputation(String reputation) {
		this.reputation = reputation;
	}

	@Override
	public String toString() {
		return String.format(
				"Builder [name=%s, description=%s, address=%s, reputation=%s]",
				name, description, address, reputation);
	}

}
