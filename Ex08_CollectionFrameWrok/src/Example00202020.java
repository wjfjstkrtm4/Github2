import java.util.ArrayList;

import kr.or.bit.Emp;

public class Example00202020 {

	public static void main(String[] args) {
	
		ArrayList<Emp> li = new ArrayList<Emp>();
		
		
		li.add(new Emp(10,  "�ƹ���", "���"));
		li.add(new Emp(20,  "������", "���"));
		li.add(new Emp(30,  "���ȱ�", "���"));
		
		for(Emp result : li) {
			System.out.println(result.getEmpno() + "/" + result.getEname() + "/" + result.getJob());
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
	}

}

