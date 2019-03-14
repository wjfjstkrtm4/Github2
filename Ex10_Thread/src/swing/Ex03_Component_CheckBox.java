package swing;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

//Checkbox > Checkbox , radio �ΰ�����Ȱ (�׷�)
public class Ex03_Component_CheckBox {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(300, 200);
		f.setLayout(new FlowLayout()); //���� -> ������ ������� ��ġ
		
		Label q1 = new Label("�����ϼ���");
		Checkbox news = new Checkbox("news", true);
		Checkbox music = new Checkbox("music");
		Checkbox game = new Checkbox("game");
		f.add(q1);
		f.add(news);
		f.add(music);
		f.add(game);
		
		Label q2 = new Label("���ϼ���");
		CheckboxGroup group = new CheckboxGroup(); //�׷�ȿ��� ���ϼ���
		Checkbox M = new Checkbox("��",true,group);
		Checkbox G = new Checkbox("��",false,group);
		
		
		f.add(q2);
		f.add(M);
		f.add(G);
		
		
		f.setVisible(true);
		
		

	}

}
