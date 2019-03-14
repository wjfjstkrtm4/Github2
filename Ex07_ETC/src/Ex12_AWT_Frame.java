import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// AWT(CS ���α׷��� ���� �� �ִ� class ����)
// JAVA ��� ���� �޸���, ���� �� ........ (���� JAVA WEB �߽�)


// AWT >> SWING (���� �ڹ� �ڵ�� ������)
// component(class ����) : ��ư, ������ �� .. ����� ���Ҿ��

class MyFrame extends Frame {
	MyFrame(String title) {
		super(title);
	}
	
}

// �̺�Ʈ ���� (�̺�Ʈ ��� ������� �ִ� .... click, mouseover)
class BtnClick_Handler implements ActionListener {

	// click ���� �ڵ鷯(�Լ�)
	// ��ư�� click�ϸ� actionPerformed �Լ��� �ڵ� ȣ��
	@Override
	public void actionPerformed(ActionEvent arg0) { // �̺�Ʈ ��ư�� Ŭ���ϸ� �߻��ϴ� ...
		// ���� �ڵ�� �������
		// 112
		// �׳� ������ �ִ�
		System.out.println("�����ڰ� ���ϴ� ���� ����");
		
		
	}
	
}




public class Ex12_AWT_Frame {

	public static void main(String[] args) {
		
		MyFrame frame = new MyFrame("Login");
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setLayout(new GridLayout());
		
		Button btn = new Button("�� ��ư�̾�");
		Button btn2 = new Button("Two Button");
		Button btn3 = new Button("Three Button");
		
		frame.add(btn);
		frame.add(btn2);
		frame.add(btn3);
		
		// �͸�Ÿ�� (�������̽��� ���� �������� �ʰ� �ٷ� ��ü�� ���� ���� ���
		// �ڵ差 ...
		// ��ȸ�� (���뼺)
//		btn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("�����ڰ� ���ϴ� ���� ����");
//				
//			}
//		});
		
		
		
		
		// ActionListener �����ϴ� Ŭ������ ��ü ���� >> ���� ���� (btn, btn2)
		BtnClick_Handler handler = new BtnClick_Handler(); // �̺�Ʈ�� ��ư�� �ο��ϱ� >> addActionListener
		btn.addActionListener(handler);
		btn2.addActionListener(handler);
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�������̽��� ���� �ڵ� ... (�͸�Ÿ��) ���� Ŭ������ �����");
				
			}
		});
		
		
		
		
		
	}

}
