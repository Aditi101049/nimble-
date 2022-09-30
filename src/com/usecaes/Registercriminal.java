package com.usecaes;

import java.util.Scanner;

import com.masai.dao.CriminalsDaoImpl;

public class Registercriminal {

	//private static final String N = null;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Criminal Name:");
		String cName=sc.next();
		
		System.out.println("Enter Criminal Age:");
		String cAge=sc.next();
		
		System.out.println("Enter Criminal Gender:");
		String cGender=sc.next();
		
		System.out.println("Enter Criminal criminal_address:");
		String ccriminal_address=sc.next();
		
		System.out.println("Enter Criminal Identifying_marks:");
		String cIdentifying_marks=sc.next();
		
		System.out.println("Enter Criminal Arrested_place:");
		String cArrested_place=sc.next();
		
		System.out.println("Enter Criminal Arrested_date:");
		String cArrested_date=sc.next();
		
		System.out.println("Enter Criminal crime_type:");
		String ccrime_type=sc.next();
		
		
		
		CriminalsDaoImpl dao=new CriminalsDaoImpl();
		String result= dao.registerCriminals(cName, cAge, cGender, ccriminal_address, cIdentifying_marks, cArrested_place, cArrested_date, ccrime_type);
		System.out.println(result);
	}

}
