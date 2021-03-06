import kr.or.bit.Apt;
import kr.or.bit.Emp;
import kr.or.bit.Human;



/*
클래스 == 설계도 == 타입
클래스의 기본 구성요소 : 필드(고유값,상태값,참조값) + 함수(기능)
접근자(한정자) : public, private, default(쓰지 않는건), protected(상속)

1.public class Test{}

2. class Test{} >> default 접근자가 생략되었다
(default 접근자는 같은 폴더 안에 공유가능, 다른 폴더에 있으면 사용 불가)

3. default class는 언제 사용 : 같은 폴더내에서 다른 클래스의 참조 목적,
							연습목적
							
4. 하나의 자바 파일은(a.java) 여러개의 클래스를 가질 수 있다
	>>Ex01_main.java
	>>class Test{ } 코딩 연습... 실제로는 ... 쓰시면 안되요..
	>>단 public 키워드는 main클래스 하나만 가진다
	
	
5. default : 같은 폴더 내에서 사용시

 */
class Test { // default class
	int i; // default int i
	
	void print() { // default void print()
		System.out.println("default");
	}
}

public class Ex01_main {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "연습";
		
		// kr.or.bit 폴더 안에있는 Car클래스 사용
		Apt apt = new Apt();
		apt.aptname = "현대";

		Test t  = new Test();
		t.i = 100;
		
		apt.write_window(0);
		System.out.println(apt.read_window());
		
		Emp e = new Emp();
		e.setEmpno(7777);
		System.out.println(e.getEmpno());
		e.mgr = -8888;
		System.out.println(e.mgr);
		
		Human h = new Human();
		
		
	}

}
