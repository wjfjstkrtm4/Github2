import java.io.File;
import java.util.ArrayList;
import java.util.List;

// �����ȿ��ִ°͸� �����ִµ�
// ������ �������� ���� �ְ� ����°� �� ������
public class Ex10_File_Sublist {
	
	static int totalFiles = 0; // ��ü�� �����ڿ� �� �ƴϰ� static ����
	static int totaldirs = 0;
	
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("���� : java [���ϸ�] [��θ�] �� �Ķ� �Ѥ�");
			System.out.println("���� : java Ex10_File_Sublist C:\\Temp");
			System.exit(0); // ���μ��� ����
		}
		
		File f = new File(args[0]); //  C:\\Temp�� �����ͼ� �м��Ѵ�
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮");
			System.exit(0);
			
		}
		// �� ���� (������� �ǴܵǴ� ������ ���������� �ѱ�ڴ�)
		printFileList(f);
		System.out.println("�� ���ϼ� : " + totalFiles);
		System.out.println("�� ������ : " + totaldirs);

	}
	
	static void printFileList(File dir) {
		
		System.out.println("[Full Path : " + dir.getAbsolutePath() + "]");
		
		// ���� 1 Collection ��� ����
		List<Integer> subDir = new ArrayList<Integer>();
		// for������ ���͸��� files�� �ε������� �����Ѱ��� �ϴ�
		
		File[] files = dir.listFiles(); // C:Temp �Է��ߴٸ� ���� �ڿ��� �迭�� �����
		
		// C:\\Temp [0] : a.txt
		// C:\\Temp [1] : file.txt
		// C:\\Temp [2] : c.jpg �̷� ������ File[] ��Ƽ� ����
		
		
		for(int i = 0; i < files.length; i++) {
			String filename = files[i].getName(); // ������ �Ǵ� ���ϸ��� �Ѿ��
			if(files[i].isDirectory()) {
				filename = "<DIR> [" + filename + "]";
				//POINT
				// ���� (add) �ǹ�
				subDir.add(i);
			
			} else {
				filename = filename + " / " + files[i].length() + "Byte";
			}
			
			System.out.println("	" + filename);
			
		}
		
		// ����
		
		int dirnum = subDir.size();
		int filenum = files.length - dirnum;
		
		// ���� ��
		totaldirs += dirnum; // ������ ���� ���� ����
		totalFiles += filenum; // ���Ͽ� ���� ���� ����
		
		System.out.println("[Current dirnum] : " + dirnum);
		System.out.println("[Current filenum] : " + filenum);
		System.out.println("*******************************************");
		
		// ���� for �� �ؼ� // ���ȣ��
		for(int j = 0; j < subDir.size(); j++) { 
			int index = subDir.get(j); // ArrayList�� �濡 ���� ����Ǿ��ִ� ���͸��� �ּҸ� index�� �ְ�
			printFileList(files[index]);
			// files
			
		}
		
		
		
	}
	

}

