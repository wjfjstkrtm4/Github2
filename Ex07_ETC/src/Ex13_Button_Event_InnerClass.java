import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Btn_Handler implements ActionListener {
	private TextField txtid;
	private TextField txtpwd;

	public Btn_Handler(TextField txtid, TextField txtpwd) {
		// �����ڸ� ���ؼ� TextField �ּҰ�
		this.txtid = txtid; // �ּҰ� �Ҵ�
		this.txtpwd = txtpwd;
	}

	//id , pwd �Է��ϰ� ��ư�� Ŭ���ϸ� id,pwd ���� ������ �ͼ� ���� �̸� ������ ����
	//��ġ�ϴ��� Ȯ��
	//Ŭ�� �̺�Ʈ�� �߻��ϸ� ȣ��Ǵ� �Լ� (�ڵ鷯 �Լ�)
	@Override
	public void actionPerformed(ActionEvent e) {
		// �ʿ��� ����
		// System.out.println("ActionEvent �߻����� ��ü �ּ� : " + e.getSource());
		System.out.println(txtid.getText() + " / " + txtpwd.getText());
		if (txtid.getText().equals("hong")) {
			System.out.println("�氡�氡" + " /" + txtpwd.getText());
		} else {
			System.out.println("���� �����ΰ� ^^");
		}
	}

}

class LoginForm extends Frame { // Frame�̶�� ��ȭ��
	Label lbl_id;
	Label lbl_pwd;
	TextField txt_id;
	TextField txt_pwd;
	Button btn_ok;

	public LoginForm(String title) {
		super(title);
		lbl_id = new Label("ID:", Label.RIGHT);
		lbl_pwd = new Label("PWD", Label.RIGHT);

		txt_id = new TextField(10);
		txt_pwd = new TextField(10);
		txt_pwd.setEchoChar('*');

		btn_ok = new Button("Login");

		this.setLayout(new FlowLayout()); // add�� ������� ��ġ
		this.setSize(500, 100);
		this.setVisible(true);

		this.add(lbl_id);
		this.add(txt_id);

		this.add(lbl_pwd);
		this.add(txt_pwd);

		this.add(btn_ok);
		// ��ư�� Ŭ�� �̺�Ʈ ó���ϱ�
		// ���� : parameter �� ó���Ǵ� ��ü�� �ݵ�� ActionListener �����ϴ� ��ü �̾�� �Ѵ�
		Btn_Handler btn_handler = new Btn_Handler(txt_id, txt_pwd);
		btn_ok.addActionListener(btn_handler);

	}

}

public class Ex13_Button_Event_InnerClass {

	public static void main(String[] args) {

		LoginForm login = new LoginForm("�α���");

	}

}
