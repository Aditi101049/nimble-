package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.bean.Criminals;
import com.masai.utility.DBIUtil;

public class CriminalsDaoImpl implements CriminalsDao {

	@Override
	public String registerCriminals(String Name, String Age, String Gender, String criminal_address,
			String Identifying_marks, String Arrested_place, String Arrested_date, String crime_type) {
		// TODO Auto-generated method stub
		
		String message="not found...";
		
		//Connection conn=DBIUtil.provideConnection();
		
		try(Connection conn=DBIUtil.provideConnection()) {
			
		PreparedStatement ps=conn.prepareStatement("insert into criminals(Name,Age,Gender,criminal_address,Identifying_marks,Arrested_place,Arrested_date,crime_type) value(?,?,?,?,?,?,?,?)");
			
		
		
		ps.setString(1, Name);
		ps.setString(2, Age);
		ps.setString(3, Gender);
		ps.setString(4, criminal_address);
		ps.setString(5, Identifying_marks);
		ps.setString(6, Arrested_place);
		ps.setString(7, Arrested_date);
		ps.setString(8, crime_type);
		
		int x=ps.executeUpdate();
		
		if(x>0)
		
		message= "criminal data found sucessfully  !!!!";
			
		}catch(SQLException e) {
			message=e.getMessage();
		}
		return message;
	}

	@Override
	public String registerCriminals2(Criminals Criminals) {
String message="not found...";
		
		//Connection conn=DBIUtil.provideConnection();
		
		try(Connection conn=DBIUtil.provideConnection()) {
			
		PreparedStatement ps=conn.prepareStatement("insert into criminals(Name,Age,Gender,criminal_address,Identifying_marks,Arrested_place,Arrested_date,crime_type) value(?,?,?,?,?,?,?,?)");
			
		
		
		ps.setString(1, Criminals.getName());
		ps.setString(2, Criminals.getAge());
		ps.setString(3, Criminals.getGender());
		ps.setString(4, Criminals.getCriminal_address());
		ps.setString(5, Criminals.getIdentifying_marks());
		ps.setString(6, Criminals.getArrested_place());
		ps.setString(7, Criminals.getArrested_date());
		ps.setString(8, Criminals.getCrime_type());
		
		int x=ps.executeUpdate();
		
		if(x>0)
		
		message= "criminal data found sucessfully  !!!!";
			
		}catch(SQLException e) {
			message=e.getMessage();
		}
		return message;

	}

	@Override
	public Criminals getCriminalsbycriminal_id(int criminal_id) {
		Criminals Criminals=null;
		try(Connection conn=DBIUtil.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select * from Criminals where roll=?");
		
		ps.setInt(1,criminal_id);
		
		
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			
			int r=rs.getInt("criminal_id");
			String n=rs.getString("Name");
			String a=rs.getString("Age");
			String g=rs.getString("Gender");
			String ca=rs.getString("criminal_address");
			String im=rs.getString("Identifying_marks");
			String ap=rs.getString("Arrested_place");
			
			String ad=rs.getString("Arrested_date");
			String ct=rs.getString("crime_type");
			
			
			Criminals=new Criminals(r,n,a,g,ca,im,ap,ad,ct);
		}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return Criminals;
		
	}

	

}
