import java.util.HashMap;
import java.util.Scanner;

/*
	    HashMap ����� �α��� �ý���

		//ȸ�� �α��� ������ HashMap ���� ����
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		
		//�ý��ۿ� �α��� �ϴ� �ó�����
		//ID(0) , PWD(0)  >> ȸ��  (ȯ��)
		//ID(0) , PWD(x)  >> ����  (����ٽ� �Է�)
		
		//ID(x) , PWD(x)  >> ����  (�ٽ� �Է���)
		//ID(x) , PWD(0)
		
		//Scanner ����ؼ�  ID, PWD �Է¹�������
		//loginmap ���ؼ� ���� ���� ó��
		//ID �Ǵ�  PWD Ʋ���� �ٽ� �Է� ��û
		//ID , PWD �� ������ ȸ���� �湮 ȯ���մϴ� ^^ (��� ���α׷� ����)
	    //ID �� ��ҹ��� ���о��� ó�� �մϴ�. (����ڰ� �Է��� ID ���� �ҹ��ڷ� )
*/
public class Ex13_HashMap_Quiz {

	public static void main(String[] args) {
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004"); //KIM OK
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		//ȸ�� ������ ....
		//���� �α��� �ý���
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("ID , PWD �Է��� �ּ���");
			System.out.print("ID:");
			String id = sc.nextLine().trim().toLowerCase();
			
			System.out.print("PWD:");
			String pwd = sc.nextLine().trim();
			
			if(!loginmap.containsKey(id)) { // loginmap.containsKey(id)
				System.out.println("ID �� ����� ���Է� �ϼ���");
			}else {
				if(loginmap.get(id).equals(pwd)) { // loginmap.get(id).equals(pwd)
					System.out.println("ȸ���� �氡�氡 ^^");
					break;
				}else {
					System.out.println("��� Ȯ�� �ϼ���");
				}
			}
			
		}
		
		
	}

}
