package kr.or.bit;
//������ ���� (���� ����) (new .....)
//�̱��� :: ��ü�� �ϳ��� ���� ����

//�ϳ��� ��ü�� �����ؼ�(����) ...
//�� ������ ����ϸ� �ϳ��� ��ü�� ��� .. ����

//static (��ü�� ���� �ڿ�)...
// JDBC (DB ���� �ϴ� �۾��� ���...)
public class Singleton {
	private static Singleton p; 
	//Singleton ����ϸ� method area ������ �ö� �ִ�
	//private ���� �Ұ�
	private Singleton() {} //������ private ��ü�� ���� �Ұ�
	
	public static Singleton getInstance() {
		if(p == null) {
			p = new Singleton(); //������ ȣ��(private Ŭ���� ����....)
		}
		return p;
	}
}
