import kr.or.bit.Emp;

// Array ���� ���� �߿��� �κ��� : ��ü�迭
// [�ǹ����� ���� ���� ���̴ϱ�]
public class Ex05_Object_Array {

	public static void main(String[] args) {
		// ���Ի�� 3���� ���弼��
		// Array ����� �ʾҾ��
		// Emp e = new Emp();
		// Emp e2 = new Emp();
		// Emp e3= new Emp();
		
		Emp[] emplist = new Emp[3];
		emplist[0] = new Emp(); // 0��°���� �ּҰ�
		emplist[0].setEmpno(1000);
		emplist[0].setEname("������");
	
		
		emplist[1] = new Emp(2000, "�ƹ���"); // 1��°���� �ּҰ�
		emplist[2] = new Emp(3000, "������");
		
		
		
		for(int i = 0; i<emplist.length; i++) {
			emplist[i].empInfo();
		}
		
		// 3���� Emp Ÿ���� �迭�� ����� ������ �濡 ��ü�� �ּҰ� �Ҵ�
		// int[] arr = new int[] {10, 20, 30}
		
		Emp[] emplist2 = new Emp[] {new Emp(1, "�̾�"), new Emp(2, "�ھ�"), new Emp(3, "�达")};
		

		for(int i = 0; i<emplist2.length; i++) {
			emplist2[i].empInfo();	
		}
		
		// int[] arr = {10, 20, 30};
		
		Emp[] emplist3 = {new Emp(111, "A"), new Emp(222, "B")};
		for(int i = 0; i<emplist3.length; i++) {
			emplist3[i].empInfo();	
		}
		
	}

}
