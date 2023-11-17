package com.test1;

public class CorrespondantData {
	private Integer id;
	private String updateFlag;
	private String primaryFunction;
	private String accurateLocation;
	private boolean filter;
	private Integer currencyCode;
	private String ownerBrl;
	private String ownerBrlWoPad;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CorrespondantData() {

	}

	public CorrespondantData(Integer id, String updateFlag, String primaryFunction, String accurateLocation,
			boolean filter, Integer currencyCode, String ownerBrl, String ownerBrlWoPad, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.id = id;
		this.updateFlag = updateFlag;
		this.primaryFunction = primaryFunction;
		this.accurateLocation = accurateLocation;
		this.filter = filter;
		this.currencyCode = currencyCode;
		this.ownerBrl = ownerBrl;
		this.ownerBrlWoPad = ownerBrlWoPad;
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

	public String getUpdateFlag() {
		return updateFlag;
	}

	public void setUpdateFlag(String updateFlag) {
		this.updateFlag = updateFlag;
	}

	public String getPrimaryFunction() {
		return primaryFunction;
	}

	public void setPrimaryFunction(String primaryFunction) {
		this.primaryFunction = primaryFunction;
	}

	public String getAccurateLocation() {
		return accurateLocation;
	}

	public void setAccurateLocation(String accurateLocation) {
		this.accurateLocation = accurateLocation;
	}

	public boolean isFilter() {
		return filter;
	}

	public void setFilter(boolean filter) {
		this.filter = filter;
	}

	public Integer getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(Integer currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getOwnerBrl() {
		return ownerBrl;
	}

	public void setOwnerBrl(String ownerBrl) {
		this.ownerBrl = ownerBrl;
	}

	public String getOwnerBrlWoPad() {
		return ownerBrlWoPad;
	}

	public void setOwnerBrlWoPad(String ownerBrlWoPad) {
		this.ownerBrlWoPad = ownerBrlWoPad;
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
