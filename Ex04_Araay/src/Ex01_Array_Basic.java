import java.util.Arrays;

// 배열(Array)는 객체다 -> heap 메모리에 올라간다

public class Ex01_Array_Basic {

	public static void main(String[] args) {
		
		int[] score = new int[3];
		System.out.println("score변수 (참조) : " + score); // 배열시작 값의 주소
		System.out.println(score[0]);
		score[1] = 333;
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		// Array 각각의 방을 가지고 있다 (각 방의 크기는(int) 4byte)
		// 각각의 방에대한 접근은 : 첨자, index 로 접근 : 배열의 시작 값 : 0
		// score[0], score[1], score[2]
		// 배열의 개수는(length) 3개
		// 배열의 마지막 첨자값은 : length-1
		// 배열은 타입의 default 값을 가진다
		
		// score[3] = 500;
		// 예외(Exception 발생) >> 현상 >> 프로그램이 강제종료
		// java.lang.ArrayIndexOutOfBoundsException: 3
		// 자주 봅시다 ...
		
		// Array 와 궁합이 제일 좋은 제어문 ? for
		
		
		for(int i = 0; i<3; i++) {
			System.out.printf("score[%d] = %d\t", i, score[i]);
		}
		
		System.out.println();
		
		
		for(int i = 0; i<score.length; i++) {
			System.out.printf("score[%d] = %d\t", i, score[i]);
		}
		
		System.out.println();
		// Array 사용시 도와주는 보조 클래스(helper 클래스)
		String result = Arrays.toString(score); // [0, 333, 0] 반환
		System.out.println(result);
		

		score[0] = 666;
		result = Arrays.toString(score);
		System.out.println(result);
		
		Arrays.sort(score); // 낮은 순으로 정렬 (쓰면 안되요 당분간...)
		result = Arrays.toString(score);
		System.out.println(result);
		
		
		
		// POINT (암기)
		
		// 배열을 만드는 3가지 방법
		int[] arr = new int[5]; // 기본 : 방의 크기
		int[] ar2 = new int[] {100, 200, 300}; // 값을(초기값) 정의해서 배열생성
		int[] arr3 = {11, 12, 13, 14, 15}; // 값만 설정 (컴파일러가 내부적으로 new를 쓴다)
		
		// javascript : var cars = ["Saab", "Volvo", "BMW"]; 
		
		for(int i = 0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		// Car c;
		// c = new Car();
		
		int[] arr4; // 배열 선언 (주소값이 아니라 null을 갖는다)
		// arr4 = {21, 22, 23, 24, 25};
		arr4 = new int[] {21, 22, 23, 24, 25};
		// 선언과 할당을 분리할때는 반드시 new를 사용해야 한다
		// 변수 선언 후에 값 목록을 대입할때는 new 연산자를 사용한다
		
		int[] arr5 = arr4; // 주소 값 할당
		System.out.println(arr4 == arr5); // 같은 주소를 바라보고있다

		
		// 배열은 8가지 기본타입 + String + 사용자 정의 클래스 ...
		
		char[]ch = new char[10]; // default 빈문자 '\0000'
		for(int i = 0; i< ch.length; i++) {
			System.out.println("> :" + ch[i] + "<");
		}
		
		
	
		
		
		
	}

}
