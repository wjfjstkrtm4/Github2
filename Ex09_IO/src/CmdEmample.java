import java.io.File;

public class CmdEmample {

	public static void main(String[] args) throws Exception {
		// java ExDos C:\Temp mkdir newDir
		// java ExDos C:\Temp rename file.txt file2.txt
		// java ExDos C:\Temp delete new.txt

		if (args.length != 3 && args.length != 4) {
			System.out.println("���� : [java���ϸ�] [���丮���] mkdir [�������丮��]");
			
			System.exit(0);
		}

		File f = new File(args[0]);
		if (!f.exists() || !f.isDirectory()) { // �������� �ʰų� ���丮 �ƴ϶��
			System.out.println("��ȿ���� ���� ���丮�Դϴ�");
			System.exit(0);
		}

		if (args[1].equals("mkdir")) {
			String path = "";
			path = f + "\\" + args[2];
			File newfile = new File(path);
			if (newfile.exists()) {
				System.out.println("�̹� �����ϴ� ���丮�Դϴ�");
			} else {
				newfile.mkdir();
			}
		}

	}

}
