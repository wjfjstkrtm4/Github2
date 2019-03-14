package swing;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//�̺�Ʈ ó��
//1. Event Resource : �߻���(Button , TextField , TextArea)
//2. Event Handler  : ó����(��ư Ŭ���Ǹ� > â�� �ݱ� , â�� ���� , ���� ��������)
//JAVA API : Interface ���� > class aaa implements �������̽�(�̺�Ʈ�� ������ �ִ�)
//�������̽� : �̺�Ʈ (���) ����� �Ͼ���� ȣ��Ǵ� (����) �Լ����� ������ �ִ�

//3. Resource  ��  Handler  �� ���̴� �۾� (����)

class EventHandler implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	//������ ��� : window â�� ������
	@Override
	public void windowClosing(WindowEvent e) { //�߻���(Frame) �ּ�
		//ȣ����� : Frame Closing �Ҷ�
		//System.out.println("ȣ��");
		e.getWindow().setVisible(false); //������ �ʱ�
		e.getWindow().dispose(); //�޸� ����
		System.out.println("â�ݱ� ����");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}



public class Ex11_Event {

	public static void main(String[] args) {
		 Frame f = new Frame("login");
		 f.setSize(300, 200);
		 f.addWindowListener(new EventHandler());
		 f.setVisible(true);

	}

}
