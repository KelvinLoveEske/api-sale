package com.kelvin.apisale.model.kelvindb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Categories {
	@Id
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="CategoryID")
	private String CategoryID;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="CategoryName")
	private String CategoryName;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="Description")
	private String Description;

	public String getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(String categoryID) {
		CategoryID = categoryID;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
}
