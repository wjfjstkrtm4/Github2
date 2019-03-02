import java.util.StringTokenizer;

/*
// String Ŭ���� (�پ��� �Լ�)
// ���߿��� ���� ��� (�츮�� ����� �����ʹ� ��κ� ���ڿ� ������)
 */
public class Ex06_String_Function {

	public static void main(String[] args) {
		String str =""; // ���ڿ� �ʱ�ȭ
		
		String[] strarr = {"aaa", "bbb", "ccc"};
		for(String s : strarr) {
			System.out.println(s);
		}
		
		// String Ŭ���� (�Լ�)
		String ss = "hello";
		String concatstr = ss.concat("world");
		System.out.println(concatstr);
		
		boolean bo = ss.contains("ele");
		System.out.println(bo);
		
		String ss2 = "a b c d"; // [a][ ][b][ ][c][ ][d]
		System.out.println(ss2.length());
		
		String filename = "hello java, world";
		System.out.println(filename.indexOf(",")); // ���ڰ� ���° �濡�ִ��� Ȯ��
		System.out.println(filename.indexOf("java"));
		
		// Ȱ�� : ���峻���� ���� ���ϴ� �ܾ ���� �Ǿ��ִ����� ����
		// 0���� ū ���� ��ȯ �Ѵٸ� �ּ��� �ϳ��� �ܾ� ����
		
		System.out.println(filename.lastIndexOf("a"));
		System.out.println(filename.lastIndexOf("kglim"));
		
		// �迭�� ���� ���� >> -1
		// return -1;
		
		// �ַ� ���� ���� �Լ�
		// length(), indexof(), substring(), replace()(ġȯ �Լ�), ... split()
		
		String result = "superman";
		System.out.println(result.substring(5)); // 5��°���� �߶���
		System.out.println(result.substring(0));
		System.out.println(result.substring(0, 0));
		System.out.println(result.substring(0, 1));
		System.out.println(result.substring(1, 1));
		System.out.println(result.substring(2, 3)); // index endIndex - 1 // 2, 2 �̱⶧���� �ڱ��ڽ��� ����Ŵ
		
		// at index endIndex -1
		// Quiz
		String filename2 = "aaaa.mpeg"; // ���ϸ��� �ٲ��� �� �ִ�
		// aaaa.mpeg or ab.hwp
		// ���ϸ� >> ȫ�浿
		// Ȯ���� >> jpg
		// �и��ؼ� ȭ�鿡 ����غ�����
		// ������ ��� �Լ��� Ȱ���ϼ���
		int a = filename2.indexOf(".");
	
		System.out.println(filename2.substring(0, a));
		System.out.println(filename2.substring(a+1, filename2.length()));
		
		// replace
		String s2 = "ABCD";
		String result4 = s2.replace("A", "�ȳ�");
		System.out.println(result4);
		
		System.out.println(s2.charAt(0)); // index�� �ָ� ���ڰ��� �������ش�
		System.out.println(s2.charAt(3)); // return char
		System.out.println(s2.endsWith("CD")); // ������ CD��� ���� �������ִ�?
		System.out.println(s2.equalsIgnoreCase("aBcD")); // ��ҹ��� ������� ��
		
		// Point
		// split
		
		String s6 = "���۸�, ��Ƽ, �����, ������, ������"; // �����ڸ� �������� ���۸��� 0��°�濡 ��Ƽ�� 1��°�濡 ...
		String[] namearry = s6.split(",");
		
		for(String s : namearry) {
			System.out.println(s);
		}
		
		String filename3 = "bit.hwp";
		String[] arry = filename3.split("\\."); // ���� ǥ�� ���ڿ�
		System.out.println(arry.length);
		
		for(String s : arry) {
			System.out.println(s);
		}
		
		// java, javascript, DB >> ���� ǥ����
		// 000-{\d4}-0000
		// 000-1111-0000 ���� : true
		// 000-11-0000 ���� : false
		
		// ���� (���� ǥ���� 5�� ��������) ����
		// �ַ� ���� ���̴� ��
		// �ֹι�ȣ, �����ȣ, ��ȭ��ȣ, �̸���, .....
		// ���� ���� ������ ��..
		
		String s7 = "a/b,c.d-f"; // ��Ģ�̾���
		StringTokenizer sto = new StringTokenizer(s7, "/,.-");
		while(sto.hasMoreTokens()) {
			System.out.println(sto.nextToken());
		}
		
		// �ͼ��� Quiz
		String s8 = "ȫ                ��               ��";
		// ���� "ȫ�浿"
		System.out.println(s8.replace(" ", ""));
		
		String s9 = "          ȫ�浿                  ";
		System.out.println(">" + s9.trim() + "<");
		
		String s10 = "          ȫ                 ��                     ��";
		
		// �ٺ�
//		String re = s10.trim();
//		String re2 = re.replace(" ", "");
//		System.out.println(re2);
		
		// �������� �Լ��� ���� �� ��� (method chain)
		String re = s10.trim().replace(" ", "");
		System.out.println(re);
		
		// Quiz-1
		int sum = 0;
		String[] numarr = {"1","2","3","4","5"};
		// ���� : �迭�� �ִ� ���ڰ����� ���� sum������ ��Ƽ� ����ϼ���
		
		for(String s : numarr) {
			sum +=Integer.parseInt(s); // ���ڿ��� ������ �ٲ��ش�
		}
		System.out.println(sum);
		
		
		// Quiz-2
		String jumin = "123456-1234567";
		// �� �ֹι�ȣ�� ���� ���ϼ���
		 int sum2 = 0;
	        int num2 = jumin.indexOf("-");
	        String jumin2 = jumin.substring(0, num2);
	        String jumin3 = jumin.substring(num2+1, jumin.length());
	        String jumin4 = jumin2 + jumin3;
	        System.out.println(jumin4);
	        for(int i = 0 ; i < jumin4.length() ; i++) {
	                sum2+=Integer.parseInt(jumin4.substring(i, i+1));
	                
	            }
	        System.out.println(sum2);


		
		
	}
	
}


