package kr.or.bit;

import java.util.Scanner;

public class DabinMovie {
	private String[][] �¼� = new String[10][20]; // String Ÿ������ 10�� 20�� �¼��� ����
	private int[] �¼�_��_��ȣ = new int[�¼�[0].length]; // 1 ~ 20������ ���ڸ� ������� ����
	private Scanner ���ڹޱ� = new Scanner(System.in);
	private static final int �¼�_���� = 1;
	private static final int ���α׷�_���� = 2;

	private void �޴����() {
		System.out.println("��ȭ�� ���α׷�");
		System.out.println("1. �¼� ����");
		System.out.println("2. ���α׷� ����");
		System.out.println("�޴� ��ȣ �Է� : ");
	}
	private void ����ǥ��(int �Է�_��,int �Է�_��) {
		�¼�[�Է�_��][�Է�_��] = "X";
	
	}
	
	private int �Է�() {
		return ���ڹޱ�.nextInt();//Integer.parseInt(���ڹޱ�.nextLine());
	}
	private int �Է�_���ĺ�() {
		return ���ڹޱ�.next().charAt(0)-65;
	}
	
	private void �¼���Ȳ���() {
		int ��ȣ=0;

		for(int �¼�_�� = 0 ; �¼�_�� < �¼�_��_��ȣ.length ; �¼�_��++ ) {
			��ȣ += 1;
			System.out.print("\t"+��ȣ);
		}
		System.out.println();
		for (int �� = 0 ; �� < �¼�.length ; ��++) {
			System.out.print((char)('A'+��)+"\t");
			for(int �� = 0 ; �� <�¼�[0].length ; ��++) {
				if(�¼�[��][��] != "X") {
				�¼�[��][��] = "O";
				}
				System.out.print(�¼�[��][��]+"\t");
				
			}
			System.out.println();
				
		}
	}
	private boolean ��_Ȯ��(int �Է°�) {
		return �Է°� >= 0 && �Է°� <= 9;
	}
	private boolean ��_Ȯ��(int �Է°�) {
		return (�Է°�>=1 && �Է°� <= 20);
	}
	private boolean �¼�_��ȿ_Ȯ��(int �Է�_��, int �Է�_��) {
		return !��_Ȯ��(�Է�_��) || !��_Ȯ��(�Է�_��);
	}

	public void ����޼ҵ�() {
		�޴����();
		
		int �������� = �Է�();
		while (�������� != ���α׷�_����) {
			
			switch (��������) {
			case �¼�_����:
				�¼���Ȳ���();
				
				System.out.println("������ �¼��� ���� �Է� : ");
				int �Է�_�� = �Է�_���ĺ�();
				
				System.out.println("������ �¼��� ���� �Է� : ");
				int �Է�_�� = �Է�();
			
				if(�¼�_��ȿ_Ȯ��(�Է�_��, �Է�_��)) {
					System.out.println("���� �¼��Դϴ�.");
					continue;
				}
				
				if(�¼�[�Է�_��][�Է�_��-1]=="X") {
					System.out.println("�̹� ����� �¼��Դϴ�.");
				}
				else 
					����ǥ��(�Է�_��, �Է�_��-1);
				break;
//			case ���α׷�_����:
//				return;
			default :
				System.out.println("1 �Ǵ� 2���� �Է��ϼ���");
				System.out.println("�ٽ� �Է�:");
				�������� = �Է�();	
				break ;
			}
		}
	}
}