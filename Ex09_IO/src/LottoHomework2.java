import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//���赵
//Lotto lotto = new Lotto() ; 
//lotto.SelectLottoNumber() ; >> �޴� ����
//1 �Է� -> ��ȣ���� selectBasicNumber() �Լ� ȣ�� (�ǹ�ȣ ����)
//2 �Է� -> ���α׷� ����......
public class LottoHomework2 {
	private Scanner sc;
	private Random r;
	// r.nextInt(45)
	private int[] numbers;
	private int[] input;
	private int count;

	// static{}
	public LottoHomework2() { // Ư���� ���� : ����ʵ� �ʱ�ȭ.. ( ������ �Լ� ) , constructor
		sc = new Scanner(System.in);// �ʱ�ȭ (���������� �ּҰ��� ���°�.)
		r = new Random();
		numbers = new int[6];
		input = new int[6];

	}

	public void showLottoMenu() {
		int i;
		do {

			System.out.println("�ζ����α׷�");
			System.out.println("******************");
			System.out.println("1. �ζ� ��ȣ �ޱ�");
			System.out.println("2. �ζ� �ùķ��̼�");
			System.out.println("3. ���α׷� ����");
			System.out.println("*****************");
			System.out.println("���ϴ� ��ȣ(1~3) �Է� :");
			i = sc.nextInt();
			if (i < 1 || i > 3) {
				System.out.println("Error : 1~3���� �Է��ϼ���.");
				System.out.println();
			}
			switch (i) {

			case 1:

				do {
					selectGetNumber();
				} while (maxMin(numbers) == false); {

				System.out.print("���� ��ȣ : ");
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
			 // Lotto.txt�� ������ ���θ���ڴ�
			
			//bos = new BufferedWriter(fos); // ������Ȱ �ϴ¾ַ� line ������ ����

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
		System.out.println("���� ���� 6�� �Է�(1~45) : ");
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
		System.out.print("��÷��ȣ : ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.printf("%d�� �¾ҽ��ϴ�! ", count);
		System.out.println();
		System.out.println();
		// ����(��� �Լ�) (6���� ���� ���ؼ� 6���� ���� ����� ������ 5���� ũ�ų� ����
		// 10���� �۰ų� ������ ��ȣ �����ϰڴ�)
		// (avg >= 5 && avg <= 10) true ���� ... ������ �ٸ��� ������
	}

	private boolean maxMin(int[] numbers) {
		int max = numbers[numbers.length - 1];
		int min = numbers[0];

		return (max >= 40 && min <= 10); // �ִ밪�� 40�̻� , �ּҰ��� 10����

	}

	public static void main(String[] args) {

		LottoHomework lotto = new LottoHomework();
		lotto.showLottoMenu();

	}

}