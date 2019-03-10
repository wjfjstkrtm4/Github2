import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//설계도
//Lotto lotto = new Lotto() ; 
//lotto.SelectLottoNumber() ; >> 메뉴 제공
//1 입력 -> 번호추출 selectBasicNumber() 함수 호출 (실번호 추출)
//2 입력 -> 프로그램 종료......
public class LottoHomework2 {
	private Scanner sc;
	private Random r;
	// r.nextInt(45)
	private int[] numbers;
	private int[] input;
	private int count;

	// static{}
	public LottoHomework2() { // 특수한 목적 : 멤버필드 초기화.. ( 생성자 함수 ) , constructor
		sc = new Scanner(System.in);// 초기화 (참조변수는 주소값을 갖는것.)
		r = new Random();
		numbers = new int[6];
		input = new int[6];

	}

	public void showLottoMenu() {
		int i;
		do {

			System.out.println("로또프로그램");
			System.out.println("******************");
			System.out.println("1. 로또 번호 받기");
			System.out.println("2. 로또 시뮬레이션");
			System.out.println("3. 프로그램 종료");
			System.out.println("*****************");
			System.out.println("원하는 번호(1~3) 입력 :");
			i = sc.nextInt();
			if (i < 1 || i > 3) {
				System.out.println("Error : 1~3값을 입력하세요.");
				System.out.println();
			}
			switch (i) {

			case 1:

				do {
					selectGetNumber();
				} while (maxMin(numbers) == false); {

				System.out.print("받은 번호 : ");
				for (int j = 0; j < numbers.length; j++) {
					System.out.print(numbers[j] + " ");

				}
				System.out.println();
				System.out.println();

				break;
			}

			case 2:
				simul();
				break;
			}
		} while (i != 3);
	}

	private void selectGetNumber() {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int swap = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = swap;

			
				}
			}

		}

		
		BufferedWriter fos = null;
		//BufferedWriter bos = null;
		FileWriter fr = null;
		try {
			fr = new FileWriter("Lotto.txt", true);
			 // Lotto.txt가 없으면 새로만들겠다
			
			//bos = new BufferedWriter(fos); // 보조역활 하는애로 line 단위로 쓴다

			for(int i = 0; i < numbers.length; i++) {
				
				
				fr.write(numbers[i] + " ");
				
				
			}
			//fos.write("\n");
			//fos.close();
			fr.close();
		} catch(Exception e) {
		
		} 
		
	}
	
	

	private void simul() {

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("찍을 숫자 6개 입력(1~45) : ");
		for (int i = 0; i < numbers.length; i++) {
			input[i] = sc.nextInt();
		}
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (input[i] == numbers[j]) {
					count += 1;
				}
			}
		}
		System.out.print("당첨번호 : ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.printf("%d개 맞았습니다! ", count);
		System.out.println();
		System.out.println();
		// 검증(기능 함수) (6개의 합을 구해서 6으로 나눈 평균의 범위가 5보다 크거나 같고
		// 10보다 작거나 같으면 번호 추출하겠다)
		// (avg >= 5 && avg <= 10) true 리턴 ... 범위가 다르면 재추출
	}

	private boolean maxMin(int[] numbers) {
		int max = numbers[numbers.length - 1];
		int min = numbers[0];

		return (max >= 40 && min <= 10); // 최대값이 40이상 , 최소값이 10이하

	}

	public static void main(String[] args) {

		LottoHomework lotto = new LottoHomework();
		lotto.showLottoMenu();

	}

}