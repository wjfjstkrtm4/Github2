/*
String Ŭ����
�� ������ �����ð� String Ŭ������ ��� ����� �������� ....
// String 8���� �⺻ Ÿ�� ����ϴ� ��ó�� ���ϰ� ����ϼ��� ^^


// 1. String Ŭ���� : ������ ���� (heap) : �ڷᱸ�� : char[] �迭�� ����ؼ� ���������� ����
// 2. String ename = "a�浿"; > [a][��][��]
// 3. String s = new String("ABCD");



 */
public class Ex05_String {

	public static void main(String[] args) {
		String str = "ABCD";
		System.out.println(str.length()); // ���������� �����͸� char[] �迭�� �����ϴϱ� ��� �� �� ����
		System.out.println(str.toString()); // Object toString�� ������ �ؼ� �ּҰ��� �ȳ�����, ABCD�� ����
		
		String str1 = "AAA";
		String str2 = "AAA";
		System.out.println("str1 : " + str1.toString());
		System.out.println("str2 : " + str2.toString());
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		
		System.out.println("str3 : " + str3.toString());
		System.out.println("str4 : " + str4.toString());
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		String str5 = "A";
		str5 += "B";
		str5 += "C";
		str5 += "D";
		str5 += "E";
		str5 += "F";
		
		str5 = "A";
		System.out.println(str5);

		
		
		
	}

}

