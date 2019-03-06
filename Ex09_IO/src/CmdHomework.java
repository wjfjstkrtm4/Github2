import java.beans.FeatureDescriptor;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CmdHomework {

	public static void main(String[] args) throws Exception {
//		FileWriter fw = null;
		FileReader fr = null;
//		BufferedWriter bw = null;
//		FileOutputStream fo = null;
//		BufferedOutputStream bo = null;
//		BufferedReader br = null;
		
		
		if (args.length != 3 && args.length !=4 && args.length !=2 ) {
			System.out.println("���� : java [���ϸ�] [��θ�] [rmdir] [��� ���丮] �� �Ķ� �Ѥ�");
			System.out.println("���� : java [���ϸ�] [��θ�] [rename] [��� ����,���丮] [�������, ���丮] �� �Ķ� �Ѥ�");
			System.out.println("���� : java [���ϸ�] [type] [��θ�\\�����̸�]");
			System.exit(0); // ���μ��� ����
		}
		
		File f = new File(args[0]);
		File f2 = new File(args[1]);
//		if (!  f.exists() || !f.isDirectory()) { // �������� �ʰų� ���丮 �ƴ϶��
//			System.out.println("��ȿ���� ���� ���丮�Դϴ�");
//			System.exit(0);
//		}

		if (args[1].equals("rmdir")) {
			String path = "";
			path = f + "\\" + args[2];
			File newfile = new File(path);
			if (!newfile.isDirectory()) {
				System.out.println("���͸��� �ƴմϴ�");
			} else {
				newfile.delete();
			}

		}

		else if (args[1].equals("rename")) {
			String path = "";
			String path2 = "";

			path = f + "\\" + args[2];
			path2 = f + "\\" + args[3];
			File newfile = new File(path);
			File newfile2 = new File(path2);
			if (!newfile.isFile()) {
				System.out.println("������ �ƴմϴ�");
			} else {
				newfile.renameTo(newfile2);

			}

		} else if (args[0].equals("type")) {
			// TYPE [����̺�:][���]�����̸�
			String path = "";
			path = f2 + "";

			File file = new File(path);
			
			fr = new FileReader(path);
			//br = new BufferedReader(fr);
			
			
		//	fos = new FileOutputStream("data.txt"); // ���� ���� ���
		//	bos = new BufferedOutputStream(fos);
			if (!file.isFile()) {
				System.out.println("���� ������ �ƴմϴ�");
			} else {
				int data = 0;
				while((data = fr.read()) != -1 ) {
					System.out.print((char)data);
					
				}
			//br.close();
			fr.close();
				
			}

		}

	}

}
