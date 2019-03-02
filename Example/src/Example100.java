import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;

import kr.or.bit.Emp;

// Collection ÀÎÅÍÆäÀÌ½º ÃÖ»óÀ§ ºÎ¸ð
// Today Kepoint



public class Example100 {

	public static void main(String[] args) {
		
	Emp e = new Emp(100, "±èÀ¯½Å", "±ºÀÎ");
	System.out.println(e.toString());
	
	
	Emp[] emplist = {new Emp(10, "±è¾¾", "IT"), new Emp(20, "¹Ú¾¾", "SALES")}; 
	
	for(Emp result : emplist) {
		System.out.println(result.toString());
	}
	
	ArrayList alist = new ArrayList();
	alist.add(new Emp(1, "±è¾¾", "IT"));
	alist.add(new Emp(2, "ÀÌ¾¾", "IT"));
	alist.add(new Emp(3, "¹Ú¾¾", "¿µ¾÷ºÎ"));
	
	System.out.println(alist.toString());
	
	for(Object obj : alist) {
		
		Emp emp = (Emp)obj;
		System.out.println(emp.toString());
	}
	
	}
	
	

}
