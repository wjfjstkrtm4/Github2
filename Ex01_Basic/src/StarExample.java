import java.util.Scanner;

public class StarExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // ���� �Է¹ޱ����ؼ� Scanner��ü ���

		System.out.println("���� �Է��ϼ���"); 
		int aa = sc.nextInt(); // aa������ �������� �Է¹ްڴ�

		for (int i = 1; i <= aa; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*"); // ������ �����ϸ� ���� ��´�
				}
			System.out.println(); 
		}

		System.out.println("-------------------------------------------------");

		for (int i = aa; i >= 1; i--) { // ���� �Է¹��� ��ŭ ���� �����
										
			for (int j = 1; j <= i; j++) { // �� ���ٿ� ���� �Է¹��� ���ڸ�ŭ ������ؼ�
				System.out.print("*");
			}
			System.out.println(); // ������ ����ش�
		} 
		System.out.println("------------------------------------------------");

		for (int i = 1; i <= aa; i++) {

			for (int j = 1; j <= aa - i; j++) { // 10�� �Է¹����� ù���� 9ĭ�� ������ �ְ�
												// �ι�° ���� 8ĭ�� ������ �ش�
				System.out.print(" "); // �� �ٿ� ���� ���������� �б� ���� ��ĭ
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*"); // ������ �����ϸ� ���� ��´�
			}

			System.out.println(); // ������ ����ش�
		}

	

	}

}
