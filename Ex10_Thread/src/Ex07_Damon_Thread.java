// ����  : Damon Thread (����) : �ѱ� �۾��� 3�� ���� �ڵ����� (������ ����Ŭ�� main()�� �����ϴ�) = (���� �״´�)

public class Ex07_Damon_Thread implements Runnable {
	static boolean autosave = false;

	

	@Override
	public void run() { // Damon Thread
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {

			}

			if (autosave) {
				autoSaveFunction();
			}
		}

	}
	
	
	public void autoSaveFunction() {
		System.out.println("������ 3�� �������� �ڵ� ���� �˴ϴ�");
	}






public static void main(String[] args) { // �Ϲ� Thread ... (non-damon)

	Thread th = new Thread(new Ex07_Damon_Thread()); // Runnable �������̽��� �����ϰ� �ִ� ��ü�� �ּҸ� �ְڽ��ϴ�
	th.setDaemon(true); // �ʴ� ���� ������� // Daemon ������� start()�ϱ����� ������Ѵ�
	th.start(); 
	
	// main �Լ���(Ex07_Damon_Thread ����)
	// main �Լ� (�۾���)
	for(int i = 0; i <= 30; i++) {
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		
		System.out.println("Main Thread : " + i);
		if(i ==5) { // i�� 5�� �Ǵ� ��������
			System.out.println(i);
			autosave = true;
		}
	}
	
	
	
	
}

}
