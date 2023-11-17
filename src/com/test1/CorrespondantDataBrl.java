package com.test1;

public class CorrespondantDataBrl {
	private Integer id;
	private String ownerBrl;
	private String brlLocation;
	private Integer brlAccountNumber;
	private String holderBrl;
	private Integer holderAccountNumber;
	private String preferredCurrency;
	private String furtherBrl;
	private String furterAccountNumber;
	private String effectiveDate;
	private String brlFilter;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CorrespondantDataBrl() {

	}

	public CorrespondantDataBrl(Integer id, String ownerBrl, String brlLocation, Integer brlAccountNumber,
			String holderBrl, Integer holderAccountNumber, String preferredCurrency, String furtherBrl,
			String furterAccountNumber, String effectiveDate, String brlFilter, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.id = id;
		this.ownerBrl = ownerBrl;
		this.brlLocation = brlLocation;
		this.brlAccountNumber = brlAccountNumber;
		this.holderBrl = holderBrl;
		this.holderAccountNumber = holderAccountNumber;
		this.preferredCurrency = preferredCurrency;
		this.furtherBrl = furtherBrl;
		this.furterAccountNumber = furterAccountNumber;
		this.effectiveDate = effectiveDate;
		this.brlFilter = brlFilter;
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

	public String getBrlLocation() {
		return brlLocation;
	}

	public void setBrlLocation(String brlLocation) {
		this.brlLocation = brlLocation;
	}

	public Integer getBrlAccountNumber() {
		return brlAccountNumber;
	}

	public void setBrlAccountNumber(Integer brlAccountNumber) {
		this.brlAccountNumber = brlAccountNumber;
	}

	public String getHolderBrl() {
		return holderBrl;
	}

	public void setHolderBrl(String holderBrl) {
		this.holderBrl = holderBrl;
	}

	public Integer getHolderAccountNumber() {
		return holderAccountNumber;
	}

	public void setHolderAccountNumber(Integer holderAccountNumber) {
		this.holderAccountNumber = holderAccountNumber;
	}

	public String getPreferredCurrency() {
		return preferredCurrency;
	}

	public void setPreferredCurrency(String preferredCurrency) {
		this.preferredCurrency = preferredCurrency;
	}

	public String getFurtherBrl() {
		return furtherBrl;
	}

	public void setFurtherBrl(String furtherBrl) {
		this.furtherBrl = furtherBrl;
	}

	public String getFurterAccountNumber() {
		return furterAccountNumber;
	}

	public void setFurterAccountNumber(String furterAccountNumber) {
		this.furterAccountNumber = furterAccountNumber;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getBrlFilter() {
		return brlFilter;
	}

	public void setBrlFilter(String brlFilter) {
		this.brlFilter = brlFilter;
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
