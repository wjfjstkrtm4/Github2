class Man {
	
	String name;
	int age;
	
	
}
// return Type �Ǵ� parameter �ڿ����� ���
// 1. 8���� �⺻Ÿ��
// 2. String : String m(String str){return ...}
// 3. Array : int[] m(int[] arr){return ...}
// 4. ����� ���� Ŭ����(TYPE) Man m(Man s) {return ...}
class Test {
	Man add(Man m) {
		m.name = "����";
		m.age = 10;
		return m;
	}
	
	
	Man add(Man x, Man y) {
		
		y.name = x.name; // null
		y.age = x.age;// 0
		return y;
		
		
	}
}



public class Ex12_Method_overloading_Object {

	public static void main(String[] args) {
		
		Test t = new Test();
		Man man = new Man();
		Man man2 = t.add(man);
		System.out.println(man2.name + "/" + man2.age);
		
		//man ���������� man2 ���������� ���� �ּҰ��̴�
		System.out.println(man == man2);
		
		Man man3 = t.add(new Man(), new Man());
		System.out.println(man3.name + "/" + man3.age);
		System.out.println(man2 == man3);
		System.out.println();
	}

}
