import java.util.ArrayList;

import kr.or.bit.Emp;

public class Example00202020 {

	public static void main(String[] args) {
	
		ArrayList<Emp> li = new ArrayList<Emp>();
		
		
		li.add(new Emp(10,  "아무개", "사신"));
		li.add(new Emp(20,  "김유신", "사신"));
		li.add(new Emp(30,  "저팔괴", "사신"));
		
		for(Emp result : li) {
			System.out.println(result.getEmpno() + "/" + result.getEname() + "/" + result.getJob());
		}
		
		// 1. Emp 클래스를 사용해서 사원 3명을 생성하세요
		// 단 ArrayList 제너릭을 사용하세요
		
		// 2. 3명의 사원 정보(사번, 이름, 직종) 개선된 for문을 사용해서 출력하세요
		// 단 toString()은 사용 금지
		
		// 3. 3명의 사원 정보(사번, 이름, 직종) 일반 for문을 사용해서 출력하세요
		// 단 toString()은 사용 금지
		
		// 4. CopyEmp 라는 클래스를 만드세요 (구조는 Emp와 같은데)
		// job member filed 대신에
		// private int sal 추가하고 (getter, setter 구현)
		// ArrayList 제너릭 사용해서 사원 3명 만드세요
		// 아래 데이터
		// 100, "김", 1000
		// 200, "이", 2000
		// 300, "박", 3000
		
		// 5 . 200번 사원의 급여를 5000으로 수정해서 출력하세요
		// 일반 for문 사용하기
		
		// 6번.  300번 사원의 이름을 "궁금해"로 수정해서 출력하세요 (개선된 for문 안에서)
	}

}

