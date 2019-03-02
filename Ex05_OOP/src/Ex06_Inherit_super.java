// �ϳ��� Ŭ����
// this : ��ü �ڽ��� ����Ű�� this (this.name, this.age)
// this : �����ڸ� ȣ���ϴ� this (this(100, "ȫ�浿"))

// ��Ӱ��迡��
// super (�θ��� �ּҸ� ����ִ�) : ��Ӱ��迡�� �θ� �ڿ��� ���� �� �� �ִ� ���
// this ������ ����
// 1. super : ��Ӱ��迡�� �θ��ڿ��� ����
// 2. super : ��Ӱ��迡�� �θ��ڿ��� ������ ȣ��

// ����϶� �������̵�, super Ű���带 ��� �� �� �ִ�
class Base {
	String basename;

	Base() {
		System.out.println("Base Ŭ���� �⺻ ������");
	}
	
	Base(String basename) {
		this.basename = basename;
		System.out.println("this.basename : " + this.basename);
	 }
	
	void baseMethod() {
		System.out.println("Base.baseMethod()");
	}
	
}

class Derived extends Base {
	String dname;
	
	Derived() {
		
		System.out.println("Derived Ŭ������ �⺻ ������");
		
	}
	
	Derived(String dname) {
	//	super(); // �θ��� default ������ ȣ��
		super(dname); // �θ��� overloading �� ������ ȣ��
		this.dname = dname;
		System.out.println("this.dname : " + this.dname);
	}
	
	@Override
	void baseMethod() {
		
		System.out.println("�θ� �Լ��� ������ �Ͽ����ϴ�");
	}
	
	// �θ���� �׸��� �����(������)
	
	void P_method() {
		super.baseMethod(); // �����ǵ� �޼ҵ�� �θ�� ������ �� ���⶧����			
							// �޼ҵ带 �ϳ� ���� super�� �����Ѵ�
	}
}

public class Ex06_Inherit_super {
	public static void main(String[] args) {
		// Derived d = new Derived();
		// d.basename;
		// d.dname;
		
		Derived d = new Derived("ȫ�浿");
		d.baseMethod();
		d.P_method();
		
	}

}
