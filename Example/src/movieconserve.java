import java.util.Scanner;

class Movie10 {
	
	int[][] arr = new int[7][7];
	Scanner sc = new Scanner(System.in);
	int num = 0;
	
	
	private void Movieshow() {
		System.out.println("*******************");
		System.out.println("��ȭ ���� ��� ���α׷� �Դϴ�");
		System.out.println("1. ��ȭ �¼� ����");
		System.out.println("2. ���α׷� ����");

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
				System.out.println("1���� 2������ �޴��� �����ϼ���");
			
		}
		}
		
	}
	
	
	
	
	
}






public class movieconserve {

	public static void main(String[] args) {
	

	}

}
