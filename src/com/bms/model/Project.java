package com.bms.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.bms.helper.Constants.ProjectCategory;
import com.bms.helper.Constants.ProjectType;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents a BMS Project.
 *         </p>
 */
public class Project implements Serializable {

	private static final long serialVersionUID = 2730296478609537220L;

	private String name;

	private String overview;
	
	private List<Map<String, String>> highlights;

	private ProjectType type;

	private ProjectCategory category;

	private Address address;

	private Gallery gallery;

	private List<Specification> specificatons;
	
	private List<FloorPlan> floorPlans;
	private Panorama panorama;

	private List<Amenity> amenities;
	
	private List<String> approvals;//?? approval - status (valid/invalid)
	
	private List<TowerConstructionStatus> towerConstructionStatuses;
	
	private List<Review> reviews;
	
	private List<LocationVideo> locationVideos;

	private VirtualTour virtualTour;
	
	private PaymentPlan paymentPlan;

	private PriceList priceList;

	private Statistics statistics;
	
	private Builder builder;
	
	// what factors are need to be considered to define similarity between 2 projects.
	// is it price or size or location??
	private List<Project> similarProjects;

	public Project() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public ProjectType getType() {
		return type;
	}

	public void setType(ProjectType type) {
		this.type = type;
	}

	public ProjectCategory getCategory() {
		return category;
	}

	public void setCategory(ProjectCategory category) {
		this.category = category;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Map<String, String>> getHighlights() {
		return highlights;
	}

	public void setHighlights(List<Map<String, String>> highlights) {
		this.highlights = highlights;
	}

	public Gallery getGallery() {
		return gallery;
	}

	public void setGallery(Gallery gallery) {
		this.gallery = gallery;
	}

	public List<Specification> getSpecificatons() {
		return specificatons;
	}

	public void setSpecificatons(List<Specification> specificatons) {
		this.specificatons = specificatons;
	}

	public List<Amenity> getAmenities() {
		return amenities;
	}

	public void setAmenities(List<Amenity> amenities) {
		this.amenities = amenities;
	}

	public Panorama getPanorama() {
		return panorama;
	}

	public void setPanorama(Panorama panorama) {
		this.panorama = panorama;
	}

	public List<LocationVideo> getLocationVideos() {
		return locationVideos;
	}

	public void setLocationVideos(List<LocationVideo> locationVideos) {
		this.locationVideos = locationVideos;
	}

	public VirtualTour getVirtualTour() {
		return virtualTour;
	}

	public void setVirtualTour(VirtualTour virtualTour) {
		this.virtualTour = virtualTour;
	}

	public List<FloorPlan> getFloorPlans() {
		return floorPlans;
	}

	public void setFloorPlans(List<FloorPlan> floorPlans) {
		this.floorPlans = floorPlans;
	}

	public List<TowerConstructionStatus> getTowerConstructionStatuses() {
		return towerConstructionStatuses;
	}

	public void setTowerConstructionStatuses(
			List<TowerConstructionStatus> towerConstructionStatuses) {
		this.towerConstructionStatuses = towerConstructionStatuses;
	}

	public PaymentPlan getPaymentPlan() {
		return paymentPlan;
	}

	public void setPaymentPlan(PaymentPlan paymentPlan) {
		this.paymentPlan = paymentPlan;
	}

	public List<String> getApprovals() {
		return approvals;
	}

	public void setApprovals(List<String> approvals) {
		this.approvals = approvals;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public PriceList getPriceList() {
		return priceList;
	}

	public void setPriceList(PriceList priceList) {
		this.priceList = priceList;
	}

	public Statistics getStatistics() {
		return statistics;
	}

	public void setStatistics(Statistics statistics) {
		this.statistics = statistics;
	}

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	

}
