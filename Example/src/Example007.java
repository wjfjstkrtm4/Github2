import java.util.ArrayList;
import java.util.Stack;


public class Example007 {


	private int top; // 값이 변해요 (ㅋ커서)
	private Object[] stackarr; // 데이터를 담을 공간
	private int maxsize; // 최대크기

	public Example007(int maxsize) {
		top = -1;
		stackarr = new Object[maxsize];
		
	}
	//기능 (함수)
	//스택 empty 되어 있니
	public boolean empty() {
		return (top == -1);
	}
	
	
	//스택 full 되어 있니
	
	public boolean full() {
		return (top == maxsize-1);
	}
	
	
	//스택 push 
	// 맨위에 있는 자원을 올린다
	
	public void push(Object i) {
		
		if(full()) {
			System.out.println("스택이 가득찼다 이거여");
		} else {
			stackarr[++top] = i;
		}
		
		
	}
	
	
	
	//스택 pop
	
	public Object pop() {
		Object output = null;
		if(empty()) {
			System.out.println("스택이 비어 있다 이거야");
		} else {
			output = stackarr[top];
			top--;
			
		}
		return output;
	}
}
