import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// reader, writer �ѱ��� �а�, ���µ� ���ϴ�

// ������

// 1. �ѱ� 1�� >> 2byte >> stream(1Byte) ��� >> �ѱ��� ��� �Ұ�
// 2. ��� �ϳ� �� ����� �ٰ� >> 2byte ��� >> reader, writer
public class Ex05_Reader_Writer_kor {

	public static void main(String[] args) {
		
		// File reader, writer �۾�
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
	
		try {
			fr = new FileReader("Ex01_Stream.java");
//			br = new BufferedReader(fr);
			fw = new FileWriter("copy_Ex02.txt"); // ���纻�� ����ڴ�
		
//			String line = "";
//			while((line = br.readLine()) != null) {
//				fw.write(line);
//			}
//			
			
			int data = 0;
			
			while((data = fr.read()) != -1) {
				 System.out.println(data + " : " + (char)data);
				 fw.write(data);
//				// �䱸���� : ����, ����, �� �� �����ϰ� ������ ������
////				if(data != '\n' && data != '\r' && data !='\t' && data != ' ') {
////					fw.write(data);
////				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				fw.close();
				fr.close();
				br.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
		

	}

}
