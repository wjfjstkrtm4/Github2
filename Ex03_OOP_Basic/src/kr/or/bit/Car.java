package kr.or.bit;

/*
������(������, ������) : modifer
public : (���� : ����(package) ���о��� ��� �ڿ� ����)
private : (���� : Ŭ���� ���ο����� �����ڿ�), ��������(��ü) ���Ұ� �� �ڿ�
			****��ü���� Ư¡ : ĸ��ȭ, ����ȭ****
1. Ŭ���� ���ο��� private int age;
1.1 private : �����Ҵ��� ���� �����Ҵ��� ���ؼ� �ڿ� ��ȣ
1.2 �������� �ǵ�(���ϴ� ���� ó��) age ������ 1~200 ������ ������ �ϰڴ� -> ������ �Լ��� ����
1.3 ĸ��ȭ�� �ڿ��� �����Ҵ��� ó���ϴ� Ư���� �Լ��� (getter, setter)
    private member filed �� ���ؼ� read, write �� �� ���ִ� �Լ���

1.4 private int age;
	-setter (0) �Լ�
	-getter (0) �Լ�
	
	--�ʿ信 ���󼭴� setter�� ����, getter�� �����ص� �ȴ�
 */

public class Car {

	private int window;
	private int speed;

	public int getWindow() { // read
		return window;
	}

	public void setWindow(int window) { // write
		
		this.window = window;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		// �����Ҵ��� ����
		if(speed<0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
		
	}
	
	// �ʿ��ϴٸ� �߰� �Լ�(���)
	public void speedUp() {
		speed+=10;
	}
	
	public void speedDown() {
		if(speed > 0) {
			speed-=5; // speed = speed -5;
		} else {
			speed = 0;
		}
	}
	
	
	
	
	
}
