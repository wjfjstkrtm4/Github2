import java.util.ArrayList;
import java.util.List;

/*
 
�⺻Ÿ�� (8����) : �� Ÿ�� : JAVA API
8���� �⺻Ÿ�Կ� ���ؼ� [��ü ����]�� ��� �����ϵ��� ���� Ŭ����
ex) void run(Integer i)

*�⺻�� Ÿ�Ե� ���δ� ��ü���·� �ٷ������ �ϴ� ��찡 �ִ�
1. �Ű������� ��üŸ���� �䱸�ɶ�
2. �⺻�� ���� �ƴ� ��üŸ�� ����Ǿ�� �Ҷ�
3. ��ü���� �񱳰� �ʿ��Ҷ�
4. wrapper Ŭ������ (Ÿ������ : �ּ�ũ��, �ִ�ũ��)

�̶� 8���� �⺻Ÿ�Կ� ���� wrapper Ŭ���� ���
 */

public class Ex10_wrapper_Class {

	public static void main(String[] args) {
		int i = 100;

		Integer n = new Integer(500); // Integer (int Ÿ��) wrapper Ŭ����
		System.out.println("i : " + i);
		System.out.println("�ּ� (������)n : " + n.toString());

		// ArrayList<int> li = new ArrayList<int>(); // ���ʸ��ȿ��� ��ü������ ���� ���⶧���� Integer�� �������
		
		ArrayList<Integer> li = new ArrayList<Integer>(); // POINT
		li.add(100);
		li.add(200);

		for (int r : li) {
			System.out.println(r);
		}

		Integer i3 = new Integer(100);
		Integer i4 = new Integer(100);
		System.out.println(i3 == i4); // �ּҰ� �� false
		System.out.println(i3.equals(i4));
		// equals �� IntegerŬ������ ������ �ߴ� (���� ��)

		Integer t = new Integer(500); // ��������
		intergerMethod(t);
		intMethod(t);
	}

	static void intergerMethod(Integer i) {
		System.out.println("Integer param : " + i);
	}
	
	static void intMethod(int i) {
		System.out.println("int param : " + i);
	}
	
}
