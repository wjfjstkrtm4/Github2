import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



class LoginForm3 extends Frame{
	Label lbl_id;
	Label lbl_pwd;
	TextField txt_id;
	TextField txt_pwd;
	Button btn_ok;
	
	public LoginForm3(String title) {
		super(title);
		lbl_id = new Label("ID:", Label.RIGHT);
		lbl_pwd= new Label("PWD:", Label.RIGHT);
		
		txt_id = new TextField(10);
		txt_pwd = new TextField(10);
		txt_pwd.setEchoChar('*');
		btn_ok = new Button("login");
		
		this.setLayout(new FlowLayout()); //add �� �������
		this.setSize(500, 100);
		this.setVisible(true);
		
		this.add(lbl_id);
		this.add(txt_id);
		
		this.add(lbl_pwd);
		this.add(txt_pwd);
		
		this.add(btn_ok);
		
		// 1. �ٸ� Ŭ���� �ڿ� ��� (������ �ּҰ� �ޱ�)
		// 2. Inner class ����ؼ� Outter�� ������ id, pwd ���� �Լ����� ���
		// Ŭ������ ���� ��� .....
		// 3. Ŭ�������� ���� �ʿ䰡 �ֳ���? ...
		// 3.1 ���뼺�� �߿����� �ʾƿ� ? ..
		// 3.2 ������ ������ �ڵ�� ��ư Ŭ���� ó���ǰ� ���� �ʿ���µ�
		
		// ���� (�͸�Ÿ��) - 1ȸ�� - ���뼺�� ���� - �ڵ��� ����ȭ ....
		// �͸� Ÿ�� (������ �������̽��� ���� ��ü ������ �Ұ���)
		// �������̽��� Ŭ���� ���̵� ���� �����ϴ� ��� ���� (�͸� Ÿ��)
		
		btn_ok.addActionListener(new ActionListener() { // ActionListener�� �����ϴ� Ŭ������ ������ �ʰ� ��� �����ϴ�
														// ���뼺�̾���, 1ȸ�����θ� �� ���̶�� �ڵ带 �̷��� §��
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String id = txt_id.getText().trim();
				String pwd = txt_pwd.getText();
				
				if(id.equals("hong")) {
					System.out.println("���� �氡 / " + pwd);
					
				} else {
					System.out.println("���� ���� �ִ� ���� �ƴϴ�");
					
				}
			}
		});
		
		
		this.addWindowListener(new WindowAdapter() { // �Ϲ� Ŭ���� (�ʿ��Ѱ͸� ������ �� �� �ִ�)
			@Override
			public void windowClosing(WindowEvent e) { // ������ ���ؼ� ���ϴ� ����
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
			}
		});
		
		// �͸�Ÿ�� - 1ȸ�� - �������̽� ���� ���� (�������� �ʰ�)
		// ���� ������� �ʴ� �߻��Լ��� �����ϰ� �ִ� ....
		/*
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		*/
	
	}
}

public class Ex15_Button_Event_InnerClass {

	public static void main(String[] args) {
		
		LoginForm3 login = new LoginForm3("�α���");

	}

}
