package com.masai.bean;

public class Criminals {

	private int criminal_id;
	private String Name;
	private String Age;
	private String Gender;
	private String criminal_address;
	private String Identifying_marks;
	private String Arrested_place;
	private String Arrested_date;
	private String crime_type;
	
   public Criminals() {
	   
   }

public Criminals(int criminal_id, String name, String age, String gender, String criminal_address,
		String identifying_marks, String arrested_place, String arrested_date, String crime_type) {
	super();
	this.criminal_id = criminal_id;
	this.Name = name;
	this.Age = age;
	this.Gender = gender;
	this.criminal_address = criminal_address;
	this.Identifying_marks = identifying_marks;
	this.Arrested_place = arrested_place;
	this.Arrested_date = arrested_date;
	this.crime_type = crime_type;
}

/**
 * @return the criminal_id
 */
public int getCriminal_id() {
	return criminal_id;
}

/**
 * @param criminal_id the criminal_id to set
 */
public void setCriminal_id(int criminal_id) {
	this.criminal_id = criminal_id;
}

/**
 * @return the name
 */
public String getName() {
	return Name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	Name = name;
}

/**
 * @return the age
 */
public String getAge() {
	return Age;
}

/**
 * @param age the age to set
 */
public void setAge(String age) {
	Age = age;
}

/**
 * @return the gender
 */
public String getGender() {
	return Gender;
}

/**
 * @param gender the gender to set
 */
public void setGender(String gender) {
	Gender = gender;
}

/**
 * @return the criminal_address
 */
public String getCriminal_address() {
	return criminal_address;
}

/**
 * @param criminal_address the criminal_address to set
 */
public void setCriminal_address(String criminal_address) {
	this.criminal_address = criminal_address;
}

/**
 * @return the identifying_marks
 */
public String getIdentifying_marks() {
	return Identifying_marks;
}

/**
 * @param identifying_marks the identifying_marks to set
 */
public void setIdentifying_marks(String identifying_marks) {
	Identifying_marks = identifying_marks;
}

/**
 * @return the arrested_place
 */
public String getArrested_place() {
	return Arrested_place;
}

/**
 * @param arrested_place the arrested_place to set
 */
public void setArrested_place(String arrested_place) {
	Arrested_place = arrested_place;
}

/**
 * @return the arrested_date
 */
public String getArrested_date() {
	return Arrested_date;
}

/**
 * @param arrested_date the arrested_date to set
 */
public void setArrested_date(String arrested_date) {
	Arrested_date = arrested_date;
}


public String getCrime_type() {
	return crime_type;
}

public void setCrime_type(String crime_type) {
	this.crime_type = crime_type;
}

@Override
public String toString() {
	return "Criminals [criminal_id=" + criminal_id + ", Name=" + Name + ", Age=" + Age + ", Gender=" + Gender
			+ ", criminal_address=" + criminal_address + ", Identifying_marks=" + Identifying_marks
			+ ", Arrested_place=" + Arrested_place + ", Arrested_date=" + Arrested_date + ", crime_type=" + crime_type
			+ "]";
}


	   
   
}
