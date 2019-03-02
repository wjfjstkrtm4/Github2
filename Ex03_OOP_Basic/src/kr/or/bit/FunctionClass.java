package kr.or.bit;
/*
�Լ� : ����� �ּ� ���� (method)

�Լ��� ����
* void (�����ִ� ���� ����) : return value �� ���� ^^
* return Type : [8���� �⺻Ÿ��] + String + ����� ���� Ŭ���� + Array + Collection + Interface
* �Լ��� return Type(ex public int calc() {return 100;} �ִٸ�
* �ݵ�� { ����� } �ȿ� return �̶�� ������ ������ �־���Ѵ�
* parameter : [8���� �⺻Ÿ��] + String + ����� ���� Ŭ���� + Array + Collection + Interface 


1. void , parameter(0) public void print(String str){ System.out.println(str)}
2. void, parameter(x) public void print(){System.out.println("hello")}
3. return Type, parameter(0) public int call(int i){return i + 100;}
4. return Type, parameter(x) public int call(){return 1000;} 

�Լ�(method) �ݵ�� ȣ��(call) �Ǿ�� �����Ѵ� : .....
 */

public class FunctionClass {

	public void m() { // �Լ��� �̸��� �ǹ� �ִ� �ܾ��� �����̾�� �Ѵ� : getChnnelNumber()
		System.out.println("�Ϲ��Լ� : void, parameter(x)");
	
	}
	
	public void m2(int i) {
		System.out.println("parameter value : " + i);
		System.out.println("�Ϲ��Լ� : void, parameter(o)");
	}
	
	public int m3() { // ���� m3 �Լ��� ȣ���ϸ� 100�̶�� ���� ���� ���� �� �ִ�
		return 100;
	}
	
	public int m4(int data) {
		return data + 100;
	}
	

	// ������(������) : private �Լ�
	// � �ǹ��� �ڵ� : class ���ο��� ���(�ٸ� �Լ��� �����ٶ�)
	// �ٸ� �������� �Լ��� ������ �������� ������ �Ѱ��� �Լ��� ��Ƽ� �������
	// �������� (����) ����
	private int operationMethod(int data) {
		return data * 100;
	}
	
	public int sum(int data) {
		return operationMethod(data); // ������ �ڵ�
	}
	
	public int sum2(int data) {
		int result = operationMethod(data);
		return result;
	}
	
	// Ȯ���Լ� (parameter ���� ������)
	public int sum3(int i, int j, int k) {
		return i + j + k; // ������ ������ �״��....
	}
	
	// Quiz
	// a �� b ���߿� ū ���� return �ϴ� �Լ��� ���弼��
	
	int max = 0;
	public int max(int a, int b) {
		// ȣ��: max(100, 3) --> return 100
		// if(a>b) {
		// 	max = a;
		// } else {
		//	max = b;
		// }
		// return max;
		return (a>b) ? a :b;
		
		//int max = a > b ? a :b;
		//return max;
		
		// a>b ? a : b
	}
	
	public String concat(String s, String s2, String s3) {
		return s + "/" + s2 + "/" + s3;
		
	}
	
	// ��������� ���� ���Դϴ�
	// Ŭ���� == Ÿ���̴� (Tv t; t = new Tv(); �ʱ�ȭ
	
	 // public int call() {return 100;}
	 // public Tv call() { Tv t = new Tv(); return t;}
	 // public Tv call() { return new Tv(); }
	 
	
	// public void call(Tv t) { System.out.println(t.name)}
	
	// Tv tt = new Tv();
	// tt.name = "�Ｚ";
	// call(tt);
	
	public Tv objMethod() { // Tv Ÿ���� ���� �ּҰ��� �����Ѵ�
		Tv aa = new Tv(); // heap ��ü ����� �ּҰ� aa�� �Ҵ�
		aa.brandName = "������";
		return aa;     //return new Tv();
		
	}
	public Tv objMethod2() {
	
		return new Tv(); // heap ��ü ����� �ּҰ� return
		
	}
	
	public void objMethod3(Tv t) {
		
		System.out.println("TvŸ�� ���� : " + t);
		System.out.println("ä�� ���� : " + t.ch );
		System.out.println("�귣�� �̸� : " + t.brandName);
	}
	
	
	
	
	
}
