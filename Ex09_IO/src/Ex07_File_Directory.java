import java.io.File;

// File Ŭ����
// ���� (a.txt) > ����, ����, ����
// ���丮 (����)(C:\\Temp) : ����, ����


// ��� : ��������, ���� ����

// C# : File Ŭ����, Directory Ŭ��

// POINT : FileOutputStream, FileWriter (���� ���� ���)

public class Ex07_File_Directory {

	public static void main(String[] args) {
		
		String path = "C:\\Temp\\file.txt"; // file.txt ������� �ִٴ� ....
		File f = new File(path); // �� �� ���� file.txt ���״ϱ� �м��� �غ�
		
		String filename = f.getName();
		System.out.println("���ϸ� : " + filename);
		System.out.println("��ü��� : " + f.getPath());
		System.out.println("������ : " + f.getAbsolutePath());
		System.out.println("�� ������ : " + f.isDirectory());
		System.out.println("�� �����̴� : " + f.isFile());
		System.out.println("����ũ�� : " + f.length() + "byte");
		System.out.println("�θ��� : " + f.getParent());
		System.out.println("���� ���� ���� : " + f.exists());
		
		// f.createNewFile() // ���ϻ���
		// f.delete(); // ���� (return true, false)
		// f.canExecute() // ���� ���� �ϴ�? 
		
		
		
	}

}
