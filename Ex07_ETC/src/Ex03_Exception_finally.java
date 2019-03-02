import java.io.IOException;

public class Ex03_Exception_finally {
	
	static void startInstall() {
		System.out.println("INSTALL");
	}
	
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	
	static void fileDelete() {
		System.out.println("DELETE FILES");
	}
	
	public static void main(String[] args) {
		
		try {
			copyFiles();
			startInstall();
			
			// �����ڰ� ���Ƿ� [���ܸ� ����] �� �� �ִ�
			// A, B, C �����Է� ,,,, D��� �Է��ϸ� (������)
			// ����� ���� ������ (���� ��ü�� �����ڰ� ���� ����(new)
			
			throw new IOException("Install ó�� �� ���� �߻�");
			
		}catch(Exception e) {
			System.out.println("���� �޽��� ��� : " + e.getMessage());
		}finally { // ���ܰ� �߻��ϴ� �߻����� �ʴ� ������ ������
			fileDelete();
		}
		
		// ���� ���� ...
		// ******** �Լ� ����(return) �ִ� �ϴ��� finally ����� ������ 
		// �̳��� �����ϰ� �Լ��� ���� .... ********
		
		System.out.println("MAIN END");

	}

}
