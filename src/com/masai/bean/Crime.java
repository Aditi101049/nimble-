package com.masai.bean;


import java.sql.Date;
import java.time.LocalDate;

public class Crime {

	private Date crime_date;
	private String crime_description;
	private String crime_detailDescription;
	private String crime_place;
	private String status;
	
	public Crime() {
		
	}

	public Crime(Date crime_date, String crime_description, String crime_detailDescription, String crime_place,
			String status) {
		super();
		this.crime_date = crime_date;
		this.crime_description = crime_description;
		this.crime_detailDescription =crime_detailDescription;
		this.crime_place = crime_place;
		this.status = status;
	}

	public Date getCrime_date() {
		return crime_date;
	}

	public void setCrime_date(Date crime_date) {
		this.crime_date = crime_date;
	}

	public String getCrime_description() {
		return crime_description;
	}

	public void setCrime_description(String crime_description) {
		this.crime_description = crime_description;
	}

	public String getCrime_detailDescription() {
		return crime_detailDescription;
	}

	public void setCrime_detailDescription(String crime_detailDescription) {
		this.crime_detailDescription = crime_detailDescription;
	}

	public String getCrime_place() {
		return crime_place;
	}

	public void setCrime_place(String crime_place) {
		this.crime_place = crime_place;
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Crime [crime_date=" + crime_date + ", crime_description=" + crime_description + ", crime_detailDescription=" + crime_detailDescription
				+ ", crime_place=" +crime_place + ", status=" + status + "]";
	}
	
}
