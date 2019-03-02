import java.util.Scanner;

public class MovieOMG {

	int[][] seat = new int[5][5];
	Scanner sc = new Scanner(System.in);
	int num = 0;

	
	// �޴��� �����ִ� ���
	void MovieMenu() {
		System.out.println("******************************************************");
		System.out.println("�޴��� �����ϼ��� : ");
		System.out.println("1. ��ȭ ����");
		System.out.println("2. ��ȭ ���� ����");
		System.out.println("******************************************************");
	}

	// �¼��� ����ϴ� ���
	void SeatPrint() {
		
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				num++;
				if(num>=26) {
					num =1;
				}
				seat[i][j] = num;
				System.out.printf("[%d]\t", seat[i][j]);
				
			}
			System.out.println();
		}
	}
	
	// �¼��� �����ϴ� ���
	void SeatReserve(int aa) {
		
		
		
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				num++;
				if(num>=26) {
					num =1;
				}
				seat[i][j] = num;
				if(seat[i][j] == aa) {
					seat[i][j] = 0;
				}
				System.out.printf("[%d]\t", seat[i][j]);
				
				
			}
			System.out.println();
			
			
		}
		
		
		
	}
	
	// ��� ��� �� ��ġ�� ���
	void MovieIntegrated() {
		MovieMenu();
		int result = sc.nextInt();
		
		
		while(true) {
			
			switch(result) {
			case 1 :
				
				SeatPrint();
				System.out.println("������ �ڸ���ȣ�� �Է����ּ���(1~25)");
				int aa = sc.nextInt();
				SeatReserve(aa);
				break;
				
			case 2:
				System.exit(0);
				
				default : 
					System.out.println("1 ~ 2������ ���ڸ� �ٽ��Է����ּ���");
					result = sc.nextInt();
					break;
					
			
			}
			
			
		}
		
		
		
	}
	
}
