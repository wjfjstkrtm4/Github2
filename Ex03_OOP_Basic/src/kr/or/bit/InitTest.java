package kr.or.bit;

public class InitTest {

	public static int cv = 1; // class variable, static variable
	public int iv = 1; // ����� �ʱ�ȭ
	
	static { // static �ʱ�ȭ ���, class �ʱ�ȭ ���
		cv = 2;
		 // 
	}
	{iv = 2;} // �ν��Ͻ� �ʱ�ȭ ���
	
	public InitTest() { // ������ �Լ� (�ʱ�ȭ: instance variable, member field �ʱ�ȭ)
		iv = 3;
	}
}
