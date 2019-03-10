import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

// PrintWriter Ŭ������ ����ϸ� [�������]
// ģô : System.out.printf(), String.format

// FileOutputStrea, FileWriter, PrintWriter �����̾��ٸ� ���� ��������� �ִ�
public class Ex11_PrintWriter {

	public static void main(String[] args) {
		
		try {
			/*
			PrintWriter pw = new PrintWriter("C:\\Temp\\homework.txt");
			// ������ ���ٸ� ����, �ִٸ� ... ��������
			pw.println("**********************************************");
			pw.println("****************HOMEWORK*******************");
			pw.println("**********************************************");
			pw.printf("%3s : %5d  %5d  %5d  %5.1f", "�ƹ���", 10, 30, 90, (float)(10+90+88)/3);
			pw.println();
			
			pw.close();
			*/
			// read(Line����) >> buffered....
			FileReader fr = new FileReader("C:\\Temp\\homework.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String s = "";
			
			
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			
			br.close();
			fr.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		

	}

}
