import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Ư�� �������� �˻��� �ܾ �־�����
// �� �ܾ ���Ե� ���ϸ���� ����Ѵ�


public class Ex12_PrintWrite_String_Find {


	String baseDir = "C:\\Temp"; // �˻��� ���͸��� default�� ��������
	String word = "hello"; // �˻��� �ܾ�
	String save = "result.txt"; // �˻� ����� ���� ��� .... 1.txt�� ����־�� ... 2.txt�� ����־��...
	
	public void Find() throws IOException {
		File dir = new File(baseDir); // �������
		
		if(!dir.isDirectory()) {
			System.out.println("baseDir :" + "is not directory or exist");
			System.exit(0);
		}
		
		PrintWriter writer = new PrintWriter(new FileWriter(save)); // Writer �߻�Ŭ������ ������ PrintWriter
		BufferedReader br = null;
		
		File[] files = dir.listFiles(); // Temp ���� �������ִ� ��� �ڿ�
		for(int i = 0; i < files.length; i++) {
			if(!files[i].isFile()) { // ������ �ƴ϶��
				continue; // ���� ���� skip�ϰڴ� // for������ �ø��ڴ�
			}
			br = new BufferedReader(new FileReader(files[i]));
			// a.txt, b.txt ������ �����غ� (buffer ���ؼ� line() ����)
			
			String line = "";
			while((line = br.readLine()) != null) {
				// POINT 
				if(line.indexOf(word) != -1) {
					// ����Ѵ� (result.txt)�� ���ϸ���
					writer.write(word + "=" + files[i].getAbsolutePath() + "\n");
				}
			}
			writer.flush();
		}
		br.close();
		writer.close();
	}
	
	public static void main(String[] args) {
		
		try {
			Ex12_PrintWrite_String_Find StringFind = new Ex12_PrintWrite_String_Find();
			StringFind.Find();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
