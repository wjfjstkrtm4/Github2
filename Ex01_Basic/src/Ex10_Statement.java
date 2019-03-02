
public class Ex10_Statement {

	public static void main(String[] args) {
		/*
		 ���
		 ���ǹ�(�б⹮) : if(����, else, else if), switch() case break default
		 �ݺ��� : for(�ݺ�Ƚ���� �˰�������), while(���ǿ� ���� �ݺ��Ҷ�), do-while() ��������
		 break(�� Ż��), continue(�Ʒ������� ��ŵ�ض�)
		 */
		
		int count = 0; // local variable (�ʱ�ȭ)
		if(count <1) {
			System.out.println("True");
		}
		
		if(count<1)System.out.println("True {����}");
		
		char data = 'A'; // ���ǰ����� : [����], [char], [String] ����
		
		switch(data) {
		
		case 'A' :
			System.out.println("���ں�");
			break;
			
			default :
				System.out.println("default");
		}
		
		// �ݺ���
		
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		for(int i = 0; i<=10; i++) {
			// System.out.println("i : " + i);
			sum += i;
		}
		System.out.println("1���� 10������ �� : " + sum);
		
		// for���� ����ؼ� 1~10���� Ȧ���� ���� ���ϼ���
		
		for(int i = 1; i<=10; i+=2) {
			
			sum2 += i;
			
		}
		System.out.println(sum2);
		
		// 1~100���� ¦���� ��
		
		
		for(int i = 1; i<=100; i++) {
			if(i%2==0) {
				sum3 +=i;
			}
			
			
		}
		System.out.println(sum3);
		
		// �Ի���� ��ǥ���� ����(������) : ����
		// for (��ø) >> �����
		
		for(int i =2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				// System.out.printf(i + "/" + j);
				System.out.printf("[%d]*[%d] = [%d]\t", i, j, i*j);
			}
			System.out.println();
		}
		System.out.println("************************************************************");
		// KEY POINT (break(Ż��), continue(��ŵ))
		
		for(int i =2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				//if(i==j) 
				//	continue; // �Ʒ� ������ skip�ض�
				if(i==j)
					break;
				System.out.printf("[%s]", "*");
				 //System.out.printf("[%d]*[%d] = [%d]\t", i, j, i*j);
			}
			System.out.println();
		}
		
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		
		for(int i = 100; i >= 0; i--) { // ���۰��� ū������
			System.out.println("i : " + i);
		}
		
		
		// ��̷�.. (�Ǻ���ġ)
		System.out.println("�Ǻ���ġ");
		int a = 0, b = 1, c = 0;
		
		for(int i = 0; i<10; i++) {
			a = b;
			b = c;
			c = a+b;
			System.out.println(" " + c);
		}
	}

}
