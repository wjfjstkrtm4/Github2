import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Stream ����� : File (read, write) : ��ũ�� �����ϴ� ������ ����
// FileInputStream, FileOutputStream
// text ��� �۾� : C:\\Temp\\a.txt



public class Ex02_POINT_File_Read_Write {

	public static void main(String[] args) {
		
		// 1�ܰ�
		// POINT : I/O �۾��� ������ �÷����� ����� �ƴϴ�
		// �����۾��� �־�� �۾��� ������  �ڿ��� �����Ѵ�
		// (�Լ� : close() -> ���������� �Ҹ��� �Լ� ȣ��)
		
		/*
		FileInputStream fs = null;
		try {
			fs = new FileInputStream("C:\\Temp\\a.txt");
			int data = 0; // ��Ʈ���� 1Byte�� �ְ�, 
			while((data = fs.read()) != -1) { // 1Byte�� �о ���������� �ٲ۴�
			
			************************************************************
			stream��ü�� 1byte�� �����͸� �а�, ����
			
		
				System.out.println("����(����)" + data);
				// H read ���������� ����
				// �ƽ�Ű �ڵ�ǥ �������� �� ������
				System.out.println((char)data);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fs.close(); // �������� ����, ���������� ���� �ݱ�
			} catch (IOException e) {
				
				e.printStackTrace();
			} 
		}
		
		 */
		
		
		FileInputStream fs = null;
		FileOutputStream fos = null;
		String path = "C:\\Temp\\a.txt";
		
		try {
			fs = new FileInputStream(path); // read
			fos = new FileOutputStream("C:\\Temp\\new.txt"); // write
			
			// write
			// FileOutputStream Ŭ������ Temp ���� �ȿ� new.txt�� �������������� 
			// �ڵ����� ������ �����մϴ� >> ������ ���Ͽ� ����(write)
			
			// new FileOutputStream(("C\\Temp\\new.txt", true);
			// �������� �ι�° ���ڰ� (true)
			// ���� ������ : append
			
			// new FileOutputStream(("C\\Temp\\new.txt", true);
			// default (false)
			// ���� ������ : overwrite
			
			
			int data = 0;
			while((data = fs.read()) != -1) {
				fos.write(data); // new.txt (encoding)
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			
			try {
				fos.close();
				fs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
