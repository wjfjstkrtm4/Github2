// ���� <-> ���
// ��� : �ѹ� ���� �������� ������ �Ұ�...
// �ý��ۿ��� �ѹ� ���� �������� ���� ���� ���ƾ� �ɰ� : �ý��� ���� ��ȣ, 
// �Ϲݻ�ļ��� ���� �������� ���� ���� ���ƾ� �ɰ� : ������ : �ֹι�ȣ, PI

// ��� ���������� �빮��
// Java : final int NUM = 100;
// C# : const int NUM = 100;

// final Ű����
// Ŭ���� �տ� : final class Car{} >> ��ӺҰ� (extends �Ұ�)
// �Լ� �տ� : public final void print() {} >> ��Ӱ��迡�� ������������ (���� ��������)
// ������ �����ʰ� �Ϸ��� private�� ���̸� �ǹǷ� �� ������ ����

class Vcard {
	final String KIND = "heart";
	final int NUM = 10;
	
	void method() {
		// �ý��� ��� (static final double PI = 3.14159...
		
		System.out.println(Math.PI);
	}
}

// ���� : Vcard Ÿ������ ����� ��� ��ü�� �ᱹ ���� ������� ������
// ��ü���� �ٸ� ��� ���� ���� �;�� ??
// ��� ���� �ѹ� �����Ǹ� ���� x....

class Vcard2 {
	final String KIND; // ��ü ����� �ʱ�ȭ ���ϸ� ����� ...
	final int NUM;
	
//	����������
//	Vcard2() {
//		this.KIND = "heart";
//		this.NUM = 10;
//		
//	}
	
//	Vcard2() {
//		
//	}
	
	
	// ���������� �ʱ�ȭ�� �� �� �ִ� �ڵ带 ���� (������)
	// ��ü���� �ٸ� ���� ������ �� �� �ִ�
	Vcard2(String kind, int num) {
		this.KIND = kind;
		this.NUM = num;
	}
	
}


public class Ex07_Final {
	
	public static void main(String[] args) {
		
		Vcard v = new Vcard();
		// v.KIND = "200"; �ȵǿ�
		System.out.println(v.KIND);
		v.method();
		
		// POINT : ��ü���� �ٸ� ������� �ο��� �� �ֽ��ϴ� ^^
		Vcard2 v2 = new Vcard2("space", 1);
		System.out.println(v2.KIND + "/" + v2.NUM);
		
		Vcard2 v3 = new Vcard2("heart", 10);
		System.out.println(v2.KIND + "/" + v2.NUM);
		
		
		
		
		
	}
}
