package kr.or.bit;

import java.util.*;

public class Movie {

	Scanner sc = new Scanner(System.in);
	int[][] number = new int[5][5];
	int num = 1;

	private void movieMenu() {

		System.out.println("***************************");
		System.out.println("1. ��ȭ����");
		System.out.println("2. ���α׷� ����");
		System.out.println("***************************");
	}

	public void movieView() {

		while (true) {

			movieMenu();
			int result = Integer.parseInt(sc.nextLine());

			switch (result) {

			case 1:
				movieConservation();

				break;

			case 2:
				System.out.println("���α׷� ����");
				System.exit(0); // return

			default:
				System.out.println("1~2������ ���ڸ� �Է��ϼ���");
				break;
			}
		}

	}

	private void movieConservation() {
		if (num == 26) {
			num = 1;
		}

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				number[i][j] = num;
				System.out.printf("[%d]\t", number[i][j]);
				num++;
			}
			System.out.println();
		}

		while (true) {

			System.out.println("������ �ڸ� ��ȣ�� �Է��ϼ���(1~25)");
			int result = Integer.parseInt(sc.nextLine());
			if (result > 25 || result < 1) {
				System.out.println("���� �ڸ���.");
				continue;

			}

			 for (int i = 0; i < number.length; i++) {
				for (int j = 0; j < number[i].length; j++) {
					
						
					  if (result == number[i][j]) {
						number[i][j] = 0;

						for (int k = 0; k < number.length; k++) {
							for (int l = 0; l < number[i].length; l++) {

								System.out.printf("[%d]\t", number[k][l]);
							}
							System.out.println();

						}

					}

				}
			}

		}

	}

}
