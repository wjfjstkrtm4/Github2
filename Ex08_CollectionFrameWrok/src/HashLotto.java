import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

public class HashLotto {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		// SEt set = new HashSet();
		
		System.out.println(hs.size());
		
		
		for(int i = 0; hs.size()<6; i++) { // hs.size() << POINT
			int result = (int)(Math.random() * 45) +1;
			hs.add(result);

		}
		
		System.out.println(hs.toString());
		// while Ƚ��
		
		//for(int i = 0 ; set.size() < 6 ; i++ ) >> while ��ȯ�ϼ���
				Set set2 = new HashSet(); //������ �θ�Ÿ��
				System.out.println(set2.size());
				//while Ƚ�� 
				int index =0;
				while(set2.size() < 6) {   //set2.size() < 6
					System.out.println("index:" + (++index));
					int num = (int)(Math.random()*45) +1; 
					set2.add(num);
				}
				System.out.println(set2.toString());
				
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFFF");
		
		System.out.println(set3.toString());
		
		Iterator<String> s = set3.iterator(); // ��ü�� ����� �ּҰ��� ����
		
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		
		// Collections.sort(List<T> list);  List �������̽��� �����ϴ� ��� ��ü�� parameter�� �� �� �ִ�
		
		// Set �������̽��� �����ϴ� HashSet�� ������ ��ٰ� ... ������ ���� .. �ȵǳ�?.. �� �ȵ�..
		// HashSet >> sort ���� (X)
		
		List list = new ArrayList(set3);
		
		System.out.println("Before ������ : " + list.toString());
		Collections.sort(list);
		System.out.println("After ������ : " + list.toString());
		
		
		
		
		// add �� ������ �������� �ʾƿ� (HashSet�� �迭�� �ƴϱ⶧����)
				
		/*
		for (int i = 0; i < 6; i++) {
	           numbers[i] = r.nextInt(45)+1; //���� ����
	          for (int j = 0; j < i; j++) {
	              if (numbers[i] == numbers[j]) {
	                  i--; //point
	                  break;
	              }
	           }
	        }
		
		 */
	}

}
