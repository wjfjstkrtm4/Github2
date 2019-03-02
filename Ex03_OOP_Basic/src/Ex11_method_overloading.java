/*
��ü ���� ��� Ư¡
���, ĸ��ȭ, ������

ĸ��ȭ (����ȭ) -> private


[method overloading]
[�ϳ��� �̸�]���� [�������� ���]�� �ϴ� �Լ�
�ϳ��� Ŭ������ ���� �̸��� �޼ҵ带 ������ �����ϴ°� 
��� : System.out.println() ��ǥ���� ��
Ư¡ : �����ε��� ������� ������ ���� �ʴ´�
	  why? : ���ϰ� �����(���) >> ������
	  ����� � ���� ��� : �Լ��� Ȱ���� ���� ���
 
���� : �Լ��� �̸��� ���� parameter�� ������ Ÿ���� �޸��ϴ� ���
1. �Լ��� �̸��� ���ƾ� �Ѵ�
2. [parameter] ������ �Ǵ� [Type]�� �޶�� �Ѵ�
3. return Type �� overloading�� �Ǵܱ����� �ƴϴ�
4. parameter ������ �ٸ��� ���� ...
*/


class Human {
	
	String name;
	int age;
	

}

class OverTest {
	int add(int i) {
		return 100 + i;
	}
	
	String add(String s) {
		return "hello" +s;
		
	}
	
	// void add(int k) {}// parameter type �浹
	
	int add(int i, int j) { // ������ �ٸ��Ƿ� �����ε����� ����
		return i + j;
	}
	
	void add(int i, String s) {
		System.out.println("�����ε�");
	}
	
	void add(String s, int i) { // parameter�� ������ �ٸ��Ƿ� �����ε����� ����
		System.out.println("���� ���� : overloading ");
	}
	
	void add(Human h) { // class == Type
		h.name = "ȫ�浿";
		h.age = 100;
		System.out.println(h);
		

	}
	
	
	
	
	
	
	
	// �迭(Array) �������
	// �����߱� ....
	// int[] source = {1, 2, 3, 4, 5};
	int[] add(int[] param) { // parameter�� int �迭�� �ּҰ��� �ްڴ�
		
		int[] target = new int[param.length];
		for(int i = 0; i<param.length; i++) {
			target[i] = param[i]+1;
		}
		
		return target; // int Ÿ���� �迭�� �ּҰ��� return
	
	}
	
	
	int[] add(int[] so, int[] so2) {
		
		int[] result = new int[so.length];
		int[] result2 = new int[so2.length];
		
		for(int i = 0; i<so.length; i++) {
			for(int j = 0; j<so2.length; j++) {
			so[i] = so[i] + so2[j];
			
		
			}		
	}

		return result;
		


	
}

}





public class Ex11_method_overloading {

	public static void main(String[] args) {
		
//		OverTest ot = new OverTest();
//		
//		
//		System.out.println(ot.add(100));
//		//ot.add(3.1f); // add(flaot f) ����(x)
//		ot.add(100, "H");
//		
//		Human human = new Human();
//		ot.add(human);
//		System.out.println(human.name);
//		System.out.println(human.age);
//		
//
//		ot.add(new Human());
		
		
		OverTest ot = new OverTest();
		// intŸ�� �迭�� �ּҰ��� �־�� ������ ����
		int[] source = {10, 20, 30, 40, 50};
		System.out.println(source);
		int[] target = ot.add(source); // source �� �ּҰ��� [I@15db9742 �ּҰ�
		
		for(int i = 0; i<target.length; i++) {
			System.out.println(target[i]);
			
		}
		
		OverTest ot2 = new OverTest();
		
		int[] so = {10,20,30,40,50};
		int[] so2 = {20,30,40,50,60};
		
		int[] result = ot2.add(so, so2);
		
		for(int i = 0; i<so.length; i++) {
			
			System.out.printf("[%d]", so[i]);
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
