package kr.or.bit;

import java.util.Random;
import java.util.Scanner;

public class Lotto2 {

	private Scanner scanner;
	private Random r;
	private int[] numbers;



public Lotto2() {
	
	scanner = new Scanner(System.in);
	r = new Random();
	numbers = new int[6];

	
}

	private String showMenu(Scanner scanner) {
		
		System.out.println("*****************");
		System.out.println("1. ��÷ ���� ��ȣ ���� : ");
		System.out.println("2. ���� : " );
		System.out.println("*****************");
		
		String result = scanner.nextLine();
		return result;
		
	}

	private void selectBasicLottoNumber() {
		
		// 1���� 45������ ������ �̾Ƽ� ������ �迭�ε����� �־���Ѵ�
		
		for(int i = 0; i<numbers.length; i++) {
			
			numbers[i] = r.nextInt(45)+1;
			
			for(int j = 0; j<i; j++) {
				if(numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i<numbers.length; i++) {
			
			for(int j = i+1; j<numbers.length; j++) {
				
				if(numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
				
			}
		}
		
		for(int value : numbers) {
			System.out.printf("[%d]", value);
		}
		System.out.println();

	}

	public void selectLottoNumber() {
		
		stop : while(true) {
			
			String result2 = showMenu(scanner);
			
			switch(result2) {
			
			case "1" :
				selectBasicLottoNumber();
				break;
			
			case "2" :
				System.out.println("���α׷��� ����˴ϴ�");
				break stop;
			
			
			default : 
				System.out.println("1~2������ ���ڸ� �Է��ϼ���");
				break;
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	




}