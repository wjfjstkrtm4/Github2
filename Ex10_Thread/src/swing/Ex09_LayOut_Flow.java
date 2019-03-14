package swing;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;


public class Ex09_LayOut_Flow {

	public static void main(String[] args) {
		Frame f = new Frame("Flowlayout");
		f.setSize(800, 600);
		f.setLayout(new FlowLayout(FlowLayout.LEFT)); //���Ĺ��
		//��ư 10�� ���� Frame �� add �غ�����
		Button[] btns = new Button[10];
		for(int i = 0 ; i < btns.length ; i++){
			btns[i] = new Button("btn-" + i);
			f.add(btns[i]);
		}
		
		f.setVisible(true);
	
	}

}
