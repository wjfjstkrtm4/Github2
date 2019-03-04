import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Today Point
// HashMap�� Generic�� �����ϴ�
// HashMap<k, v>
// HashMap<String, String>
// HashMap<Integer, String>
// HashMap<String, Emp> Point >> value ������ ��ü�� �� �� �ִ�

// IO, Network, Thread >> ArrayList<Emp> , HashMap<String, Emp> �ڵ� Ȱ��

class Student {
	int kor = 100;
	int math = 80;
	int eng = 20;
	String name;
	
	Student(String name) {
		this.name = name;
	}
	
}

public class Ex14_HashMap_Generic {
	
	public static void main(String[] args) {
		
		HashMap<String, Student> students = new HashMap<String, Student>();
		
		students.put("hong", new Student("ȫ�浿"));
		students.put("��", new Student("������"));
		
		Student hongstd = students.get("hong");
		System.out.println(hongstd.name);
		System.out.println(hongstd.kor);
		System.out.println(hongstd.math);
		System.out.println(hongstd.eng);
		
		// ����������
		// Map �� �⺻������ key ������ value �� ���
		// ���������� (key, value) ��� ����ϰ� �;��
		
		// entrySet(); >> key + "=" + value �ϳ��� ���ڿ�
		// hong=Student@15db9742
		Set set = students.entrySet();
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// �������� CASE : value ��ü(Object) �϶�
		// Map.Entry �������̽� Ÿ���� ���ؼ� (key, value) �и��ؼ� ��� ����
		// getKey(), getValue() ������ ������ ��� ����
		for(Map.Entry m : students.entrySet()) {
			System.out.println(m.getKey() + "/" + ((Student)m.getValue()).name + "/"
			+ ((Student)m.getValue()).kor);
		}
			
		
		
	}
}
