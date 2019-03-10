import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex06_FileReader_FileWriter_Buffer {
	public static void main(String[] args) {
		/*
		try {
			 FileWriter fw = new FileWriter("today.txt");
			 BufferedWriter bw = new BufferedWriter(fw); // writer �߻� Ŭ������ ��ӹ޴� �ڽ�Ŭ������ �� �ü� �ִ�
			 bw.write("�ζ�");
			 bw.newLine(); // ���۴� ������ �� �� ���� \n/r (����)
			 bw.write("1,2,3,4,5");
			 bw.flush(); // bw.close()
		} catch (Exception e) { // �÷��� catch���� ������ ����Ѵ� (�׷��� �������� ��������)
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		FileReader fr = null;
		BufferedReader br = null; // scope�� ���ѵǼ� ���⼭ �����ѰŰ�, finally��Ͽ��� �����ϱ�����
		
		try {
			 fr = new FileReader("Ex01_Stream.java");
			 br = new BufferedReader(fr); // ���� ������ ���� �� �ִ�
			
			 String line="";
			 //br.readLine(); ���͸� �������� ���پ� read POINT
			 for(int i = 0 ; (line = br.readLine()) != null ; i++) { // ���ڿ����� line�� �ִ´�
				 System.out.println(line);					// String�� Ŭ�����ϱ� ���̾����� null���� ��ȯ�Ѵ�
				
//				 if(line.indexOf(";") != -1) { //[ ; ]���Ե� ���常 read �ϰ� �;��
//					 System.out.println(line);
//					 System.out.println("******" + line.indexOf(";"));
//				 }
			 }
			 
		} catch (Exception e) {
			
		}
		
	}

}






