import java.util.Scanner;

public class Ex09_Operation_Quiz {

	public static void main(String[] args) {
		
		int su = 0;
		int su2 = 0;
		String opr = "";
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է°�> " );
		su = Integer.parseInt(sc.nextLine());
		
		System.out.println("�Է°�(��ȣ)> ");
		opr = sc.nextLine();
		
		System.out.println("�Է°�> ");
		su2 = Integer.parseInt(sc.nextLine());
		
		
		if(opr.equals("+")) { //���ڿ��� ���ϴ� �޼ҵ� equals()
			result = su + su2;
		}
		else if(opr.equals("-")) {
			result = su - su2;
		}
		
		else if(opr.equals("*")) {
			result = su * su2;
		}
		
		else if(opr.equals("/")) {
			result = su / su2;
		}
		
		else {
			System.out.println("��ȣ�� �߸��Ǿ����ϴ�");
			return; // �޼ҵ��� ������ ���� -> main �޼ҵ带 ���� -> ���α׷� ����
		}
		
		
		System.out.printf("[%d] [%s] [%d] [%d]", su, opr, su2, result);
		//System.out.println("������ : " + "[" + su + "]" + "["+ opr + "]" + "["+ su2 +"]" + "=" +  result);
	}

}
/*
������ ��Ģ ����� (+ , - , * , /)
�Է°� 3�� (�Է°��� nextLine() �޾Ƽ� �ʿ��ϴٸ� ���� ��ȯ)
���� : Integer.parseInt() ,  equals() Ȱ��
ȭ��
>�Է°�:100
>�Է°�(��ȣ): +
>�Է°�:600
>������ :700

-------------
>�Է°�:100
>�Է°�(��ȣ): -
>�Է°�:100
>������ :0
*/