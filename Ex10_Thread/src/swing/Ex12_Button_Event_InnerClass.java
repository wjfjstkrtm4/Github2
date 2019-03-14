package swing;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//��ư�� Ŭ���� �̺�Ʈ ó��
//�������̽� �˻� (ActionListener)
//Handler class 
class Btn_Handler implements ActionListener{

	//actionPerformed �� ��ư Ŭ���� ȣ��Ǵ� �Լ� 
	//Btn_Handler > TextField Add > Enter
	//Btn_Handler > Button Add    > Click 
	
	private TextField txtid;
	private TextField txtpwd;
	
	public Btn_Handler(TextField txtid , TextField txtpwd){
		this.txtid = txtid;
		this.txtpwd = txtpwd;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//txt_id �ԷµȰ� ������ ����
		//txt_pwd  �ԷµȰ� ������ ����
		//System.out.println("��ư Ŭ��");
		//System.out.println(txtid.getText() + "/ " + txtpwd.getText());
		
		if(txtid.getText().equals("kglim")){
			System.out.println("�氡 " + " / " + txtpwd.getText() );
		}else{
			System.out.println("�����ִ� �ʴ� ������ ^^");
		}
		
	}
	
}


class LoginForm extends Frame{
	Label lbl_id;
	Label lbl_pwd;
	TextField txt_id;
	TextField txt_pwd;
	Button btn_ok;
	
	public LoginForm(String title){
		super(title);
		lbl_id = new Label("ID:",Label.RIGHT);
		lbl_pwd = new Label("PWD:",Label.RIGHT);
		txt_id = new TextField(10);
		txt_pwd = new TextField(10);
		txt_pwd.setEchoChar('#');
		btn_ok = new Button("login");
		
		
		this.setLayout(new FlowLayout());//�������
		this.setSize(500, 100);
		this.setVisible(true);
		
		this.add(lbl_id);
		this.add(txt_id);
		this.add(lbl_pwd);
		this.add(txt_pwd);
		this.add(btn_ok);
		
		//�̺�Ʈ ó��
		this.btn_ok.addActionListener(new Btn_Handler(txt_id, txt_pwd));
		
	}
	
}

public class Ex12_Button_Event_InnerClass {

	public static void main(String[] args) {
		LoginForm loginform = new LoginForm("login");

	}

}
