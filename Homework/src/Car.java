
public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void starCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	final public void run() { // final �� �ٿ��� �����Ǹ� ���ϵ��� ���´�
		starCar();
		drive();
		stop();
		turnOff();
		
	}
}
