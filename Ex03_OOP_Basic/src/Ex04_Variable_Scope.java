// ������ (Ex04_Variable_Scope.java ���� �ȿ���)

class Variable {
	int iv; // �տ� default ����
	/*
	 1. iv -> member field (instance variable)
	 2. ���� : ������ �������� ����� (����, ����, ��ǰ(����))
	 3. Ư¡ : �ʱⰪ�� (default) ������ �ִ� (����>0, �Ǽ�>0.0, boolean>false
	 		 �ʱ�ȭ�� ���� �ʴ´�. (�����Ǵ� ��ü���� �ٸ� ���� ������ �ϱ����ؼ�)
	 4. ��������(memory�� �ε��Ǵ� ����) : new ��� �����ڸ� ���ؼ� heap������ ��ü���鶧
	 */
	
	static int cv;
	/*
	1. class variable, static variable (�����ڿ�)
	2. ���� : ������ �������� ����� >> [�����Ǵ� ��� ��ü�� �����ϴ� �ڿ�] >> ��ü �� �����ڿ�
	3. Ư¡ : ���ٹ�� >> Ŭ�����̸�.static�ڿ�(variable.cv) >> ��ü�� ��������� �ʾƵ� ���� �����ϴ� (Math.random())
	4. �������� : ���α׷��� ����ɶ�(java hello) class loader system �� ���ؼ� [Ŭ���� ����]�� �а� (class area, method area)�� ������ �ø��� ����
	 		   �÷��� Ŭ�����ȿ� static �ڿ��� ������ �ִٸ� static �ڿ��� ���� memory road �մϴ�
	 		   >> static ��ü ���� ������ memory�� �ö󰡴� �ڿ�
	 		   
	 		   
	 		   
	 		   
	 
	 */
	
	void method() {
		int lv = 0; 
		// local variable (��������)
		// Ư¡ : ���������� ����ϱ� �� �ݵ�� �ʱ�ȭ
		// �������� : �Լ��� ȣ��Ǹ� ��������� �Լ��� ������ �Ҹ� (stack ������ ���������)
			
	}
}
	


public class Ex04_Variable_Scope {

	public static void main(String[] args) {
		
		/*
		Variable.cv = 100; // static ����(����)
		System.out.println("Varaible.cv : " + Variable.cv);
		Variable v = new Variable();
		v.iv = 200;
		v.cv = 500;
		// static ������ new �����ڷ� ��ü�� ����� �������ص� �ǰ�,
		// Ŭ�����̸�. ���� �����ص��ȴ�
		
		System.out.println("Varaible.cv : " + Variable.cv);
		*/
		
		System.out.println("Varaible.cv : " + Variable.cv);
		// ��ü�� �����ڿ�
		Variable v = new Variable();
		System.out.println(v.cv);
		
		Variable v2 = new Variable();
		System.out.println(v2.cv);
		
		
		

	}

}
