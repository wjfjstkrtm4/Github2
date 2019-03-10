import java.util.ArrayList;
import java.util.List;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object_KeyPoint {

	public static void main(String[] args) {
		
		// 1. ��� 1���� ������ ��������
		Emp e = new Emp(100, "������", "����");
		System.out.println(e.toString());
		
		// 2. ��� 2���� ������ �������� (�����迭)
		Emp[] emplist = {new Emp(10, "�达", "IT"), new Emp(20, "�ھ�", "SALES")};
		
		for(Emp emp : emplist) {
			System.out.println(emp.toString());
		}
		// ���� for���� ����ϸ� �ٷ� ���� �� ������

		System.out.println("********");
		for(int i = 0; i < emplist.length; i++) {
		System.out.println(emplist[i].toString());
			
		}
		// emplist���� emp��ü 2���� �ּҰ� ���ְ�
		// emplist[0], emplist[1]° �ּҿ� �����ؼ� toString���� ����Ѱ�
		// �׳� for���� ����� ��쿡�� �� ���ŷӴ�
		
		// �Ǽ� �߾�� .. �Ѹ��� �Ի縦 �� �߾�� ...
		// �� ���� �迭�� �߰��ϴ°� �Ұ��ϴ�(x) -> ���� new ... (x)
		
		// ����(ArrayList)
		
		ArrayList alist = new ArrayList();
		alist.add(new Emp(1, "�达", "IT"));
		alist.add(new Emp(2, "�̾�", "IT"));
		alist.add(new Emp(3, "�ھ�", "������"));
		
		System.out.println(alist.toString());
		
		// �Ϲ� for���� ����ؼ� ��������� ����ϼ��� (down casting)
		
		for(int i = 0; i < alist.size(); i++) {
			// System.out.println(alist.get(i).toString());
			Emp emp = (Emp)alist.get(i); // get�Լ��� return�� object��    �ڽ�Ÿ�� = (�ڽ�Ÿ��)�θ�Ÿ��
										// ������ �ּҸ� ������ ����Ѵ�
			System.out.println(emp.getEmpno() + "/" + emp.getEname() + "/" + emp.getJob());
		}
		// ������ for��
		
		for(Object obj : alist) {
			Emp emp = (Emp)obj;
			System.out.println(emp.getEmpno() + "/" + emp.getEname() + "/" + emp.getJob());
		}
		
		// ����� .... �� �ڵ尡 �����ؿ� (Object)
		// generic (�������� ...99%)
		
		ArrayList<Emp> alist2 = new ArrayList<Emp>();
		
		alist2.add(new Emp(1, "A", "IT"));
		alist2.add(new Emp(2, "B", "IT"));
		
		for(Emp obj : alist2) {
			System.out.println(obj.getEmpno() + "/" + obj.getEname() + "/" + obj.getJob());
		}

	}

}
