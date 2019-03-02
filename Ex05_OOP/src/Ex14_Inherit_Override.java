class Parent {
	
	int x = 100;
	
	void pmethod() {
		System.out.println("parent method");
	}
}

class Child3 extends Parent {
	int y = 200;
	int x = 2000; // C# ������ : ���� �����ϱ�
	
	void parent_x() {
		System.out.println(super.x);
	}
	
	@Override
	void pmethod() {
		System.out.println("�θ� �Լ� ������");
	}
	
	void parent_method() {
		super.pmethod();
	}
}



public class Ex14_Inherit_Override {

	public static void main(String[] args) {
		
		Child3 ch = new Child3();
		Parent pa = ch; // ������
						// �θ�Ÿ���� ���������� �ڽ� Ÿ���� �ּҰ��� ���� �� �ִ�
						// �޴��� �θ��ڿ��� ��� �� �� �ִ�
		// pa.y ���� ...(x) �ڽĲ��ϱ�
		System.out.println("ch.x : " + ch.x);
		ch.parent_x();
		ch.pmethod();
		pa.pmethod();
		ch.parent_method();
		
	}

}
