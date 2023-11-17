package com.test1;

public class CorrespondantDataFilter {
	private Integer id;
	private String ownerBrl;
	private String filter1Name;
	private boolean filter1Applicable;
	private String filter1description;
	private String filter1value;
	private String filter2Name;
	private String filter2Applicable;
	private String filter2Description;
	private String filter2Value;
	private String activeFilter;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CorrespondantDataFilter() {

	}

	public CorrespondantDataFilter(Integer id, String ownerBrl, String filter1Name, boolean filter1Applicable,
			String filter1description, String filter1value, String filter2Name, String filter2Applicable,
			String filter2Description, String filter2Value, String activeFilter, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.id = id;
		this.ownerBrl = ownerBrl;
		this.filter1Name = filter1Name;
		this.filter1Applicable = filter1Applicable;
		this.filter1description = filter1description;
		this.filter1value = filter1value;
		this.filter2Name = filter2Name;
		this.filter2Applicable = filter2Applicable;
		this.filter2Description = filter2Description;
		this.filter2Value = filter2Value;
		this.activeFilter = activeFilter;
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

	public String getFilter1Name() {
		return filter1Name;
	}

	public void setFilter1Name(String filter1Name) {
		this.filter1Name = filter1Name;
	}

	public boolean isFilter1Applicable() {
		return filter1Applicable;
	}

	public void setFilter1Applicable(boolean filter1Applicable) {
		this.filter1Applicable = filter1Applicable;
	}

	public String getFilter1description() {
		return filter1description;
	}

	public void setFilter1description(String filter1description) {
		this.filter1description = filter1description;
	}

	public String getFilter1value() {
		return filter1value;
	}

	public void setFilter1value(String filter1value) {
		this.filter1value = filter1value;
	}

	public String getFilter2Name() {
		return filter2Name;
	}

	public void setFilter2Name(String filter2Name) {
		this.filter2Name = filter2Name;
	}

	public String getFilter2Applicable() {
		return filter2Applicable;
	}

	public void setFilter2Applicable(String filter2Applicable) {
		this.filter2Applicable = filter2Applicable;
	}

	public String getFilter2Description() {
		return filter2Description;
	}

	public void setFilter2Description(String filter2Description) {
		this.filter2Description = filter2Description;
	}

	public String getFilter2Value() {
		return filter2Value;
	}

	public void setFilter2Value(String filter2Value) {
		this.filter2Value = filter2Value;
	}

	public String getActiveFilter() {
		return activeFilter;
	}

	public void setActiveFilter(String activeFilter) {
		this.activeFilter = activeFilter;
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
