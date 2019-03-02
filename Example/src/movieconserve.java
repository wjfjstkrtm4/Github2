import java.util.Scanner;

class Movie10 {
	
	int[][] arr = new int[7][7];
	Scanner sc = new Scanner(System.in);
	int num = 0;
	
	
	private void Movieshow() {
		System.out.println("*******************");
		System.out.println("영화 예매 기능 프로그램 입니다");
		System.out.println("1. 영화 좌석 보기");
		System.out.println("2. 프로그램 종료");

	}
	
	private void Movieconmenu() {
		Scanner s = new Scanner(System.in);
		int result = s.nextInt();
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				num++;
				System.out.printf("[%d]", arr[i][j] + num);
			}
			System.out.println();
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				if(arr[i][j] == result) {
					arr[i][j] = 0;	
				}
				
			}
	}
	
	}
		
	
	
	public void MovieInt() {
		Movieshow();
		int result = sc.nextInt();
		
		while(true) {
			
		switch(result) {
			case 1:
				Movieconmenu();
				break;
				
			case 2:
				System.exit(0);
				break;
				
				default :
				System.out.println("1부터 2까지의 메뉴만 선택하세요");
			
		}
		}
		
	}
	
	
	
	
	
}






public class movieconserve {

	public static void main(String[] args) {
	

	}

}
