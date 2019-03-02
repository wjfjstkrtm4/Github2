/*
��Ÿũ����Ʈ

����(unit)

unit ������ (�̵���ǥ, �̵�, �����)
unit �̵���� �ٸ��� (unit ....)

���� : unit Ŭ���� ���� ���� ���� .... ������ unit ����� ...

 */

abstract class Unit {
	int x, y;
	
	void stop() {
		System.out.println("Unit Stop");
	}

	// ��� ������ �̵��� ������ ������, ���ָ��� ����� �ٸ���
	
	abstract void move(int x, int y); // ���ư���, �ɾ�� 
	// �߻��Լ�(�ڿ�) -> ��üȭ, Ư��ȭ, ��üȭ ...

}

class Tank extends Unit {

	
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank �̵� : " + this.x + "," + this.y);
		
	}
	
	// Tank ��üȭ, Ư��ȭ  ..
	void changeMode() {
		System.out.println("��ũ ��ȯ ��� ����");
	}
	
	// �ʿ��ϴٸ� .... ����
	
}

class Marine extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine �ɾ �̵� : " + this.x + "," + this.y);
		
	}
	
	void stimpack() {
		System.out.println("������ ��ɻ��");
	}
}

class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("DropShip ���� �̵� : " + this.x + "," + this.y);
		
	}
	
	void load() {
		System.out.println("Unit load");
	}
	
	void unload() {
		System.out.println("Unit unload");
	}
	
}



public class Ex02_abstract_class {

	public static void main(String[] args) {
			Tank t = new Tank();
			t.move(100, 200);
			t.stop();
			t.changeMode();
			
			Marine m = new Marine();
			m.move(300, 200);
			m.stop();
			m.stimpack();
			
			
		
			// 1. Quiz ��ũ 3�븦 ����� [���� ��ǥ]
			// ��ũ�� �迭�� ������
			Tank[] tankarr = {new Tank(), new Tank(), new Tank()};
//			for(Tank ta : tankarr) {
//				ta.move(10, 200);
//			}
			
			for(int i = 0; i<tankarr.length; i++) {
				tankarr[i].move(10, 200);
				
			}
			
			// 2. Quiz
			// Tank, Marie, DropShip 3���� unit�� ���� ��ǥ�� �̵� ��Ű����
			// void Buy(Product p)
			// cart >> Product[] cart...
			
			Unit[] unitarr = {new Tank(), new Marine(), new Dropship()};
			for(Unit u : unitarr) {
				u.move(111, 222);
			}
			
			// Today Point
			// ���� �ٸ� �͵��� ���� �θ�� ���� ....
			// ������
		
	}

}
