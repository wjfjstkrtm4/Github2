import java.util.ArrayList;
import java.util.Stack;


public class Example007 {


	private int top; // ���� ���ؿ� (��Ŀ��)
	private Object[] stackarr; // �����͸� ���� ����
	private int maxsize; // �ִ�ũ��

	public Example007(int maxsize) {
		top = -1;
		stackarr = new Object[maxsize];
		
	}
	//��� (�Լ�)
	//���� empty �Ǿ� �ִ�
	public boolean empty() {
		return (top == -1);
	}
	
	
	//���� full �Ǿ� �ִ�
	
	public boolean full() {
		return (top == maxsize-1);
	}
	
	
	//���� push 
	// ������ �ִ� �ڿ��� �ø���
	
	public void push(Object i) {
		
		if(full()) {
			System.out.println("������ ����á�� �̰ſ�");
		} else {
			stackarr[++top] = i;
		}
		
		
	}
	
	
	
	//���� pop
	
	public Object pop() {
		Object output = null;
		if(empty()) {
			System.out.println("������ ��� �ִ� �̰ž�");
		} else {
			output = stackarr[top];
			top--;
			
		}
		return output;
	}
}
