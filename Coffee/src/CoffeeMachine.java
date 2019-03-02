import java.util.Scanner;

public class CoffeeMachine {
	private Scanner sc = new Scanner(System.in);
	private InputMoneySystem inputmoney = new InputMoneySystem();
	
	private int totalMoney = 0;
	
	public static final Material[] materials = {
			new AmericanoMaterial(), 
			new HazelnutMaterial(), 
			new MilkcoffeeMaterial()
			};
	public static final int[] PRICE = { 1000, 2000, 3000 };
	public static final int AMERICANO = 0;
	public static final int HAZELNUT = 1;
	public static final int MILKCOFFEE = 2;
	
	private static final int AMERICANO_BUTTON = 0;
	private static final int HAZELNUT_BUTTON = 1;
	private static final int MILKCOFFEE_BUTTON = 2;
	private int change;

	private void caculateMoney (int money) { // ����
		int temp = money;
		System.out.println("����ݾ� : " + temp);
		
		while (temp < PRICE[AMERICANO]) {
			if (temp < PRICE[AMERICANO]) {
				System.out.println("���� �� �ִ� Ŀ�ǰ� �����ϴ�. ���� �� ��������.");
			}
			temp += sc.nextInt();
			System.out.println("����ݾ� : " + temp);
		}
		
		if (temp >= PRICE[AMERICANO]) {
			System.out.println("1. �Ƹ޸�ī��((���� �� ����)) -1000�� -" + materials[AMERICANO].countOfCoffee() + "�� ����");
		}
		if (temp >= PRICE[HAZELNUT]) {
			System.out.println("2. �������((���� �� ����)) - 2000�� -" + materials[HAZELNUT].countOfCoffee() + "�� ����");
		}
		if (temp >= PRICE[MILKCOFFEE]) {
			System.out.println("3. ��ũĿ��((���� �� ����)) - 3000�� -" + materials[MILKCOFFEE].countOfCoffee() + "�� ����");
		}
		totalMoney = temp;
	}
	
	// �ܵ���ȯ��ư ����

	boolean selectCoffee(Material material, int button) {

		switch (button) {
			case AMERICANO_BUTTON:
			case HAZELNUT_BUTTON:
			case MILKCOFFEE_BUTTON:
				if (material.canMakeCoffee()) {
					System.out.println("��� �����ϴ�.");
					return false;
				}
				material.make();
				change = totalMoney - PRICE[button];
				totalMoney = 0;
				System.out.println("�ܵ� : " + change);
				break;
			default:
				System.out.println("���� ��ȣ�Դϴ�.");
		}
		return true;
	}
	
	public void execute() {
		int selectNumber;
		boolean checkStock=false;
		
		while (true) {
			InputMoneySystem.showMenu();
			caculateMoney(InputMoneySystem.inputMoney());

			do {
				System.out.println("���� Ŀ���� ��ȣ�� �Է��ϼ���.");

				selectNumber = sc.nextInt();
				if (selectNumber >= 1 && selectNumber <= 3)
					checkStock = selectCoffee(materials[selectNumber - 1], selectNumber - 1);
			
			} while (!(selectNumber >= 1 && selectNumber <= 3) ||  checkStock ==false);
		}
	}
}