package com.bms.model;

import java.io.Serializable;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the Project Address.
 *         </p>
 */
public class Address implements Serializable {

	private static final long serialVersionUID = -689212323142307812L;

	private String plotNumber;

	private String streetName;

	private String roadName;

	private String city;

	private String pincode;

	private String state;

	private String landmark;

	private String locationMap;

	public Address() {

	}

	public String getPlotNumber() {
		return plotNumber;
	}

	public void setPlotNumber(String plotNumber) {
		this.plotNumber = plotNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getLocationMap() {
		return locationMap;
	}

	public void setLocationMap(String locationMap) {
		this.locationMap = locationMap;
	}

	@Override
	public String toString() {
		return String
				.format("Address [plotNumber=%s, streetName=%s, roadName=%s, city=%s, pincode=%s, state=%s, landmark=%s, locationMap=%s]",
						plotNumber, streetName, roadName, city, pincode, state,
						landmark, locationMap);
	}
}
