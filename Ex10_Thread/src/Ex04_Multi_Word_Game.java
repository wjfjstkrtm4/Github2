import javax.swing.JOptionPane;

class WordTime extends Thread {
	
	@Override
	public void run() { // main() �� ����
		for(int i = 10; i > 0; i--) {
			System.out.println("���� �ð��� : " + i);
			try {
				Thread.sleep(1000); // CPU�� �����ϴ� �ʴ� ��� ����
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}


public class Ex04_Multi_Word_Game {

	public static void main(String[] args) {
		
		WordTime time = new WordTime();
		time.start(); // ������ ����� run()�Լ��� �����Ѵ�
		
		String inputdata = JOptionPane.showInputDialog("���� �Է��ϼ���");
		System.out.println("�Է°� : " + inputdata);
	

	}

}
