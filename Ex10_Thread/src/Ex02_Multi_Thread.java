// Thread : ���μ������� �ϳ��� �ּ� �������(method)

// Thread ������� = �������� stack�� ��� ����ϱ�?
// 1. Thread Ŭ������ ����ؼ� ����� -> class Test extends Thread()
// �ݵ�� Thread Ŭ������ ����� ��쿡�� run() �Լ� ������ �ؾ��Ѵ� (�ݵ��) >> run()�� �ٸ� stack�� main() ����

// 2. implements Runnable �����ϴ� ��� -> class Test implements Runnable
// �ݵ�� run() �߻��Լ��� ������ �ؾ��Ѵ� (������ �������̽��� �߻��Լ��� ������ �ֱ⶧���� ������ �ؾ��Ѵ�)

// why 2������ �����ұ�? ....
// class Test extends Car {  // Thread�� ������� ���ϻ�ӹۿ��ȵǴϱ�
//}
// class Test extends Car implements Runnalbe{
//}
// �ٸ� �ڿ��� �̹� ����ϰ� �ִ� Ŭ������ ���ؼ� Thread ����� ���� ���
// ���߻���� �ȵǴϱ� ..

// Thread �߻�Ŭ������ �ƴ� �Ϲ�Ŭ���� 
// Thread ���������� ��ü�� ������ִ�

class Thread_1 extends Thread { // ������ stack ���� ������ϴ� // Thread_1�� ��ӹ޾����ϱ� Thread Ŭ������
	
	@Override 
	public void run() { // main �Լ� ���� >> ������ stack�� run()�Լ��� ���ϸ��� �ö󰣴�
		// main() �Լ��� �ϳ��� ������ٰ� �����ϸ� ���Ѵ�
		for(int i =0; i < 1000; i++) {
			System.out.println("Thread_1 " + i + this.getName());
		}
		
		System.out.println("Thread_1 run() END");
	}
	
}

class Thread_2 implements Runnable { // Thread_2�� �Ϲ� Ŭ������ -> �������̽��� ������

	@Override
	public void run() { 
		
		for(int i =0; i < 1000; i++) {
			System.out.println("Thread_2 " + i);
		}
		
		System.out.println("Thread_2 run() END");
	}
	
	
	
	}
	
	
	





public class Ex02_Multi_Thread {

	public static void main(String[] args) { // main() �Լ��� �ϳ��� ������
		
		System.out.println("Main Start");
		
		// 1. Thread_1 ��ü ����
		Thread_1 th = new Thread_1();
		th.start(); // main() �Լ��� �ö�����, stack�̶�� �޸𸮸� �����(�����ϰ�) stack�� run() ���� �÷����� .. �Ҹ�..
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("main : " + i);
		}
		
		// 2��
		 Thread_2 th2 = new Thread_2(); // �Ϲ� ��ü
		 Thread thread = new Thread(th2);
		 thread.start();
		
		
		System.out.println("Main END");
		
		
		
		
		
		
		
		
		
	}

}
