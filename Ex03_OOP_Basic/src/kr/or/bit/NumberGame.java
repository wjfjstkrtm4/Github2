package kr.or.bit;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���߱�(��ȸ�� 5��)");

		int r = ((int) (Math.random() * 50)) + 1;
		int b = 0;
		int count=1;
		do {
			if (count==6) {
				break;
			}
			System.out.printf("%d��° ��ȸ",count);
			System.out.println();
			System.out.print("���� �Է�(1~50): ");
			b = Integer.parseInt(sc.nextLine());
			
			if (b > r) {
				System.out.println("Ʋ�ȴ�. �� ���� ����.");
			} else if (b < r) {
				System.out.println("Ʋ�ȴ�. �� ū ����.");
			}
			

			count += 1;

		} while (b != r);
		if (count == 6) {
			System.out.println("��ȸ�� ������.");
		} else if (b == r) {
			System.out.printf("%d !! �����̴�.", r);
		}
	}
}