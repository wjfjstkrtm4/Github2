

/*
int[] arr = new int[5]; // default ���� 0
arr[0] = 100; // �ʱ�ȭ

������ �Լ� (constructor) : �ʱ�ȭ(member filed) �Լ�
1. Ư���� ������ ������ �Լ�(�ʱ�ȭ)
2. �ʱ�ȭ(instance variable : member filed)

�Ϲ��Լ��� �ٸ���
1. �Լ��� �̸��� �����Ǿ��ִ� (class �̸��� ����(�ݵ��))
2. ������ �Լ��� : return type(x), void(x) : default void
	why : �������� ... �Լ��� ��ü ������ ���ÿ� ȣ�� .. ���� �ѱ� ���� ����
	
	���� : �����Ǵ� ��ü���� �ٸ� �ʱⰪ�� ������ ������
	
	������ �Լ� : overloading �� �����ϴ� (parameter �� ������ Ÿ��)
	
	���� : Car c = new Car(); 
		1. Stack c���� -> default > null
		2. Heap Car ��ü�� ���� -> ���� -> �����ȿ� memberfiled �ε� -> 
		   -> ������ �Լ� ȣ�� (�ε��� member filed �ʱ�ȭ)
		3. class ������ default �����ڴ� ���������ϴ�
		  (���� ���� �������� �ʾƵ� �����Ϸ��� �˾Ƽ� �����Ѵ�)
		  
	TIP) ������ �Լ��� overloading ���� ������ �۽�� ....
-- �������� �ǵ��ľ� --
	
	
	
	
 */

class Car {
	String name;
	// ����� ���� �������� �ʾƵ�
	// �����Ϸ��� �����ڰ� �ִٰ� ����
	// Car() {} ����(default)

}

class Car2 {
	String name;
	
	Car2() { // default constructor(������ �Լ�)
		System.out.println("���� ������ �Լ�");
		System.out.println("before : " + name);
		name = "pony";
		System.out.println("after : " + name);
	}
	
	
}

class Car3 {
	int numer;
	// ������� : �ڵ�󿡼� default �����ڴ� �Ϲ������� �����Ѵ� 
	Car3() {}
}

class Car4 {
	int door;
	int wheel;
	
	Car4() {
		// default
		System.out.println("default");
	}
	
	Car4(int num) { // overloading
		door = num;
		System.out.println("overloading door : " + door);

	}
	
	Car4(int num, int num2) {
		door = num;
		wheel = num2;
		System.out.println("overloading door : wheel : " + door + "," + wheel);
	}
	
}

class Apt {
	String color;
	
	Apt(String color) {
		this.color = color;
	}	
}

class Apt2 {
	String color;
	// default�� ����ϰ� �ʹٸ� �ݵ�� �����ض�
	Apt2() {
		System.out.println("default");
	}
	
	Apt2(String color) {
		this.color = color;
	}	
}
// 1. class ������ Overloading �����ڰ� �ϳ��� �ִٸ� default �����ڴ�
// �ڵ� �������� �ʴ´�(�����Ϸ��� �ڵ����� ������ �ʴ´�)

// why) ������ (���赵)�� ������ �ο� (���� overloading �� ���� ��� �ϰ�...)
//		


public class Ex13_Constructor_Fuction {

	public static void main(String[] args) {

		// Car c = new Car(); // Car()�� �Լ��ε� CarŬ�������� ������ �Լ��� ����?
		// Car2 c2= new Car2();
		// Car3 c3 = new Car3();
		   Car4 c4 = new Car4(); // default [ȣ��]�ؼ� ��ü ����
		   System.out.println();
		   Car4 c5 = new Car4(2); // prameter 1�� [ȣ��]�ؼ� ��ü ����
		   Car4 c6 = new Car4(2, 3); // prameter 2�� [ȣ��]�ؼ� ��ü ����
		   
		   Apt2 apt = new Apt2();
		   Apt2 apt2 = new Apt2("gold");
		   
		   Book book = new Book("ȫ�浿��", 10000);
		   book.BookInfo();
		   System.out.println(book.getBookName());
		   System.out.println(book.getBookPrice());
		   
		   Book book2 = new Book("����ġ��", 20000);
		   book.BookInfo();
		   System.out.println(book.getBookName());
		   System.out.println(book.getBookPrice());
		   
	}

}

// 1. class ������ ������ �Լ��� �������� ������ (overloading�� �ȸ���°��) default ������ �ڵ� ����
// ex) class Tv {String name;}

// 2. class ������ overloading ������ �Լ��� �ϳ��� ����...
// ** default �����ڴ� ��� �� �� ���� **
// ������ ���� ����
// ex) class Tv {String name; Tv(String n) {name = n;} }

// 3. class ������ default, overloading �Ѵ� ���� �ϴ� ���
// �ʿ信 ���� default �� overloading ��� ���� �ȴ�
// ex) class Tv {String name; Tv() {} Tv(String n {name = n;} }


