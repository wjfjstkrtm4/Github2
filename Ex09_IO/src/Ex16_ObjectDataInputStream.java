import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import kr.or.bit.UserInfo;

// userData.txt�� ����ȭ�� ������ read �ؼ� >> ������ȭ >> �ٽ� ���� >> ��ǰ Ȯ��
public class Ex16_ObjectDataInputStream {

	public static void main(String[] args) {
		
		String filename = "UserData.txt";
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null;
		
		
		try {
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			in = new ObjectInputStream(bis); // ������ȭ ...
			
			// UserInfo r1 = (UserInfo)in.readObject(); // object�ϱ� �ٿ�ĳ���� �Ѱ���
			// UserInfo r2 = (UserInfo)in.readObject(); // ������ȭ (����) - ��ũ ������ ����ģ���� �������Ѱ���
			
			
			// System.out.println(r1.toString());
			// System.out.println(r2.toString());
			
			// �ٵ� �������� ��� ��ü�� �ִ��� �𸣴ϱ�
			// ������ ���� �ȵǰ� while���� ���ؼ� ����Ѵ�
			
			// ��ü ���� read ... ��ü�� ���ٸ� null �� ��ȯ
			Object users = null;
			while((users = in.readObject()) != null)  {
				System.out.println(users.toString());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				in.close();
				bis.close();
				fis.close();
				
			} catch (Exception e2) {
				
			}
		}
			
		

	}

}
