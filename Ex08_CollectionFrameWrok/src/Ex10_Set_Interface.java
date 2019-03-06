import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// Set �������̽��� �����ϰ� �ִ� Ŭ����
// Set ������ (X) -> �ߺ����� ��� (X) ������ ������ �ٷ궧 ...
// �����ϴ� Ŭ���� : HashSet, TreeSet
// ���� �������� �ʾƿ� (���������� �迭�� ����Ǵ°� �ƴ϶�, ���� ������ �������� �ʴ´�)
	

public class Ex10_Set_Interface {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(100);
		hs.add(55);
		
		System.out.println(hs.toString());
		// 1. �ߺ� ������ ó��(POINT)
		boolean bo = hs.add(1); // ���������� ���� ���� true�� ����
		System.out.println(bo); // ������ ���� �����Ͱ� �ֱ⶧���� �߰��� �����ʰ�, false���� �����Ѵ�

		
		hs.add(2);
		System.out.println(hs.toString()); // ����ϸ� ������ �������� �ʴ´�
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("z");
		
		System.out.println(hs2.toString()); // ������ �������� �ʴ´� (����������)
		
		// 1. �ߺ� ������ ������� �ʾƿ� (�ϻ� ��Ȱ���� �ߺ������� �ȵǿ�)
		String[] obj = {"A", "B", "A", "C", "D", "B", "A"};
		
		HashSet<String> hs3 = new HashSet<String>();
		
		for(int i = 0; i < obj.length; i++) {
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString());

		// Quiz
		// HashSet�� ����ؼ� 1 ~ 45���� ���� 6���� �������� (add)
		// (int)(Math.random() *45 ) +1
		
		
	}

}
