/*
�߻� Ŭ������ �������̽��� ������
1. ������ ��ü ���� �Ұ��� (new ������ ��� �Ұ�)
2. ���, ������ ���ؼ��� ��밡�� (�޸𸮿� ���� ����)
3. �����Ǹ� ���� ���� ������ ����

�߻� Ŭ������ �������̽��� �ٸ���
1. �������̽��� �����ϰ� ���� ����� ����
	Ex) interface Ia, interface Ib
	class Child implements Ia, Ib, Ic
2. �߻�Ŭ������ ���ϻ���� ��Ģ
3. �߻�Ŭ����(�ϼ��� �ڵ� + �̿ϼ��� �ڵ�)
4. �������̽��� ����� ������ �������� �̿ϼ� �ڵ�(�߻� �ڿ�)
 
* �������̽������� ����� ����(����)
  interface Ia extends Ib, Ic, Id
* �ϳ��� Ŭ������ �������� �������̽��� ���� ����
  class Child (extends Object) implements Ia, Ib, Ic
  
  ****************************************************************
  ������ ����
  
  1. �������̽��� [������] ���忡�� �����Ѵ� (�������̽��� �θ� Ÿ���̴�)
  2. ���� �������� ���� Ŭ������ ���ؼ� �ϳ��� ���� ��� (�θ� ����)
  3. �������̽��� (~able) : �� �� �ִ�, ���� �� �� �ִ� (����)
  4. ��ü���� ���� �� (��ü���� ����)

 */

interface Irepairable {}; // I ~ , ~ able ( ~ �� �� �ִ�), ���� �� �� �ִ�

class Unit2 extends Object {
	int hitpoint; // �⺻ ������
	final int MAX_HP;

	Unit2(int hp) {
		this.MAX_HP = hp;
	}
}

// ���� ����
class GroundUnit extends Unit2 {

	GroundUnit(int hp) {
		super(hp);
	}
}

// ���� ����

class AirUnit extends Unit2 {

	AirUnit(int hp) {
		super(hp);
	}
}

class Tank2 extends GroundUnit implements Irepairable {

	Tank2() {
		super(100);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank2";
	}

}

class Marine2 extends GroundUnit {

	Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine2";
	}

}

class CommandCenter implements Irepairable {

	@Override
	public String toString() {
		return "CommandCenter";
	}

}

class Scv extends GroundUnit implements Irepairable {

	Scv() {
		super(60);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Scv";
	}

	// Scv Ư��ȭ, ��üȭ, ��üȭ
	// ���� �� �� �ִ� (repair)

//	void repair(Tank2 tank) {
//		if(tank.hitpoint != tank.MAX_HP) {
//			tank.hitpoint += 5;
//		}
//		
//	}
//	
//	void repair(Scv scv) {
//		if(scv.hitpoint != scv.MAX_HP) {
//			scv.hitpoint += 5;
//		}
//	}

	// ���) ������ ...
	// scv�� unit�� ������ŭ repair�� ������ �־�� �Ѵ�
	// unit �߰��� repair �Լ� �߰�
	// ����� : �ϳ��� �Լ��� �ٸ� ��� unit�� ���� �� �� ������?
	// 1. ���� : void repair(GroundUnit unit) ... Marine2 (repair (x))

	// 2. ���� : void repair(Irepairable repairunit)
	// Irepairalbe �θ�Ÿ�� ---> �ڽ� Ÿ�� Scv, CommandCenter, Tank2
	// ��� : repairunit. ���������� ���� �� �� �ִ� �ڿ��� ����� ....

	void repair(Irepairable repairunit) {
		// 1. Tank2, Scv, CommandCenter
		// if(scv.hitpoint != scv.MAX_HP) {scv.hitpoint+=5};

		// �θ� Ÿ�� ���� = �ڽ� Ÿ�� �ּ�
		// Tv t = new Tv();
		// Product product = (Product)t; // casting ����

		// Tv t2 = (Tv)product; // ������� ĳ����

		/*
		 * Irepairable | Object | Unit2 | GroundUnit | Tank2
		 * 
		 */

		// ������ ��ü�� Ÿ���� �� �Ǵ�
		if (repairunit instanceof Unit2) {
			// downcasting
			Unit2 unit = (Unit2) repairunit;
			// unit.hitpoint
			// unit.MAX_UP

			if (unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint = unit.MAX_HP; // ü��ȸ��
			}
			// CommandCenter ��ü�� �ּҰ� parameter�� �ü� ������ repair�� ����� �ƴϴ�
			// void repair(Irepairable repairunit)

		} else {
			System.out.println("unit �ƴϿ��� ....�ٸ� repair");
			// �ʿ��� �ڵ� ����
		}
	}

}

public class Ex03_Interface {

	public static void main(String[] args) {

		Tank2 tank = new Tank2();
		Marine marine = new Marine();
		Scv scv = new Scv();

		// ����
		tank.hitpoint -= 20;
		System.out.println("��ũ ���� : " + tank.hitpoint);
		System.out.println("�� �ļ� ���߾� ��������");
		scv.repair(tank);
		System.out.println("�����Ϸ�" + tank.hitpoint);

		// scv.repair(marine); ���� ��ü�� �� �� ����
		CommandCenter center = new CommandCenter();
		scv.repair(center);
	}

}
