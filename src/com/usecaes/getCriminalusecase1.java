gipackage com.usecaes;

import java.util.Scanner;

import com.masai.bean.Criminals;
import com.masai.dao.CriminalsDao;
import com.masai.dao.CriminalsDaoImpl;

public class getCriminalusecase1 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Criminal id:");
		int criminal_id= sc.nextInt();
		
		CriminalsDao dao=new CriminalsDaoImpl();
		
		Criminals Criminals=dao.getCriminalsbycriminal_id(criminal_id);
		if(Criminals !=null)
			System.out.println(Criminals);
	}

}
