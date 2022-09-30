package com.masai.dao;

import com.masai.bean.Criminals;

public interface CriminalsDao {

	public String registerCriminals(String Name,String Age,String Gender,String criminal_address,String Identifying_marks,String Arrested_place,
			String Arrested_date,String crime_type);
	
	public String registerCriminals2(Criminals Criminals);
	
	public Criminals getCriminalsbycriminal_id(int criminal_id );
}
