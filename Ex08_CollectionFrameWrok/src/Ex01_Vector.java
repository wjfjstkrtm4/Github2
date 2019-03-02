import java.util.Vector;

import javax.xml.bind.util.ValidationEventCollector;

/*
Collection FrameWork
[�ټ��� �����͸� �ٷ�� [ǥ��ȭ]�� [�������̽�]�� [����]�ϰ� �ִ� Ŭ���� ����]

Collection
	|
List(���)	Set(���)			Map(�������̽�)
    |			|			     |
Vector		  HashSet		  [HashMap]
[ArrayList]	  TreeSet			

List interface [���� ���ÿ�]
: ����(0), �ߺ�(0) -> ���������� ������ ���� -> Araay[0][1][2]...

1. Vector(������) -> ����ȭ(��Ƽ ������) -> Lcok ���� (default) -> ������ ��ȣ
2. ArrayList[�Ź���] -> ����ȭ(��Ƽ ������) -> Lock ����(x) -> �ʿ信 ���� Lock -> ����
ex) ����ȭ
�Ѱ� ������� ȭ��� �ϳ� (100���� ���ÿ�) -> lock �����ϰ� ...
�Ѱ� ������� ����� ���� (100�κ�)(100���� ���ÿ�) >> lock(x)

Array (�迭) : �����迭(ũ�Ⱑ �����Ǿ��ִ�)
���� 10�� �����ϸ� ���� ����Ұ�
int[] arr = new int[10];
int[] arr = {10, 20, 30};

Array(����, ����)
1. �迭�� ũ�� ���� : Car[] cars = {new Car(), new Car()}; // �� 2��
2. �迭�� ���� : index(÷��) : cars[0], cars[0].color
3. �ʱ� ������ ũ�� ���� �Ұ�

List �������̽��� ������ Ŭ�������� (Vector, ArrayList) : ����
1. �迭�� ũ�⸦ �������� Ȯ�� �� �� �ִ�, ��� ���� -> �迭�� ���Ҵ�(^^) -> ���� ���� �ڵ� ���� �ʾƿ�
2. ������ ����(Array), ����(index), �ߺ��� ���
3. ������ ���� ���� (Array ���)
4. List �������̽��� ������ Ŭ���� (new�� ���ؼ� ��ü�� �����ؼ� ����Ѵ�)
5. ���� Ŭ����(ArrayList) ������ ������ Ÿ�� : ���� Ÿ�� : Object
	Object[] arr = new Object[10];
	���� : ��� Ÿ���� �θ� Ÿ�� (int, Car, String ...) ��� �ڷᰡ ���� �����ϴ�
	���� : Object�� downCasting�ؼ� ����ؾ� �Ѵ�
5.  ������ �غ��ϱ� ���� ��� : ���ʸ�(Ÿ�� ����)

 */


public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("�ʱ� default �뷮 : " + v.capacity()); // 10 default
		
		v.add("AA"); // [0] >> AA
		v.add("BB"); // [1]
		v.add("AA"); // [2]
		v.add(100); // [3]
		System.out.println(v.toString()); // [AA, BB, AA, 100] ������ ��� ���
		System.out.println(v); // toString() �����Ǿ��ִ�
		// Vector�� Object�� �ִ� toString()�� ������ �߱⶧���� ���´�

		// Array >> length() >> Car[index]

		for(int i = 0; i< v.size(); i++) { // size() �Լ� Ȱ�� 
			System.out.println(v.get(i)); // .get .. ��������   // get�Լ��� return type : Object
			
		}
		
		for(Object obj : v) {
			System.out.println(obj);
		}
		
//		for(int i = 0; i< v.length(); i++) {
//			System.out.println(v[i]);
//		}
		// ���� : Object ���� ū Ÿ���� ��� ... add(), get()
		
		Vector<String> v2 = new Vector<String>(); // String Ÿ���� ���� ���������
		v2.add("Hello");
		v2.add("World");
		
		for(String str : v2) {
			System.out.println(str);
		}
		
		System.out.println(v2.toString());
		System.out.println(v2.get(1));
		System.out.println("size : " + v2.size());
		System.out.println("capacity : " + v2.capacity());
		
		
		Vector v3 = new Vector();
		System.out.println(v3.capacity());
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A"); // 10��
		v3.add("A"); // 11��
		
		System.out.println(v3.capacity()); // 10 * 2 = 20
		v3.add("A");
		System.out.println("size : " + v3.size());
		System.out.println("capacity : " + v3.capacity());
		
	}

}

