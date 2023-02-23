package com.kelvin.apisale.dto;

public class CategoriesDTO {
	private String CategoryID;
	private String CategoryName;
	private String Description;
	
	public CategoriesDTO(){
		
	}

	public String getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(String CategoryID) {
		this.CategoryID = (null == CategoryID) ? "" : CategoryID.trim();
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String CategoryName) {
		this.CategoryName = (null == CategoryName) ? "" : CategoryName.trim();
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = (null == Description) ? "" : Description.trim();
	}
	
}
