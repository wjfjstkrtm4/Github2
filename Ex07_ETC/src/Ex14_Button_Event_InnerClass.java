import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class LoginForm2 extends Frame{
	Label lbl_id;
	Label lbl_pwd;
	TextField txt_id;
	TextField txt_pwd;
	Button btn_ok;
	
	public LoginForm2(String title) {
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
		//��ư�� Ŭ�� �̺�Ʈ ó���ϱ�
		//���� : parameter ��Ex14_Button_Event_InnerClass.java ó���Ǵ� ��ü�� �ݵ�� ActionListener �����ϴ� ��ü
		
		//Inner class ��ȯ (inner class >> Outer class �� �ڿ��� ��� ����)
		class Btn_Handler2 implements ActionListener{
			//���� ...id , pwd ....
			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println(txt_id.getText() + "/" + txt_pwd.getText());
				String id = txt_id.getText().trim();
				String pwd = txt_pwd.getText();
				
				if(id.equals("hong")) {
					System.out.println("���� �氡 " + pwd);
					
				} else {
					System.out.println("���� ���� �ִ� ���� �ƴϴ�");
					
				}
				
			}
			
		}
		
		btn_ok.addActionListener(new Btn_Handler2());
	
	}
}

public class Ex14_Button_Event_InnerClass {

	public static void main(String[] args) {
		
		LoginForm2 login = new LoginForm2("�α���");

	}

}
