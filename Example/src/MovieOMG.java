import java.util.Scanner;

public class MovieOMG {

	int[][] seat = new int[5][5];
	Scanner sc = new Scanner(System.in);
	int num = 0;

	
	// 메뉴를 보여주는 기능
	void MovieMenu() {
		System.out.println("******************************************************");
		System.out.println("메뉴를 선택하세요 : ");
		System.out.println("1. 영화 예매");
		System.out.println("2. 영화 예매 종료");
		System.out.println("******************************************************");
	}

	// 좌석을 출력하는 기능
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
	
	// 좌석에 예매하는 기능
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
	
	// 모든 기능 다 합치는 기능
	void MovieIntegrated() {
		MovieMenu();
		int result = sc.nextInt();
		
		
		while(true) {
			
			switch(result) {
			case 1 :
				
				SeatPrint();
				System.out.println("예약할 자리번호를 입력해주세요(1~25)");
				int aa = sc.nextInt();
				SeatReserve(aa);
				break;
				
			case 2:
				System.exit(0);
				
				default : 
					System.out.println("1 ~ 2까지의 숫자를 다시입력해주세요");
					result = sc.nextInt();
					break;
					
			
			}
			
			
		}
		
		
		
	}
	
}
