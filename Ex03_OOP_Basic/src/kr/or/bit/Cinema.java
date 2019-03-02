package kr.or.bit;

import java.util.Scanner;

public class Cinema {

	Scanner sc = new Scanner(System.in);
	int column, row;
	private String[][] seat = new String[5][5];
	
	
	public void displayMenu() {
		System.out.println("��ȭ�� ���� ���α׷�");
		System.out.println("1.�����ϱ�");
		System.out.println("2.�����ϱ�");
		System.out.println("��ȣ�� �Է��ϼ��� : ");
		
		String num = sc.nextLine();
		booking(num);
		
	}
	
	
	public void booking(String num) {

	System.out.println("�����ϱ�");
	
	for(int i=0; i<seat.length; i++) {
		for(int j=0 ; j<seat[0].length; j++) {
			
		seat[i][j] = "O\t";
		}
		
	}
	for(int i=0; i<seat.length; i++) {
		for(int j=0; j<seat.length; j++) {
			System.out.print(seat[i][j]);
		}
		System.out.println();
		
	}
	
	while(true) {
		
		System.out.println();
		System.out.println("���� �Է��ϼ���");
		column = sc.nextInt();
		if(column >=6 || column <0) {
			
			System.out.println("�ٽ��Է��ϼ���");
			column = sc.nextInt();
			
		} 
		
		System.out.println("���� �Է��ϼ���");
		row = sc.nextInt();
		if(row >=6 || row <0) {
			System.out.println("�ٽ��Է��ϼ���");
			row = sc.nextInt();
		}
		
		switch(seat[column-1][row-1]) {
		case "X\t":
			System.out.println("�̹� ���� �Ǿ����ϴ�");
			break;
			default :
				seat[column-1][row-1] = "X\t";
				break;
		}
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat.length; j++) {
				System.out.print(seat[i][j]);
			}
			System.out.println();
		
	}
		}
	
	}
	
}