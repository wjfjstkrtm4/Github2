import java.util.Scanner;

public class InputMoneySystem {
	static Scanner sc = new Scanner(System.in);
	public static int amount = 0; // ����
	
	public static void showMenu() {
		System.out.println("-------�޴�---------");
		System.out.println("1. �Ƹ޸�ī�� 1000��");
		System.out.println("2. ������� 2000��");
		System.out.println("3. ��ũĿ�� 3000��");
		System.out.println("������ �Է��ϼ���.");
	}
	
	public static int inputMoney() {
		return sc.nextInt();
	}
}