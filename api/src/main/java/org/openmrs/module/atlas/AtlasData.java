/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.atlas;

import java.util.UUID;

/**
 * The AtlasData class is the form backing object for the atlas page. It contains all the data from
 * the atlas bubble and from the gutter.
 */
public class AtlasData {
	
	private UUID id;
	
	/* Bubble data */
	private String name;
	
	private String imageURL;
	
	private Double latitude;
	
	private Double longitude;
	
	private Integer zoom;
	
	private String website;
	
	//contact details
	private String contactName;
	
	private String contactEmailAddress;
	
	private String notes;
	
	//statistics
	private Boolean includeNumberOfPatients;
	
	private Boolean includeNumberOfObservations;
	
	private Boolean includeNumberOfEncounters;
	
	/* /Bubble data */
	private String numberOfPatients;
	
	private String numberOfObservations;
	
	private String numberOfEncounters;
	
	
	private Boolean usageDisclamerAccepted;
	
	private Boolean moduleEnabled;
	
	private Boolean includeSystemConfiguration;
	
	private Integer implementationType;
	
	private Boolean isDirty;
	
	public AtlasData() {
		this.contactEmailAddress = "";
		this.contactName = "";
		this.id = null;
		this.name = "";
		this.imageURL = "";
		this.includeNumberOfObservations = false;
		this.includeNumberOfPatients = false;
		this.includeNumberOfEncounters = false;
		this.latitude = 0.0;
		this.longitude = 0.0;
		this.website = "";
		this.numberOfObservations = "?";
		this.numberOfPatients = "?";
		this.numberOfEncounters = "?";
		this.notes = "";
		this.includeSystemConfiguration = true;
		this.usageDisclamerAccepted = false;
		this.moduleEnabled = false;
		this.implementationType = 0;
		this.zoom = 3;
		this.isDirty = true;
	}
	
	/**
	 * @param id The implementation's ID
	 * @param name The implementation's name
	 * @param website The implementation's web site
	 * @param imageURL The implementation's image URL
	 * @param latitude The latitude component of the implementation's position
	 * @param longitude The longitude component of the implementation's position
	 * @param contactName The contact name
	 * @param contactEmailAddress The contact email address
	 * @param includeNumberOfPatients True if you want to include the number of non-voided patients,
	 *            false otherwise
	 * @param includeNumberOfObservations True if you want to include the number of non-voided
	 *            observations, false otherwise
	 * @param includeNumberOfEncounters True if you want to include the number of non-voided
	 *            encounters, false otherwise
	 */
	public AtlasData(UUID id, String name, String website, String imageURL, Double latitude, Double longitude,
	    String contactName, String contactEmailAddress, Boolean includeNumberOfPatients,
	    Boolean includeNumberOfObservations, Boolean includeNumberOfEncounters) {
		this.contactEmailAddress = contactEmailAddress;
		this.contactName = contactName;
		this.id = id;
		this.name = name;
		this.imageURL = imageURL;
		this.includeNumberOfObservations = includeNumberOfObservations;
		this.includeNumberOfPatients = includeNumberOfPatients;
		this.includeNumberOfEncounters = includeNumberOfEncounters;
		this.latitude = latitude;
		this.longitude = longitude;
		this.website = website;
	}
	
	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(UUID id) {
		this.id = id;
	}
	
	/**
	 * @return the contactEmailAddress
	 */
	public String getContactEmailAddress() {
		return contactEmailAddress;
	}
	
	/**
	 * @param contactEmailAddress the contactEmailAddress to set
	 */
	public void setContactEmailAddress(String contactEmailAddress) {
		this.contactEmailAddress = contactEmailAddress;
	}
	
	/**
	 * @return the contactPhoneNumber
	 */
	public String getContactName() {
		return contactName;
	}
	
	/**
	 * @param contactPhoneNumber the contactPhoneNumber to set
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	/**
	 * @return the includeNumberOfObservations
	 */
	public Boolean getIncludeNumberOfObservations() {
		return includeNumberOfObservations;
	}
	
	/**
	 * @param includeNumberOfObservations the includeNumberOfObservations to set
	 */
	public void setIncludeNumberOfObservations(Boolean includeNumberOfObservations) {
		this.includeNumberOfObservations = includeNumberOfObservations;
	}
	
	/**
	 * @return the includeNumberOfPatients
	 */
	public Boolean getIncludeNumberOfPatients() {
		return includeNumberOfPatients;
	}
	
	/**
	 * @param includeNumberOfPatients the includeNumberOfPatients to set
	 */
	public void setIncludeNumberOfPatients(Boolean includeNumberOfPatients) {
		this.includeNumberOfPatients = includeNumberOfPatients;
	}
	
	/**
	 * @return the includeNumberOfVisits
	 */
	public Boolean getIncludeNumberOfEncounters() {
		return includeNumberOfEncounters;
	}
	
	/**
	 * @param includeNumberOfVisits the includeNumberOfVisits to set
	 */
	public void setIncludeNumberOfEncounters(Boolean includeNumberOfEncounters) {
		this.includeNumberOfEncounters = includeNumberOfEncounters;
	}
	
