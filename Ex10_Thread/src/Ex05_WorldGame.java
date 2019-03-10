import javax.swing.JOptionPane;

/*
문제
main 함수 제외한 Thread 2개 생성
첫번째 쓰레드는 시간제어
두번째 쓰레드는 단어입력 처리

main 함수에서 2개 Thread 스타트
단, 단어를 하나라도 입력해서 확인 버튼을 누르면 시간을 멈추게해라 >> 프로그램종료
Hint = static 자원 활용
*/
/*
class Time extends Thread{
    private static int time;
    public void run() {
        for(int i = 10 ; i > 0 ; i --) {
            time = i;
            System.out.println(i+"초 남음");
            try {
                
                Thread.sleep(1000);//CPU를 점유하고있는 thread 잠깐 쉬게하는거임 -> 1000 = 1초
                if(Input.inputdata != "") {
                    return;
                }
            }catch(Exception e) {
                System.out.println(e.getMessage());    
            }
        }
    }
}
class Input extends Thread{
    static String inputdata="";
    @Override
    public void run() {
        inputdata = JOptionPane.showInputDialog("입력해라");
        System.out.println("답변 : " + inputdata);
        
    }
}
public class Ex05_WorldGame {

    public static void main(String[] args) {
        Input i = new Input();
        Time t = new Time();
        
        i.start();
        t.start();
        
    }

}

*/

import javax.swing.JOptionPane;

/*

문제
main 함수 제외한 Thread 2개 생성
1. 시간(time) 제어하는 Thread
2. 단어 입력을 처리하는 Thread

main 함수에서 2개 Thread start

단 단어를 하나라도 입력해서 확인 버튼을 누르면 시간을 멈추고
프로그램 종료 되게 하세요 .....

Hint : static 자원 활용


*/
class WordInputProcess extends Thread{
	@Override
	public void run() {
		// String dan="2";
		String inputdata = JOptionPane.showInputDialog("dan" + "단 값을 입력");
		if(inputdata != null && !inputdata.equals("")) {
			Ex05_WorldGame.inputcheck = true;
		}
		System.out.println("입력한 값은: " + inputdata);
	}
}


class WordTimeOut extends Thread{
	@Override
	public void run() {
		for(int i=10; i > 0 ; i--) {
			
			if(Ex05_WorldGame.inputcheck)
			return; //run함수 탈출
			
			System.out.println("남은 시간: " + i);
			try {
				 Thread.sleep(1000); //대기실에서 1초간 쉬었다 ....
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
public class Ex05_WorldGame {
		//변수 : static 
		static boolean inputcheck= false;
		public static void main(String[] args) {
			WordInputProcess word = new WordInputProcess();
			WordTimeOut time = new WordTimeOut();
			
			word.start();
			time.start();

			
			System.out.println("Main END");
			
		}
}











