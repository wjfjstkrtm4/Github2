package kr.or.bit;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = (int)((Math.random()*3) +1);
		
		System.out.println("����->1, ����->2, ��->3");
		System.out.println("���ڸ� �Է��ϼ���");
		a = Integer.parseInt(sc.nextLine());
		
		
		if(a==1) {
			System.out.println("�� ����");
		}
		 else if(a==2) {
			System.out.println("�� ����");
		} else if(a==3) {
			System.out.println("�� ��");
		}
		
		if(b==1) {
			System.out.println("��ǻ�ʹ� ����");
			System.out.println();
		
			if(a==1) {
				System.out.println("�����ϴ�");
			} else if(a==2) {
				System.out.println("�̰���ϴ�");
			} else if(a==3) {
				System.out.println("�����ϴ�");
			} else {
				System.out.println("������ض�");
			}
			
			
		} 
		
		if(b==2) {
			System.out.println("��ǻ�ʹ� ����");
			System.out.println();
		
			if(a==1) {
				System.out.println("�����ϴ�");
			} else if(a==2) {
				System.out.println("�����ϴ�");
			} else if(a==3) {
				System.out.println("�̰���ϴ�");
			} else {
				System.out.println("������ض�");
			}
			
			
		} 
		
		
		if(b==3) {
			System.out.println("��ǻ�ʹ� ��");
			System.out.println();
		
			if(a==1) {
				System.out.println("�̰���ϴ�");
			} else if(a==2) {
				System.out.println("�����ϴ�");
			} else if(a==3) {
				System.out.println("�����ϴ�");
			}  else {
				System.out.println("������ض�");
			}
			
			
		}
		
		
		 else {
			System.out.println("1,2,3�߿� �ϳ����Է��ض�");
		}
		
		
	
		
		
		
	}
}
