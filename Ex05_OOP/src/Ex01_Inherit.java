/*
 ��ü������ (OOP) 3�� Ư¡ (Object Oriented Programming)
 ���
 ������
 ĸ��ȭ(����ȭ) : private

 1. ���
 java : Child extends Base
 c# > Child > Base
 
 2. ���Ư¡
 - ���߻���� �Ұ� (���⼺ ...)
 - ���ϻ���� ��Ģ (������ ����� ����ؼ� ���߻���� ����)
 - ���߻���� ���� (�����ϰ� Interface)
 
 3. �ǹ�
 ������ �ǹ� : [���뼺] >> �ݺ����� �ڵ� ... �����ڵ� ... �θ�
 ���� : �ʱ� ���� ��� ..
 
 ���뼺 >> ����� >> ���(�ð�, ����и�, �߻�ȭ)
 
 Memory �ε� ... ��� ... ���� ���� Memory�� �ö�����?
 
  */
class GrandFather {
	public int gmoney = 5000;
	private int pmoney = 50000; // ���� �԰� �����ž�(��������)
								// private�� ��Ӱ��迡�� �������ʴ´�
	// 1. ���������� ���پȵǰ�
	// 2. ��Ӱ��迡���� ���پȵ�
	// 3. Ư�� �ڿ��� ��Ӱ��迡�� ���̰� ���� ������ private�� ������, �߾��� �ʴ´�
	GrandFather() {
		System.out.println("�ҹ� ������");
	}
}

class Father extends GrandFather {
	public int fmoney = 1000;
	
	Father() {
		System.out.println("�ƺ� ������");
	}
}

class Child extends Father {
	public int cmoney = 100;
	Child() {
		System.out.println("�� ������");
	}
}


public class Ex01_Inherit {

	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println(c.gmoney); // �Ҿƹ��� �� ����
		System.out.println(c.fmoney); // �ƹ��� �� ����
		System.out.println(c.cmoney); // �� ���� ����
//		System.out.println(c.pmoney); // ���ٺҰ�
		
		
		
		

	}

}
