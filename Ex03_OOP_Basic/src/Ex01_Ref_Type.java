import kr.or.bit.Person;
import kr.or.bit.Tv;

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		

		Person person; // STACK ������ 4Byte �� ����(person) null
		// ���� �����⸦ ���ϸ� �޸𸮿� �÷��� -> new �����ڸ� ����
		
		person = new Person(); 
		// HEAP �޸𸮿� Person ��ü ����� person ������ �ּҰ��� �Ҵ��Ѵ�
		System.out.println("person : " + person);
		
		person.name = "ȫ�浿";
		person.age = 100;
		person.print();
		
		Person person2 = new Person(); // ����� �Ҵ��� ���ÿ�
		person.name = "������";
		person.age = 120;
		person.print();
		
		// person, person2 (���� Ÿ�� : Reference type)
		
		int num = 100; // main �Լ� �ȿ��ִ� local variable (�ݵ�� �ʱ�ȭ)
		System.out.println("�� : " + num); // (value Type) (�� Ÿ��)
		
		Person you; // The local variable you may not have been initialized
		// �ʱ�ȭ�� ���� �ʾƼ� ����
		// ���� Ÿ�Կ��� �ʱ�ȭ�� �ּ� ���� ���� �� -> new�����ڷ�
		// 1. ���� ������ �ʱ�ȭ (new)
		// you = new Person();
		
		you = person; // person�� �ּ� ���� you�� �ִ´� = ���Ű� ����
		// 2. �ٸ� ���� ������ ������ ���� �Ҵ�
		System.out.println("you : " + you);
		System.out.println("person : " + person);
		
		System.out.println(you == person); // == �� �� (���� �ּ�)
		
		Tv tv = new Tv();
		
		tv.brandName = "�Ｚ";
		
		System.out.println("�⺻ä�� : " + tv.ch); // �ʱ�ȭ ���������� 0
		System.out.println("�귣��� : " + tv.brandName); // �ʱ�ȭ ���������� null
		System.out.println("�������� : " + tv.power);
		tv.power_on(); // ȣ���Ѵ�( �Լ��� �̸��� �ҷ��־����� ����)
		
		
		tv.ch_up();
		tv.ch_up();
		tv.ch_up();
		System.out.println("����� ä�� : " + tv.ch);
		
		tv.ch_down();
		System.out.println("����� ä�� : " + tv.ch);
		
		
		
		
	}

}
