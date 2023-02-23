package com.kelvin.apisale.dto;

public class EmployeesDTO {
	private String EmployeeID;
	private String LastName;
	private String FirstName;
	private String BirthDate;
	private String Notes;
	
	public EmployeesDTO() {
		
	}

	public String getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}

	public String getNotes() {
		return Notes;
	}

	public void setNotes(String notes) {
		Notes = notes;
	}
	
}
