import java.io.IOException;

public class Ex03_Exception_finally {
	
	static void startInstall() {
		System.out.println("INSTALL");
	}
	
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	
	static void fileDelete() {
		System.out.println("DELETE FILES");
	}
	
	public static void main(String[] args) {
		
		try {
			copyFiles();
			startInstall();
			
			// 개발자가 임의로 [예외를 생성] 할 수 있다
			// A, B, C 정상입력 ,,,, D라고 입력하면 (비정상)
			// 사용자 예외 던지기 (예외 객체를 개발자가 직접 생성(new)
			
			throw new IOException("Install 처리 중 문제 발생");
			
		}catch(Exception e) {
			System.out.println("예외 메시지 출력 : " + e.getMessage());
		}finally { // 예외가 발생하던 발생하지 않던 강제적 실행블록
			fileDelete();
		}
		
		// 주의 사항 ...
		// ******** 함수 종료(return) 있다 하더라도 finally 블록이 있으면 
		// 이놈을 실행하고 함수가 종료 .... ********
		
		System.out.println("MAIN END");

	}

}
