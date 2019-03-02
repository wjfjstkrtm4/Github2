import java.util.Arrays;

import kr.or.bit.Emp;

class Test extends Object{
	void print() {
		System.out.println("�θ��Լ� _TEST");
	}
}

class Test2 extends Test {

	@Override
	void print() {
		System.out.println("�ڽ��Լ�_TEST2_������ ����");
	}
	
	void print(String s) { // �����ε�
		System.out.println("���� �����ε� �Դϴ�");
	}
}





public class Ex05_Inherit_override {

	public static void main(String[] args) {
		
		Test2 test = new Test2();
		test.print(); // �����ǵȰ� �ҷ�����
		test.print("�����ε�");
		
		System.out.println(test); // default�� toString()�� ������ ����
		System.out.println(test.toString());
		
		// Emp Ŭ�������� Object�� ������ toString() ������
		Emp e = new Emp(9999, "�ƹ���");
		String str = e.toString();
		System.out.println(str);
		
		// Arrays �̳༮�� Object�� ������ �ִ� toString()�� ������ �ߴ�
		int[] arr = {11,23,45,67,77};
		String result = Arrays.toString(arr);
		System.out.println(result);
		
		
		
	}

}
