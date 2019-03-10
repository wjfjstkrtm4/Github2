import javax.swing.JOptionPane;

/*
����
main �Լ� ������ Thread 2�� ����
ù��° ������� �ð�����
�ι�° ������� �ܾ��Է� ó��

main �Լ����� 2�� Thread ��ŸƮ
��, �ܾ �ϳ��� �Է��ؼ� Ȯ�� ��ư�� ������ �ð��� ���߰��ض� >> ���α׷�����
Hint = static �ڿ� Ȱ��
*/
/*
class Time extends Thread{
    private static int time;
    public void run() {
        for(int i = 10 ; i > 0 ; i --) {
            time = i;
            System.out.println(i+"�� ����");
            try {
                
                Thread.sleep(1000);//CPU�� �����ϰ��ִ� thread ��� �����ϴ°��� -> 1000 = 1��
                if(Input.inputdata != "") {
                    return;
                }
            }catch(Exception e) {
                System.out.println(e.getMessage());    
            }
        }
    }
}
class Input extends Thread{
    static String inputdata="";
    @Override
    public void run() {
        inputdata = JOptionPane.showInputDialog("�Է��ض�");
        System.out.println("�亯 : " + inputdata);
        
    }
}
public class Ex05_WorldGame {

    public static void main(String[] args) {
        Input i = new Input();
        Time t = new Time();
        
        i.start();
        t.start();
        
    }

}

*/

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
		// String dan="2";
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
			
			if(Ex05_WorldGame.inputcheck)
			return; //run�Լ� Ż��
			
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
		static boolean inputcheck= false;
		public static void main(String[] args) {
			WordInputProcess word = new WordInputProcess();
			WordTimeOut time = new WordTimeOut();
			
			word.start();
			time.start();

			
			System.out.println("Main END");
			
		}
}











