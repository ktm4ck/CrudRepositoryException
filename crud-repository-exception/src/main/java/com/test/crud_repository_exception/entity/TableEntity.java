package com.test.crud_repository_exception.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TABLE_ENTITY")
public class TableEntity {

	@Id
	@Column(name = "COL1")
	protected String col1;
	
	@Column(name = "COL2")
	protected String col2;

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
