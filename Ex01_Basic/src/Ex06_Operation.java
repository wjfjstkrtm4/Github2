
public class Ex06_Operation {

	public static void main(String[] args) {
		// == ������ (��(value) ���ϴ� ������
		// javascript (==)
		if (10 == 10.0f) { // == �� ������ ���°��̱⶧���� ����
			System.out.println("True");

		} else {
			System.out.println("False");

		}

		// ! ����������
		if ('A' != 65) { // ���� �ʴ�
			System.out.println("�� ���� ���� �ƴϾ�");

		} else {
			System.out.println("�� ���� ���̾�");
		}

		// �ϱ�����(POINT)
		// ���ó�� ���� ������ (���� ������)
		int p = 10;
		int k = -10;

		int result8 = (p == k) ? p : k;
		System.out.println("result8 : " + result8);

		// ? �տ��ִ� ���ǽ��� true ��� : �տ� �ִ� ����
		// ? �տ��ִ� ���ǽ��� flase ��� : �ڿ� �ִ� ����

		if (p == k) {
			result8 = p;

		} else {
			result8 = k;
		}

		
		// ������ (| (or), & (and) )
		// 0�� 1�� bit ����
		int x = 3;
		int y = 5;
		
		System.out.println("x | y : " + (x|y)); // OR
		System.out.println("x & y : " + (x&y)); // AND
		// ������ 3�� -> ���������� 2���������� �ٲ۴�
		// 128 64 32 16 8 4 2 1 
		//		  0 0 0 0 0 1 1 (2���� : 3)
		//		  0 0 0 0 1 0 1 (2���� : 5)
 		// OR	  0 0 0 0 1 1 1 -> 1+2+4 -> 7
		// AND    0 0 0 0 0 0 1 -> 1
		
		/*
		 ����ǥ
		 0 : false 
		 1 : true
		 		OR		AND
		 0 0	0		 0
		 0 1	1		 0
		 1 0	1		 0
		 1 1	1		 1
		
		
		sql(oracle)
		
		select * from emp
		where job = 'sales' and saa > 2000;
		
		select * from emp
		where job = 'sales' or saa > 2000;
		
		 
		// POINT ������ ( || (or), && (and)) ������ return boolean
		// �߿��ұ�
		// if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1) { ���๮ }
		// if(10 > 0 || -1 > 1 || 100 > 2 || 1 > -1) { ���๮ }  
		 
		 
		 
		 
		 */
		
		
		
		
		
		
		
		
		
	}
}
