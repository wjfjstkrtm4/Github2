import java.io.File;

public class Ex08_File_Directory {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);

		if(args.length != 1) {
			System.out.println("���� : java ���ϸ� [���丮��]");
			System.exit(0); // ���μ��� ���� ����
		}
		
		// java Ex08_File_Directory C:\\kkkk (0)
		// java Ex08_File_Directory (X) ����  ����
		
		
		File f = new File(args[0]);
		if(!f.exists() || !f.isDirectory()) { 
			// �������� �ʰų� �Ǵ� ���丮�� �ƴ϶�� 
			System.out.println("��ȿ���� �ʴ� ��ξ�");
			System.exit(0);
			
		}
		// �������� �м�
		File[] files = f.listFiles(); // File Ÿ�� �迭 �ּҰ��� return
		
		for(int i = 0; i < files.length; i++) {
			String name = files[i].getName();
			System.out.println(files[i].isDirectory() ? "DIR-" + name : "FILE" + name);
		}
		
		
	}

}
