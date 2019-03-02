import java.util.Scanner;

public class coofe{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Button button = new Button();
		InputMoney inputmoney = new InputMoney();
		Material material = new Material();
		int b;
		boolean c;
		while (true) {
			System.out.println("������ �Է��ϼ���.");
			int money = sc.nextInt();
			inputmoney.InputAmount(money);

			do {
				System.out.println("���� Ŀ���� ��ȣ�� �Է��ϼ���.");

				b = sc.nextInt();

				c = button.selectCoffee(b);
			
			} while (!(b >= 1 && b <= 3) ||  c ==false);
		}
	}
}

class Button {

	Material m = new Material();
	InputMoney i = new InputMoney();
	private final int AMERICANO_BUTTON = 1;
	private final int HAZELNUT_BUTTON = 2;
	private final int MILKCOFFEE_BUTTON = 3;
	private static int change;
	
	// �ܵ���ȯ��ư ����

	boolean selectCoffee(int button) {

		switch (button) {
		
		case AMERICANO_BUTTON:
			if(m.americanoQ()<=0) {
				System.out.println("��� �����ϴ�.");
				return false;
			}
			m.makeAmericano();
			change = InputMoney.amount - i.AMERICANO;
			InputMoney.amount = 0;
			System.out.println("�ܵ� : " + change);
			break;
		case HAZELNUT_BUTTON:
			if(m.HazelnutQ()<=0) {
				System.out.println("��� �����ϴ�.");
				return false;
			}
			m.makeHzn();
			change = InputMoney.amount - i.HAZELNUT;
			InputMoney.amount = 0;
			System.out.println("�ܵ� : " + change);
			break;
		case MILKCOFFEE_BUTTON:
			if(m.milkCoffeeQ()<=0) {
				System.out.println("��� �����ϴ�.");
				return false;
			}
			m.makeMilkCoffee();
			change = InputMoney.amount - i.MILKCOFFEE;
			InputMoney.amount = 0;
			System.out.println("�ܵ� : " + change);
			break;
		default:
			System.out.println("���� ��ȣ�Դϴ�.");
		}
		return true;
	}
}

class InputMoney {
	Scanner sc = new Scanner(System.in);
	Material m = new Material();
	public static int amount = 0; // ����
	public final int AMERICANO = 1000;
	public final int HAZELNUT = 2000;
	public final int MILKCOFFEE = 3000;

	public int InputAmount(int money) { // ����
		amount += money;
		System.out.println("����ݾ� : " + amount);
		while (amount < this.AMERICANO) {
			if (amount < this.AMERICANO) {
				System.out.println("���� �� �ִ� Ŀ�ǰ� �����ϴ�. ���� �� ��������.");
			}
			amount += sc.nextInt();
			System.out.println("����ݾ� : " + amount);
		}
		if (amount >= this.AMERICANO) {
			System.out.println("1. �Ƹ޸�ī��((���� �� ����)) -1000�� -" + m.americanoQ() + "�� ����");
		}
		if (amount >= this.HAZELNUT) {
			System.out.println("2. �������((���� �� ����)) - 2000�� -" + m.HazelnutQ() + "�� ����");
		}
		if (amount >= this.MILKCOFFEE) {
			System.out.println("3. ��ũĿ��((���� �� ����)) - 3000�� -" + m.milkCoffeeQ() + "�� ����");
		}
		return amount;
	}

}

class Material { // 1�� 1�κ����� ����..
	private static int hotWater = 300;
	private static int hznSyrup = 100;
	private static int coffeePowder = 300;
	private static int milk = 100;
	private static int paperCup = 300;

	public int americanoQ() { 
		int[] material = { hotWater, coffeePowder, paperCup };
		swap(material);
		return material[0];
	}

	public int HazelnutQ() {
		int[] material = { hotWater, hznSyrup, paperCup };
		swap(material);
		return material[0];
	}

	public int milkCoffeeQ() {
		int[] material = { hotWater, milk, coffeePowder, paperCup };
		swap(material);
		return material[0];
	}

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

	public int swap(int[] material) {
		for (int i = 0; i < material.length; i++) {
			for (int j = i + 1; j < material.length; j++) {
				if (material[i] > material[j]) {
					int swap = material[j];
					material[j] = material[i];
					material[i] = swap;
				}
			}

		}
		return material[0];
	}
}