import java.util.Properties;

/*
Map �������̽��� ������ Ŭ����
Ư���� ���� : Ÿ���� ����
<String, String> Ÿ�� ���� ..... (key, value)

������
App ����Ӽ� ���� (ȯ�溯�� : ���) : 
1. ���α׷� ����
2. ���� ���
3. ���� ����
4. �ٱ��� ó��

 
 
 */
public class Ex16_Properties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("master_email", "bit@bit.or.kr");
		prop.setProperty("version", "1.0.0.0");
		prop.setProperty("defaultpath", "C:\\Temp//images");
		
		// �����
		System.out.println(prop.getProperty("master_email"));
		System.out.println(prop.getProperty("version"));
		System.out.println(prop.getProperty("defaultpath"));
		
		// prop.getProperty("master_email") �ڵ尡 100�� ������ ���
		
	}
}