	/**
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}
	
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	/**
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}
	
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	/**
	 * @return the zoom
	 */
	public Integer getZoom() {
		return zoom;
	}
	
	/**
	 * @param zoom the zoom to set
	 */
	public void setZoom(Integer zoom) {
		this.zoom = zoom;
	}
	
	/**
	 * @return the name of the implementation
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the implementation name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}
	
	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}
	
	/**
	 * @return the numberOfObservations
	 */
	public String getNumberOfObservations() {
		return numberOfObservations;
	}
	
	/**
	 * @param numberOfObservations the numberOfObservations to set
	 */
	public void setNumberOfObservations(String numberOfObservations) {
		this.numberOfObservations = numberOfObservations;
	}
	
	/**
	 * @return the numberOfPatients
	 */
	public String getNumberOfPatients() {
		return numberOfPatients;
	}
	
	/**
	 * @param numberOfPatients the numberOfPatients to set
	 */
	public void setNumberOfPatients(String numberOfPatients) {
		this.numberOfPatients = numberOfPatients;
	}
	
	/**
	 * @return the numberOfVisits
	 */
	public String getNumberOfEncounters() {
		return numberOfEncounters;
	}
	
	/**
	 * @param numberOfVisits the numberOfVisits to set
	 */
	public void setNumberOfEncounters(String numberOfEncounters) {
		this.numberOfEncounters = numberOfEncounters;
	}
	
	/**
	 * @return the imageURL
	 */
	public String getImageURL() {
		return imageURL;
	}
	
	/**
	 * @param imageURL the imageURL to set
	 */
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
	/**
	 * @return the implementationType
	 */
	public Integer getImplementationType() {
		return implementationType;
	}
	
	/**
	 * @param implementationType the implementationType to set
	 */
	public void setImplementationType(Integer implementationType) {
		this.implementationType = implementationType;
	}
	
	/**
	 * @return the includeSystemConfiguration
	 */
	public Boolean getIncludeSystemConfiguration() {
		return includeSystemConfiguration;
	}
	
	/**
	 * @param includeSystemConfiguration the includeSystemConfiguration to set
	 */
	public void setIncludeSystemConfiguration(Boolean includeSystemConfiguration) {
		this.includeSystemConfiguration = includeSystemConfiguration;
	}
	
	/**
	 * @return the moduleEnabled
	 */
	public Boolean getModuleEnabled() {
		return moduleEnabled;
	}
	
	/**
	 * @param moduleEnabled the moduleEnabled to set
	 */
	public void setModuleEnabled(Boolean moduleEnabled) {
		this.moduleEnabled = moduleEnabled;
	}
	
	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}
	
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	/**
	 * @return the usageDisclamerAccepted
	 */
	public Boolean getUsageDisclamerAccepted() {
		return usageDisclamerAccepted;
	}
	
	/**
	 * @param usageDisclamerAccepted the usageDisclamerAccepted to set
	 */
	public void setUsageDisclamerAccepted(Boolean usageDisclamerAccepted) {
		this.usageDisclamerAccepted = usageDisclamerAccepted;
	}
	
	/**
	 * @return the isDirty
	 */
	public Boolean getIsDirty() {
		return isDirty;
	}
	
	/**
	 * @param isDirty the isDirty to set
	 */
	public void setIsDirty(Boolean isDirty) {
		this.isDirty = isDirty;
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String text = "";
		text = "Atlast Data" + "\nID: " + id + "||" + "\nName: " + name + "\nImplementation type: " + implementationType
		        + "||" + "\nWebsite: " + website + "||" + "\nImageURL: " + imageURL + "||" + "\nLatitude: " + latitude
		        + "||" + "\nLongitude: " + longitude + "||" + "\nContact Name: " + contactName + "||" + "\nContact Email: "
		        + contactEmailAddress + "||" + "\nNotes: " + notes + "||" + "\nInclude nr of patients: "
		        + includeNumberOfPatients.toString() + "||" + "\nInclude nr of observations: "
		        + includeNumberOfObservations.toString() + "||" + "\nInclude nr of visits: "
		        + includeNumberOfEncounters.toString() + "||" + "\nNr of patients: " + numberOfPatients + "||"
		        + "\nNr of observations: " + numberOfObservations + "||" + "\nNr of visits: " + numberOfEncounters + "||"
		        + "\nUsage disclamer accepted: " + usageDisclamerAccepted + "||" + "\nInclude System Configuration: "
		        + includeSystemConfiguration + "||" + "\nModule is enabled: " + moduleEnabled + "||";
		
		return text;
	}
	
	/**
	 * Method that returns enumeration of implementation types as a string array
	 * 
	 * @return Enumeration of implementation types as a string array
	 */
	public String[] getImplementationTypes() {
		String[] impTypes = new String[ImplementationType.values().length];
		int i = 0;
		for (ImplementationType type : ImplementationType.values()) {
			impTypes[i] = type.toString();
			i++;
		}
		return impTypes;
	}
}
