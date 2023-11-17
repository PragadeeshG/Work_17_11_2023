package com.test1;

public class CorrespondantDataDates {
	private Integer id;
	private String ownerBrl;
	private String brlEffectiveDate;
	private boolean brlExpired;
	private String brlSourcedDate;
	private String brlExposedDate;
	private String brlPublishedDate;
	private String brlConsumedDate;
	private String goLiveDate;
	private String oatCompletionDate;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CorrespondantDataDates() {

	}

	public CorrespondantDataDates(Integer id, String ownerBrl, String brlEffectiveDate, boolean brlExpired,
			String brlSourcedDate, String brlExposedDate, String brlPublishedDate, String brlConsumedDate,
			String goLiveDate, String oatCompletionDate, String creationDate, String modifiedDate, String entityState) {
		super();
		this.id = id;
		this.ownerBrl = ownerBrl;
		this.brlEffectiveDate = brlEffectiveDate;
		this.brlExpired = brlExpired;
		this.brlSourcedDate = brlSourcedDate;
		this.brlExposedDate = brlExposedDate;
		this.brlPublishedDate = brlPublishedDate;
		this.brlConsumedDate = brlConsumedDate;
		this.goLiveDate = goLiveDate;
		this.oatCompletionDate = oatCompletionDate;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOwnerBrl() {
		return ownerBrl;
	}

	public void setOwnerBrl(String ownerBrl) {
		this.ownerBrl = ownerBrl;
	}

	public String getBrlEffectiveDate() {
		return brlEffectiveDate;
	}

	public void setBrlEffectiveDate(String brlEffectiveDate) {
		this.brlEffectiveDate = brlEffectiveDate;
	}

	public boolean isBrlExpired() {
		return brlExpired;
	}

	public void setBrlExpired(boolean brlExpired) {
		this.brlExpired = brlExpired;
	}

	public String getBrlSourcedDate() {
		return brlSourcedDate;
	}

	public void setBrlSourcedDate(String brlSourcedDate) {
		this.brlSourcedDate = brlSourcedDate;
	}

	public String getBrlExposedDate() {
		return brlExposedDate;
	}

	public void setBrlExposedDate(String brlExposedDate) {
		this.brlExposedDate = brlExposedDate;
	}

	public String getBrlPublishedDate() {
		return brlPublishedDate;
	}

	public void setBrlPublishedDate(String brlPublishedDate) {
		this.brlPublishedDate = brlPublishedDate;
	}

	public String getBrlConsumedDate() {
		return brlConsumedDate;
	}

	public void setBrlConsumedDate(String brlConsumedDate) {
		this.brlConsumedDate = brlConsumedDate;
	}

	public String getGoLiveDate() {
		return goLiveDate;
	}

	public void setGoLiveDate(String goLiveDate) {
		this.goLiveDate = goLiveDate;
	}

	public String getOatCompletionDate() {
		return oatCompletionDate;
	}

	public void setOatCompletionDate(String oatCompletionDate) {
		this.oatCompletionDate = oatCompletionDate;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
