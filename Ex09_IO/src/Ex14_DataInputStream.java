import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//DataOutputStream write �� �����ʹ� �ݵ��  DataInputStream���� read �ؾ� �Ѵ�

public class Ex14_DataInputStream {
	public static void main(String[] args) {
		int sum=0;
		int score=0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			  fis = new FileInputStream("score.txt");
			  dis = new DataInputStream(fis);
			  while(true) {
				  score = dis.readInt(); // �Ʊ� writeInt()�̱⶧���� ���� �� �״�� �о�����Ѵ�
				  System.out.println("score int Ÿ�� :" + score);
				  sum+=score;
			  }
		} catch (Exception e) { // �о�� ���� �� �̻� ����������� ����ó������ ��µȴ�
			System.out.println("���ܹ߻� : " + e.getMessage());
			System.out.println("sum ��� :" + sum);
		}finally {
			try {
				dis.close();
				fis.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}

	}

}







