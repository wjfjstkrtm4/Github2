package swing;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;


//â (Dialog)
//���â     :����� â�� �ݾƾ� �۾� ����
//�������â :����� â�� ������� �ٸ� �۾� ����

public class Ex06_Component_Dialog {

	public static void main(String[] args) {
		/*Frame f = new Frame("�θ�â");
		f.setSize(400, 300);
		
		//Dialog info = new Dialog(f, "information",true); //true(���), false(��޸���) 
		Dialog info = new Dialog(f, "information",false); //true(���), false(��޸���) 
		info.setSize(150, 100);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());
		
		//�˾�â component �߰�
		Label msg = new Label("this is popup");
		Button btn = new Button("��ư");
		info.add(msg);
		info.add(btn);
		
		
		f.setVisible(true);
		info.setVisible(true);
		*/
		
		
		Frame f = new Frame("�θ�â");
		f.setSize(400, 300);
		f.setVisible(true);
		FileDialog fileOpen = new FileDialog(f,"my file open",FileDialog.LOAD);
		fileOpen.setDirectory("C:\\Temp");
		fileOpen.setVisible(true);
		
		System.out.println(fileOpen.getDirectory());
		System.out.println(fileOpen.getFile());
		
		
		
		
	}

}
