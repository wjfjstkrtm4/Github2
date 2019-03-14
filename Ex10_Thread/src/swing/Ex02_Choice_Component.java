package swing;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;


public class Ex02_Choice_Component {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(500, 300);
		f.setLayout(null);
		//Layout ���� (������ ���� ��ġ ������ ���ؼ� ȭ�� ����)
		//component �� Ư����ǥ�� ��ġ
		
		Choice day = new Choice();
		day.add("MON");
		day.add("TUE");
		day.add("SAT");
		day.setSize(100,50);
		day.setLocation(30,60); // ������ layout ������ ...
		
		Button btn = new Button("Button");
		btn.setSize(50, 30);
		btn.setLocation(150, 60);
		
		
		List SelectOne = new List(6,true);
		SelectOne.setSize(100,80);
		SelectOne.setLocation(250, 100);
		SelectOne.add("AAA");
		SelectOne.add("BBB");
		SelectOne.add("CCC");
		SelectOne.add("DDD");
		
		
		
		f.add(day);
		f.add(btn);
		f.add(SelectOne);
		f.setVisible(true);
		
		
		

	}

}
