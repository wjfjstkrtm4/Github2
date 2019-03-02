package VendingMachine;

import java.util.Scanner;

public class Coffe_Machine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Button button = new Button();
		InputMoney inputmoney = new InputMoney();
		Material material = new Material();
		int b;
		while (true) {
			System.out.println("������ �Է��ϼ���.");
			int money = sc.nextInt();
			inputmoney.InputAmount(money);
			
			do {
				System.out.println("���� Ŀ���� ��ȣ�� �Է��ϼ���.");

				b = sc.nextInt();

				button.selectCoffee(b);
			} while (!(b >= 1 && b <= 3));
		}
	}
}

class Button {

	Material m = new Material();
	InputMoney i = new InputMoney();
	private final int americanoButton = 1;
	private final int hazelnutButton = 2;
	private final int milkCoffeeButton = 3;
	private boolean iceHotButton; // ��������
	private static int change;
	// �ܵ���ȯ��ư ����

	void selectCoffee(int button) {

		switch (button) {

		case americanoButton:
			m.makeAmericano();
			change = InputMoney.amount - i.americano;
			InputMoney.amount = 0;
			System.out.println("�ܵ� : " + change);
			break;
		case hazelnutButton:
			m.makeHzn();
			change = InputMoney.amount - i.hazelnut;
			InputMoney.amount = 0;
			System.out.println("�ܵ� : " + change);
			break;
		case milkCoffeeButton:
			m.makeMilkCoffee();
			change = InputMoney.amount - i.milkCoffee;
			InputMoney.amount = 0;
			System.out.println("�ܵ� : " + change);
			break;
		default:
			System.out.println("���� ��ȣ�Դϴ�.");
		}
	}
}

class InputMoney {
	Scanner sc = new Scanner(System.in);
	public static int amount = 0; // ����
	public final int americano = 1000;
	public final int hazelnut = 2000;
	public final int milkCoffee = 3000;

	public int InputAmount(int money) { // ����
		amount += money;
		System.out.println("����ݾ� : " + amount);
		while (amount < americano) {
			if (amount < americano) {
				System.out.println("���� �� �ִ� Ŀ�ǰ� �����ϴ�. ���� �� ��������.");
			}
			amount += sc.nextInt();
			System.out.println("����ݾ� : " + amount);
		}
		if (amount >= americano) {
			System.out.println("1. �Ƹ޸�ī�� (O) -���� �� ����");
		}
		if (amount >= hazelnut) {
			System.out.println("2. ������� (O) -���� �� ����");
		}
		if (amount >= milkCoffee) {
			System.out.println("3. ��ũĿ�� (O) -���� �� ����");
		}
		return amount;
	}

}

class Material { // 1�� 1�κ�..
	private int hotWater = 100;
	private int hznSyrup = 100;
	private int coffeePowder = 100;
	private int milk = 100;
	private int ice = 100;
	private int paperCup = 100;

	public void makeAmericano() {
		this.paperCup--;
		this.coffeePowder--;
		this.hotWater--;
		System.out.println("�Ƹ޸�ī��");
	}

	public void makeHzn() {
		this.hznSyrup--;
		this.paperCup--;
		this.coffeePowder--;
		this.hotWater--;
		System.out.println("�������");
	}

	public void makeMilkCoffee() {
		this.milk--;
		this.paperCup--;
		this.coffeePowder--;
		this.hotWater--;
		System.out.println("��ũĿ��");
	}

	public void IceHot(boolean iceHotButton) { // �߰�����
		if (iceHotButton == true) {
			this.ice--;
		}
	}
}