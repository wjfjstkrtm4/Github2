// 2. this (��ü >> �����ڸ� ȣ���ϴ� this)

// ��Ģ : �����ڴ� ��ü ������ �Ѱ��� ȣ��
// ���������� this ����ϸ� �������� ������ �Լ��� ȣ�� �� �� �ִ�


// this ...
// �����ھȿ� �ִ� �ڵ尡 �ݺ������� ���
// default : this.color = "red";
// overloading : this.color = "color";

// �Ҵ��� �ѹ� ...

class Zcar {
	String color;
	String geartype;
	int door;
	
	Zcar() {
//		this.color = "red";
//		this.geartype = "auto";
//		this.door = 4;
		// new Zcar()
		// 	   this()
		
		this("red", "auto", 4); // �ڱ� �ڽ��� ȣ���Ѵ� (������ �Լ��� ȣ��)
		System.out.println("default constructor");
		
	}
	
	Zcar(String color, String geartype, int door) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor");
	}
	
	void print() {
		System.out.println(this.color + ", " + this.geartype + ", " + this.door);
	}
}

// �ڵ��� ���� ��� (�ڵ��� �Ǹ� �⺻ �ɼ�, �ɼ�B, �ɼ�C �Ǹ� ����) : default, ������ ...
// 
class Zcar2{
	String color;
	String geartype;
	int door;
	
	Zcar2() { // �ɼ� A����...
		this("red", 2);
		System.out.println("default constructor");
	}
	
	Zcar2(String color, int door) { // ������ ����� ���� ������ ���� ����(�ɼ� B����..)
		this(color, "auto", door); // color, door�� �Է¹ްڴ� -> color, door�� �ٲ� �� �ִ�
		System.out.println("overloading constructor parameter 2��");
	}
	
	Zcar2(String color, String geartype, int door) { // ������ ����, ���Ÿ��, �� ���� �� �ٲ� �� ����
		this.color = color;							// �ɼ� C����...
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor parameter 3��");
	}
	
	void print() {
		System.out.println(this.color + ", " + this.geartype + ", " + this.door);
	}
}

public class Ex16_this_Constructor_Call {

	public static void main(String[] args) {
		
		Zcar z = new Zcar(); // �⺻��
		z.print();
		
		//Zcar z2 = new Zcar("blue", "auto", 10); // overloading
		//z2.print();
		
//		Zcar2 car = new Zcar2();
//		car.print();
		
//		Zcar2 car = new Zcar2("gold", 2);
//		car.print();
		
		Zcar2 car = new Zcar2("pink", "manual", 5);
		car.print();
	}

}
