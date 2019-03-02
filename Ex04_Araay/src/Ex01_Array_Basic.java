import java.util.Arrays;

// �迭(Array)�� ��ü�� -> heap �޸𸮿� �ö󰣴�

public class Ex01_Array_Basic {

	public static void main(String[] args) {
		
		int[] score = new int[3];
		System.out.println("score���� (����) : " + score); // �迭���� ���� �ּ�
		System.out.println(score[0]);
		score[1] = 333;
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		// Array ������ ���� ������ �ִ� (�� ���� ũ���(int) 4byte)
		// ������ �濡���� ������ : ÷��, index �� ���� : �迭�� ���� �� : 0
		// score[0], score[1], score[2]
		// �迭�� ������(length) 3��
		// �迭�� ������ ÷�ڰ��� : length-1
		// �迭�� Ÿ���� default ���� ������
		
		// score[3] = 500;
		// ����(Exception �߻�) >> ���� >> ���α׷��� ��������
		// java.lang.ArrayIndexOutOfBoundsException: 3
		// ���� ���ô� ...
		
		// Array �� ������ ���� ���� ��� ? for
		
		
		for(int i = 0; i<3; i++) {
			System.out.printf("score[%d] = %d\t", i, score[i]);
		}
		
		System.out.println();
		
		
		for(int i = 0; i<score.length; i++) {
			System.out.printf("score[%d] = %d\t", i, score[i]);
		}
		
		System.out.println();
		// Array ���� �����ִ� ���� Ŭ����(helper Ŭ����)
		String result = Arrays.toString(score); // [0, 333, 0] ��ȯ
		System.out.println(result);
		

		score[0] = 666;
		result = Arrays.toString(score);
		System.out.println(result);
		
		Arrays.sort(score); // ���� ������ ���� (���� �ȵǿ� ��а�...)
		result = Arrays.toString(score);
		System.out.println(result);
		
		
		
		// POINT (�ϱ�)
		
		// �迭�� ����� 3���� ���
		int[] arr = new int[5]; // �⺻ : ���� ũ��
		int[] ar2 = new int[] {100, 200, 300}; // ����(�ʱⰪ) �����ؼ� �迭����
		int[] arr3 = {11, 12, 13, 14, 15}; // ���� ���� (�����Ϸ��� ���������� new�� ����)
		
		// javascript : var cars = ["Saab", "Volvo", "BMW"]; 
		
		for(int i = 0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		// Car c;
		// c = new Car();
		
		int[] arr4; // �迭 ���� (�ּҰ��� �ƴ϶� null�� ���´�)
		// arr4 = {21, 22, 23, 24, 25};
		arr4 = new int[] {21, 22, 23, 24, 25};
		// ����� �Ҵ��� �и��Ҷ��� �ݵ�� new�� ����ؾ� �Ѵ�
		// ���� ���� �Ŀ� �� ����� �����Ҷ��� new �����ڸ� ����Ѵ�
		
		int[] arr5 = arr4; // �ּ� �� �Ҵ�
		System.out.println(arr4 == arr5); // ���� �ּҸ� �ٶ󺸰��ִ�

		
		// �迭�� 8���� �⺻Ÿ�� + String + ����� ���� Ŭ���� ...
		
		char[]ch = new char[10]; // default ���� '\0000'
		for(int i = 0; i< ch.length; i++) {
			System.out.println("> :" + ch[i] + "<");
		}
		
		
	
		
		
		
	}

}
