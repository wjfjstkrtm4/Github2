
public class Ex08_Static_Method {

	
	int iv = 100;
	static int cv = 200;
	
	void method() {
		System.out.println("���� �Ϲ� �Լ�");
	}
	
	static void smethod() {
		System.out.println("�� static �Լ���");
	}
	public static void main(String[] args) {
	
		Ex08_Static_Method ex = new Ex08_Static_Method();
		System.out.println(ex.iv);
		ex.method();
		
		
		Ex08_Static_Method.smethod();
		
		// static �Լ��� ������ : 
		// static �Լ��� why ����� ����ұ�
		// ���� : ���� ���� �ڿ��� ���ϰ� ���
		// �������� ���赵�� ���鶧 ���� ���� �ڿ��� static ���� ...
	}

}
