import javax.swing.JOptionPane;

/*

����
main �Լ� ������ Thread 2�� ����
1. �ð�(time) �����ϴ� Thread
2. �ܾ� �Է��� ó���ϴ� Thread

main �Լ����� 2�� Thread start

�� �ܾ �ϳ��� �Է��ؼ� Ȯ�� ��ư�� ������ �ð��� ���߰�
���α׷� ���� �ǰ� �ϼ��� .....

Hint : static �ڿ� Ȱ��


*/
class WordInputProcess extends Thread{
	@Override
	public void run() {
		String dan="2";
		String inputdata = JOptionPane.showInputDialog("dan" + "�� ���� �Է�");
		if(inputdata != null && !inputdata.equals("")) {
			Ex05_WorldGame.inputcheck = true;
		}
		System.out.println("�Է��� ����: " + inputdata);
	}
}


class WordTimeOut extends Thread{
	@Override
	public void run() {
		for(int i=10; i > 0 ; i--) {
			
			if(Ex05_WorldGame.inputcheck)return; //run�Լ� Ż��
			
			System.out.println("���� �ð�: " + i);
			try {
				 Thread.sleep(1000); //���ǿ��� 1�ʰ� ������ ....
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
public class Ex05_WorldGame {
		//���� : static 
		static boolean inputcheck= false; //HINT
		public static void main(String[] args) {
			WordInputProcess word = new WordInputProcess();
			WordTimeOut time = new WordTimeOut();
			
			word.start();
			time.start();
			
			try {
				word.join(); // main �Լ� �����忡�� ��ٷ��޶�� ����մϴ� // �� ������ ���� ��ٷ���~~
				time.join(); // main �Լ� �����忡�� ��ٷ��޶�� ����մϴ� // �� ������ ���� ��ٷ���~~
			} catch(Exception e) {
				
			}
			
			
			//word.join(); //main Thread���� ���� ���������� ��ٷ� �޶� ��
			               //main �Լ��� word ��� Thread �� ������ �ִ�
			//time.join(); ////main Thread���� ���� ���������� ��ٷ� �޶� ��
			
			//main �Լ����� ��ٷ� �޶�� ���� ������ ���������� ... word, join
			
			//Join �޼ҵ�� �ϳ��� �����尡 �ٸ� �����尡 �ϴ� ���� �Ϸ�� �� ���� ��ٸ����� �� �� ���δ�.
			//���� ���� ���ư��� �ִ� ������(A)���� �� �ٸ� ������(B) �� �Ϸ�� �� ���� ��ٸ����� �Ѵٸ�, 
            //B.join();
			
            //�̷��� ȣ�� ���ָ� �ȴ�. �̷��� �ϸ�,  
			//���� ���ư��� �ִ� ������ A �� ������ B �� �ϴ� ���� ��ĥ �� ����, 
			//�����ְ�(pause) �ȴ�. join �޼ҵ带 �����ε�(overloading) �� �޼ҵ� ���� �ִµ� 
			//�� �޼ҵ���� �����ڰ� �� ���� �����ְ� �� ���� ������ �� �ִ�.
			
			// join() : �ٸ� �������� ���Ḧ ��ٸ�
			// ���� ����� �ϴ� ��Ȳ���� �������� ����� ó���Ҷ�
			// �渶���� �������� ������ �����ٶ� (��Ⱑ ����Ǹ�)
			System.out.println("Main END");
			
		}
}











