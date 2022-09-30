package com.usecaes;

import java.util.Scanner;

import com.masai.bean.Criminals;
//import com.masai.bean.Criminals;
import com.masai.dao.CriminalsDaoImpl;

public class Registercriminal2 {

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
		
		Criminals Criminals=new Criminals();
		
		Criminals.setName(cName);
		Criminals.setName( cAge);
		
		Criminals.setName(cGender);
		Criminals.setName(ccriminal_address);
		Criminals.setName(cIdentifying_marks);
		Criminals.setName(cArrested_place);
		Criminals.setName(cArrested_date);
		Criminals.setName(ccrime_type);
		
		
		
		String result= dao.registerCriminals2(Criminals);
		System.out.println(result);
	}

}
