import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* ********************************************************************************************
Map �������̽��� �����ϴ� Ŭ���� 
Map >> (Ű(key), ��(value)) �� �迭
ex) ������ȣ : (02, ����) .....
key �� : �ߺ�(X)
value : �ߺ�(O)

Map >> Generic ����

HashTable(������) : ����ȭ ����
HashMap(�Ź���) : ����ȭ�� ���� ���� �ʾƿ�(�ʿ��ϸ� ����ȭ�� ��ų �� �ִ�)

*/

public class Ex12_Map_HashMap {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("Tiger", "1004");
		map.put("scott", "1004");
		map.put("superman", "1007");
		// Ȱ�� : ȸ��ID, ȸ��PWD ��´� (memory) ��
		// �޸�(heap) >> ���� ����(���ϱ��) login.txt �������� >> RDBMS (������ DB)

		System.out.println(map.containsKey("tiger")); // ��ҹ��� ����
		System.out.println(map.containsKey("scott"));
		System.out.println(map.containsValue("1004"));

		// (key, value)
		// POINT : key ���� ������ value���� ã�� �� �ִ�

		System.out.println("*********");
		System.out.println(map.get("Tiger"));
		System.out.println(map.get("hong")); // hong�̶�� key���� map�� ������ �����ʴ�

		// put

//		map.put("Tiger", "1004");
//		map.put("scott", "1004");
//		map.put("superman", "1007");
		map.put("Tiger", 1008); // key �� ���� ��� value : overwrite

		System.out.println(map.get("Tiger"));

		System.out.println("Before : " + map.size());

		Object returnvalue = map.remove("superman"); // key ���� �̿��ؼ� ����
		System.out.println(returnvalue); // �ʿ��ϴٸ� return�Ǵ� value���� ���

		System.out.println("After : " + map.size());

		Set set = map.keySet(); // key�� �ߺ�(X), ����(X) �� ������ Set���� �޾��ش�
		// Set �������̽��� �����ϴ� ��ü(HashSet)�� ���������� new�ϰ�, �ű⿡�ٰ� key���� ���
		// �� �ּҰ��� �����Ѵ� ... ������ ����

		
		
		
		Iterator it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Quiz Map ���� value ������ ��Ƽ� ����ϼ���

		Collection vlist = map.values(); // values���� �����
		System.out.println(vlist.toString());
		
		

	}
}
