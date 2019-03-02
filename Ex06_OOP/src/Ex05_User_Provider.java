// 1. �������̽��� [������] ���忡�� �����Ѵ� (�������̽��� �θ� Ÿ���̴�)
// 2. ���� �������� ���� Ŭ������ ���ؼ� �ϳ��� ���� ��� (�θ� ����)
// 3. ����ڿ� �������� ����

// User(�����) : Provider(������)

// 1. ��� (is ~ a) : A extends B
// 2. ���� (has ~ a) : member filed ���·� ǥ���� �ȴ� (  Student st; Engine en = new Engine()  )
//  A��� Ŭ�����ȿ� B��� Ŭ������ ������ ��
//  class A{B b;}
// 3. ���� (has ~ a) : �Լ��ȿ��� (��ü ����, �Ҵ�, ����) dependency ���� ����
// ��������
// �б��� �л��� ������ �ִ� (����) class School {Student st;}, class Student{}
// �ڵ����� ������ ������ �ִ� (����) class Car{Engine en = new Engine()}

/*
class B {}
class A {
	int i;
	
	void print(B b) { // method (����)
	
	
	}

	void print() { // method (����)
	B b = new B();
	}
}
 */

interface Icall {
	void m();
}

class D implements Icall {

	@Override
	public void m() {
		System.out.println("D Icall �������̽��� m() ����");
	}
}

class F implements Icall {

	@Override
	public void m() {
		System.out.println("F Icall �������̽��� m() ����");
	}
}

// �������� ���α׷� ��� : ������ (�������̽�)
// ������ ���(�����ϴ�) .....
class C {
	void method(Icall ic) { // �� ���� �ڵ尡 �߿��ϴ�
		ic.m();
	}
}

public class Ex05_User_Provider {

	public static void main(String[] args) {
		C c = new C();
		c.method(new D());
		c.method(new F());
			
	}

}
