package com.kelvin.apisale.model.kelvindb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employees {
	@Id
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="EmployeeID")
	private String EmployeeID;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="LastName")
	private String LastName;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="FirstName")
	private String FirstName;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="BirthDate")
	private String BirthDate;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="Notes")
	private String Notes;

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
