package com.test.crud_repository_exception.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name = "TABLE_ENTITY")
public class TableEntity {

	@Id
	@Column(name = "COL1")
	protected String col1;
	
	@Column(name = "COL2")
	protected String col2;
	
	@Column(name = "STATE_IND")
	protected Long stateInd;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "END_DATE")
	protected Date endDate;

	public Long getStateInd() {
		return stateInd;
	}

	public void setStateInd(Long stateInd) {
		this.stateInd = stateInd;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCol1() {
		return col1;
	}

	public void setCol1(String col1) {
		this.col1 = col1;
	}

	public String getCol2() {
		return col2;
	}

	public void setCol2(String col2) {
		this.col2 = col2;
	}
	
	
}
