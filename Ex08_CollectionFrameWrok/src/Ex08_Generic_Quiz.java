import java.util.ArrayList;
import java.util.Iterator;

import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;

public class Ex08_Generic_Quiz {

	public static void main(String[] args) {
	
		
		// 1��
		ArrayList<Emp> li = new ArrayList<Emp>();

		li.add(new Emp(10, "������", "���"));
		li.add(new Emp(20, "����", "���"));
		li.add(new Emp(30, "����", "���"));
		
		// 2��
		
		for(Emp result : li) {
			System.out.println("�����ȣ : " + result.getEmpno() + " / " + "�̸� : " + result.getEname() + " / " + "���� : " + result.getJob());
			
		}
		
		// 3��
		
		for(int i = 0; i< li.size(); i++) {
			Emp result = li.get(i);
			System.out.println("�����ȣ : " + result.getEmpno() + " / " + "�̸� : " + result.getEname() + " / " + "���� : " + result.getJob());
		}
		
		
		// 4��
		
		ArrayList<CopyEmp> li2 = new ArrayList<CopyEmp>();
		
		
		
		li2.add(new CopyEmp(100, "��", 1000));
		li2.add(new CopyEmp(200, "��", 2000));
		li2.add(new CopyEmp(300, "��", 3000));
		
		for(CopyEmp result : li2) {
			System.out.println("�����ȣ : " + result.getEmpno() + " / " + "�̸� : " + result.getEname() + " / " + "�� : " + result.getSal());
		}
		
		for(int i = 0; i< li2.size(); i++) {
			CopyEmp result = li2.get(i);
			if(li2.get(1).getSal() == 2000) {
				li2.get(1).setSal(5000);
			}
				System.out.println("�����ȣ : " + result.getEmpno() + " / " + "�̸� : " + result.getEname() + " / " + "�� : " + result.getSal());
			
		}
		
		// 6��.  300�� ����� �̸��� "�ñ���"�� �����ؼ� ����ϼ��� (������ for�� �ȿ���)
		
		for(CopyEmp result : li2) {
			if(result.getEmpno() ==300) {
				result.setEname("�ñ���");
			}
			System.out.println("�����ȣ : " + result.getEmpno() + " / " + "�̸� : " + result.getEname() + " / " + "�� : " + result.getSal());
		}
		
		 // 7. ��������� Iterator �������̽��� ����ؼ� ����ϼ���
		
		Iterator it = li2.iterator(); // li2.iterator() �Լ��� hasNext(), next()�� ����Ҽ��ִ� ����� ����������
		
		while(it.hasNext()) {
			CopyEmp e = (CopyEmp) it.next(); // ���ʷ��� �����ʾұ⶧���� object��ȿ� ���� ����Ǿ��ִ°� �ٿ�ĳ���ýἭ ���ٰ����ϰ��Ѵ�
												// it.next()�� �ּҰ��� �����´�
			System.out.println(e.getEmpno() + "," + e.getEname() + "," + e.getSal());
		}
		
		
		// 1. Emp Ŭ������ ����ؼ� ��� 3���� �����ϼ���
		// �� ArrayList ���ʸ��� ����ϼ���
		
		// 2. 3���� ��� ����(���, �̸�, ����) ������ for���� ����ؼ� ����ϼ���
		// �� toString()�� ��� ����
		
		// 3. 3���� ��� ����(���, �̸�, ����) �Ϲ� for���� ����ؼ� ����ϼ���
		// �� toString()�� ��� ����
		
		// 4. CopyEmp ��� Ŭ������ ���弼�� (������ Emp�� ������)
		// job member filed ��ſ�
		// private int sal �߰��ϰ� (getter, setter ����)
		// ArrayList ���ʸ� ����ؼ� ��� 3�� ���弼��
		// �Ʒ� ������
		// 100, "��", 1000
		// 200, "��", 2000
		// 300, "��", 3000
		
		// 5 . 200�� ����� �޿��� 5000���� �����ؼ� ����ϼ���
		// �Ϲ� for�� ����ϱ�
		
		// 6��.  300�� ����� �̸��� "�ñ���"�� �����ؼ� ����ϼ��� (������ for�� �ȿ���)
		
		 // 7. ��������� Iterator �������̽��� ����ؼ� ����ϼ���

	}

}

/*
import java.util.ArrayList;

import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;

public class Ex08_Generic_Quiz {

	public static void main(String[] args) {
		//1. Emp Ŭ������ ����ؼ� ��� 3���� �����ϼ���
		//�� ArrayList ���ʸ��� ����ϼ���
		//�����ʹ� ���Ͻ� ���� ....
		ArrayList<Emp> emplist = new ArrayList<>();
		emplist.add(new Emp(1000,"�达","IT"));
		emplist.add(new Emp(2000,"�ھ�","SALES"));
		emplist.add(new Emp(3000,"�̾�","MANAGER"));
		
		//2. 3���� ��� ����(��� , �̸� , ����)�� ������  for���� ����ؼ� ����ϼ���
		//�� toString() ������
		 for(Emp emp : emplist) {
			 System.out.println(emp.getEmpno()+"/"+
		                        emp.getEname()+"/"+
					 			emp.getJob());
		 }
		
		//3. 3���� ��� ����(��� , �̸� , ����)�� ������  �Ϲ�for���� ����ؼ� ����ϼ���
		//�� toString() ������
		 for(int i = 0 ; i < emplist.size() ; i++) {
				System.out.println(emplist.get(i).getEmpno() +"/"+
								   emplist.get(i).getEname() +"/"+
						           emplist.get(i).getJob());
			}
		
		//4. CopyEmp ��� Ŭ������ ���弼�� (������ Emp �� ������)
		//job member field ��ſ� 
		//private int sal �߰��ϰ�  (getter , setter ����)
		//ArrayList ���ʸ� ����ؼ� ��� 3�� ���弼��
		//�Ʒ� ������
		//100 , "��" , 1000
		//200 , "��" , 2000
		//300 , "��" , 3000
		 ArrayList<CopyEmp> clist = new ArrayList<CopyEmp>();
		 	clist.add(new CopyEmp(100,"��",1000));
			clist.add(new CopyEmp(200,"��",2000));
			clist.add(new CopyEmp(300,"��",3000));
		//5.200�� ����� �޿��� 5000���� �����ؼ� ����ϼ��� (�Ϲ� for�� ����ϼ���)
		for(int i = 0 ; i < clist.size() ; i++) {
			if(clist.get(i).getEmpno() == 200) {
				clist.get(i).setSal(5000);
				System.out.println(clist.get(i).toString());
			}
		}
		
		//6.300�� ����� �̸��� "�ñ���" �� �����ؼ� ����ϼ���(������ for�� �ȿ��� ....)
		 for(CopyEmp emp : clist) {
			 if(emp.getEmpno() == 300) {
				 emp.setEname("�ñ���");
				 System.out.println(emp.toString());
			 }
		 }
		 
		
		  
		  
	}

}
*/
