
public class Practice01 {

	public static void main(String[] args) {
		
		int jumsu = (int)((Math.random()*10)+1)*100;    
		String object = "";        
		switch(jumsu) {            
		case 1000: object += "Tv, ";            
		case 900: object += "NoteBook, ";            
		case 800: object += "�����, ";            
		case 700: object += "�ѿ켼Ʈ, ";            
		case 600: object += "����";            
		break;            
		default : object = "ĩ��";        }        
		System.out.println("������ "+jumsu+"�� �Դϴ�.");        
		System.out.println("����� " + object + " �� ��÷ �Ǽ̽��ϴ�.");
		/*
		������� �ϴ� �ý����� ��ȭ�� ��ǰ ��÷ �ý����Դϴ�
		��ǰ ��õ�� 1000������ ������
		��ǰ���� Tv, NoteBook, �����, �ѿ켼Ʈ, ����
		��ǰ ��õ�� 900������ ������
		��ǰ���� NoteBook, �����, �ѿ켼Ʈ, ����
		��ǰ ��õ�� 800������ ������
		��ǰ���� �����, �ѿ켼Ʈ, ����
		��ǰ ��õ�� 700������ ������
		��ǰ���� �ѿ켼Ʈ, ����
		��ǰ ��õ�� 600������ ������
		��ǰ���� ����
		�׿ܴ� 100 ~ 500 ������ ĩ��
		
		����ڰ� �ͼ� ��ǰ�ý��� ����ϰ� �Ǹ� �����ϰ� 100 ~ 1000������ ������ ������
		
		 */

	}

}
