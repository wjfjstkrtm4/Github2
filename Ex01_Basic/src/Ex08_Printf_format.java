import java.util.Scanner;


public class Ex08_Printf_format {

	public static void main(String[] args) {
		// java.lang package �Ʒ� �ִ� �ڿ� (import) ���� ���� ���� ��� ����
		// default�� open �Ǿ� �־
		// C# : console.WriteLine()
		// C# : console.ReadLine()
		// java : System.out.println
		
		System.out.println("A"); // �ٹٲ�
		System.out.print("B");
		System.out.println("C");
		System.out.println("D");
		System.out.println("S");
		
		int num = 100;
		System.out.println(num);
		System.out.println("num : " + num + " �Դϴ�");
		
		// ���� (format) ���� (���)
		// %d (10���� ������ ����)
		// %f (�Ǽ�)
		// %s (���ڿ�)
		// %c (����)
		// Ư������ : \t (��Ű), \n����)
		System.out.printf("num ���� : %d �Դϴ�\n" , num);
		System.out.printf("num�� ���� [%d] �Դϴ�, �׸��� [%d] �� �־��\n", num, 1000);
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f�� ���� ���� : %f �Դϴ�\n", f);
		
		System.out.printf("���ڿ� ���� %s�� ����ϰ�, %d ���� ���� ���\n", "�ȳ�", 200);
		
		// cmd (console) ���� ����ڰ� �Է��� ���� read ����
		
		
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		// �� �ڵ�ó�� Ŭ������ ����Ϸ��� ����(package)�� ���� ���ƾ� �մϴ�
		// �ڹ����� ������ ��ܿ� : import java.util;
		
		// Scanner Ŭ������ �Է� ���� ���� �� �ִ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		String value = sc.nextLine(); // ����ڰ� �Է��� (����)���� read �Ѵ�
		System.out.println("�Է°� : " + value);
		
		// System.out.println("���� ���� �Է��ϼ���");
		// int number = sc.nextInt(); // ���� ������ read
		// System.out.println("number : " + number);
		
		
		// sc.hasNextFloat() Ÿ�Ժ��� �о���̴� �Լ��� �����ִ�
		// ������ �츮�� nextLine()�� ����ϰڴ�
		// ������� : �׳� ���ڷ� �о�鿩��, �ʿ��ϴٸ� ��ȯ�ؼ� ����Ѵ�
		// Today Point
		// [[[���ڸ� -> ���ڷ�]]]
		// Integer.parseInt(s) ���ڸ� ������ �ٲ���
		// IntegerŬ�����ȿ� �ִ� parseInt�Լ��� ���
		// Float.parseFloat(s) ���ڸ� �Ǽ���
		// Double.parseDouble(s) ���ڸ� �Ǽ���
		
		System.out.println("���ڸ� �Է��ϼ���");
		int number = Integer.parseInt(sc.nextLine());
		// �Է¹��� ���ڸ� ������ �ٲ㼭 ������ ������
		number += 100;
		System.out.println("���� : " + number);
		
		// ���ڸ� ���ڷ� (���� ����)
		String data = String.valueOf(1000);
		data += 100;
		System.out.println(data);
		
		
	
		// Integer.parseInt ���ڸ� ������
		// double.
	
		
		
		
	}

}
