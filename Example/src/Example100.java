import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;

import kr.or.bit.Emp;

// Collection �������̽� �ֻ��� �θ�
// Today Kepoint



public class Example100 {

	public static void main(String[] args) {
		
	Emp e = new Emp(100, "������", "����");
	System.out.println(e.toString());
	
	
	Emp[] emplist = {new Emp(10, "�达", "IT"), new Emp(20, "�ھ�", "SALES")}; 
	
	for(Emp result : emplist) {
		System.out.println(result.toString());
	}
	
	ArrayList alist = new ArrayList();
	alist.add(new Emp(1, "�达", "IT"));
	alist.add(new Emp(2, "�̾�", "IT"));
	alist.add(new Emp(3, "�ھ�", "������"));
	
	System.out.println(alist.toString());
	
	for(Object obj : alist) {
		
		Emp emp = (Emp)obj;
		System.out.println(emp.toString());
	}
	
	}
	
	

}
