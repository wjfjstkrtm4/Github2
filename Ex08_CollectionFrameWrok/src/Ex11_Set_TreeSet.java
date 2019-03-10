import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// TreeSet �߰������� .. �˰� ������ ���� �� ���ƿ�




public class Ex11_Set_TreeSet {
	
	public static void main(String[] args) {
		// ����(X), �ߺ�(X)
		HashSet<String> hs = new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		hs.add("A");
		
		System.out.println(hs.toString());
		
		
		// HashSet Ȯ�� > LinkedHashSet (��������) : > Linked(�ּҰ�) > node ����
		// add �� ������ ������ ���ĵǴ� ���� �ƴϴ� // �������� ���Ḹ �ϴ°���
		
		Set<String> hs2 = new LinkedHashSet<String>();
		
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("D");
		hs2.add("P");
		hs2.add("A");
		
		System.out.println(hs2.toString());
		
		// ����(X), �ߺ�(X), ����(sort) : �������� �⺻������ ����
		// Set�������̽��� �⺻���� ������ �������鼭 ������ �Ǵ� ��
		// TreeSet : �˻��� ���� �� ���� ��Ҹ� �ʿ�� �ϴ� �������� ���
		// ����Ʈ�� : ���ĵǰ� ���� ���� �����͸� �����Ҷ� ȿ�����̴�
		
		// Lotto : 1 ~ 45 ���� > 6�� >> �ߺ�(X) >> ����(O)
		
		Set<Integer> lotto = new TreeSet<Integer>();
	
		for(int i = 0; lotto.size() < 6; i++) {
			lotto.add((int)(Math.random() *45 +1) );
			
		}
		System.out.println(lotto.toString());
		
		
		Iterator<Integer> it = lotto.iterator();
		int sum = 0;
		
		while(it.hasNext()) {
			// System.out.print(it.next() + " ");
			sum += it.next();
			
		}
	
		System.out.println("sum : " + sum);
		
		
	}
}
