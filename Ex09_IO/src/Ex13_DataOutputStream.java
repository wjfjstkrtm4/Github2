import java.io.DataOutputStream;
import java.io.FileOutputStream;

// ���� ��Ʈ��
// JAVA API�� �����ϴ� 8���� �⺻(Ÿ�Ժ��� read write) Ŭ����
// DataOutputStream, DataInputStream // ä�ð�����
public class Ex13_DataOutputStream {

	public static void main(String[] args) {
		int[] score = {100, 60, 55, 97, 30};
		// ���� DataOutput, ������ DataIntput
		// Ÿ���� �����ϸ鼭 write
		try {
			FileOutputStream fos = new FileOutputStream("score.txt");
			
			// helper 
			DataOutputStream dos = new DataOutputStream(fos);
			// DataOutputStream�� ���ؼ� score.txt�� write�ϰڴ�
			for(int i = 0; i< score.length; i++) {
				dos.writeInt(score[i]); // �������� write .... �ݵ�� read�� DataInputStream �����������
				// dos.writeUTF(score[i]); // �� . ä���Ҷ� �ַλ��
				
				// writeInt�� �ص� int���� ��ȣȭ �� ���� ���Ű�, ���������δ� 0�� 1�� ������ �̻��Ѱ��� ���´�
				// �׷��� write�� ���� DataInput���� �о���̴µ� ���� intŸ������ �о�� �Ѵ�
			}
			
			dos.close();
			fos.close(); // �ڿ� ����...
		}catch(Exception e) {
			
		}

	}

}
