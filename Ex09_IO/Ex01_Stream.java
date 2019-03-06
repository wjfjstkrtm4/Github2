import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
I.O
1. stream(�������, ����� ���, �߰��Ű�ü) ex) ����
2. stream(����� ũ�Ⱑ ������ >> �Է� ��� ũ�Ⱑ >> 1Byte >> Byte ���� ����� >> Byte[] �迭

3. JAVA API �����ϴ� �Է� ��� Ŭ���� ����

Stream(Byte)

//�߻�Ŭ����
InputStream(read), OutputStream(write)
�ΰ��� �߻�Ŭ������ ����� ���� ������ ����(���� ����)

��� (memory)
ByteArrayInputStream : ByteArrayOutputStream

���(file : a.txt)
FileInputStream : FileOutputStream

�߰������� (pipe(���μ���) ...)

������ �ִ� Ŭ���� (����)
Buffer (I/O) �������
BufferedInputStream, BufferedOutputStream
 */


public class Ex01_Stream {

	public static void main(String[] args) {
		
		// Memory(Array, Collection)
		// Byte (-128 ~ 127) ������ 
		
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(inSrc[5]);
		
		byte[] outSrc = null; // �޸𸮸� ������ ���� �ʴ�
		
		ByteArrayInputStream input = null; // �����͸� ��θ� ���ؼ� read()
		ByteArrayOutputStream output = null; // ������ ��θ� ���ؼ� write()
		
		input = new ByteArrayInputStream(inSrc);
		// inSrc �迭�ּҿ��� read()
		
		output = new ByteArrayOutputStream(); // write ���(memory)
		

		System.out.println("before output : " + Arrays.toString(outSrc));
		
		// ���İ��� ����(�ϱ�)
		int data = 0;
		
		while((data = input.read()) != -1) { // �迭�� ���� ���� -1
			System.out.println("data : " + data);
			
			output.write(data); // data���� �ڱ��ڽ�(output)���� write
			// write ��� : ByteArrayInputStream read() -> write
		}
		outSrc = output.toByteArray();
		// �ڽ��� �������ִ� ���� �迭�� ���� 
		// outSrc���� �ּҰ� �Ҵ�
		
		System.out.println("outSrc : After >> " + Arrays.toString(outSrc));
		
		
		
		
//		while(input.read() != -1) { // �迭�� ���� ���� -1
//			System.out.println("data : " + input.read());
//			// read() �Լ��� ���������� next() ����� ������ �ִ�
//		}
	}

}
