import java.util.Scanner;

// �ݺ���(while, do-while)
public class Ex11_Statement {

	public static void main(String[] args) {
		/*
		 * while(true) { System.out.println("True"); }
		 */
		
		int i = 10;
		while(i >=10) { // ���� true
			
			// �ݵ�� ���ο��� ������� ������
			i--;
			System.out.println(i);
		}

		// 1~100������ ��
		
		int sum = 0;
		int j = 1;
		while(j <=100) {
			// j++; // ���� ^^ 5150
			sum += j;
			j++; // 5050
		}
		System.out.println("1���� 100������ �� : " + sum);
		
		
		// while������ ������
		
		int a = 1;
		int b = 1;
		
		while(a<=9) {
			b = 1;
			while(b<=9) {
			System.out.printf("[%d] [%d] [%d]\t", a, b, a*b);
			b++;
			}
			System.out.println();
			a++;
		}
		
		//do ~ while() : ������ ����(������ �ѹ� ���� �� ���� ���� �Ǵ�)
		// do { ���๮ } while(���ǽ�);
		// �޴� ����
		// 1. �λ�
		// 2. �޿�
		// 1�Է��ϸ� �λ�... 2 �Է��ϸ� �޿� ... 3�� �Է� �ٽ��Է��� ����
		
		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		
		do {
			System.out.println("���� �Է���(0~10)");
			inputdata = Integer.parseInt(sc.nextLine());
			
			
		}while(inputdata > 10); // while true��� ��� �ݺ�
		// while �� Ż���� ������ false �϶� while Ż��
		System.out.println("����� �Է��� ���ڴ� : " + inputdata);
		
		
		
	}

}
