/*
���� �߻�
1. ����(error) : ��Ʈ��ũ ���, �޸�, �ϵ���� (������ ó�� �Ұ���)
2. ����(Exception) : �������� ... (0 ���� ������) >> �������� �ڵ� ó�� ���� ... �ذ�   (�������Ḧ �������ؼ� ���)
2.1 ���ܰ� �߻��Ǹ� ���α׷��� ���� ���� ...
2.2 ���� : �߸��� �ڵ带 �����ϴ°��� �ƴϰ� .... ���� �߻��� ���������� ���Ḧ ���ϰ� �ϴ� ��

try {
	�����ڵ� ...
	���� �߻� ...
	
} catch(Exception e) {
	������ �߻������� ������ ���� ������ 
	1. ��� ...
	2. �α׿� ��ϳ����
	3. �����ڿ��� �̸��� ������ ///
} finally {
	���ܰ� �߻��ص� ����, �߻� ���� �ʾƵ� ����
	�ǹ������� ���� �Ǿ�� �ϴ� ����
	ex) DB���� �۾� .... >> [���� ����]
}

�����ڴ� ����� �߻� �� �� �ִ� ���ܿ� ���ؼ� ó�� (runtime ���� ó��)
	

 */
public class Ex01_Exception {

	public static void main(String[] args) {
		/*
		System.out.println("Main Start");
			System.out.println("Main Logic ó��...");
				System.out.println(0/0); // ������ ����
			System.out.println("Main Logic ó��...");
		System.out.println("Main End");
		*/
		System.out.println("Main Start");
			System.out.println("Main Logic ó��...");
		
		try {
			System.out.println(0/0);
			
		} catch(Exception e) { // e ������ �ּҰ��� �޴´�
			e.printStackTrace();
			
			
			// System.out.println(0/0); ���ܿ� �´� ��ü�� �ڵ����� ...
			// ArithmeticException arithmetic = new ArithmeticException();
			// arithmetic.set(...���)
			
			// java.lang.ArithmeticException
			// / by zero
			// System.out.println("���� �޽��� ��� : " + e.getMessage());
			// ���ܿ� ���� ó��
//			1. ��� ...
//			2. �α׿� ��ϳ����
//			3. �����ڿ��� �̸��� ������
			
		}
		System.out.println("Main Logic ó��...");
		System.out.println("Main End");
			
			
		
		

	}

}
