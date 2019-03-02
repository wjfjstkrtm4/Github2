package kr.or.bit;
//stack �̶�� �ڷᱸ���� ���� ����

//MyStack my = new MyStack(5);
public class MyStack {
	
	private int top; //���� ���ؿ�(�̵�: Ŀ��)
	private Object[] stackarr; //�����͸� ���� ����
	//�߰������� �ʿ��� ������ �߰� ����
	private int maxsize; // �ִ�ũ�� �����ϱ�
	
	public MyStack(int maxsize) {
		stackarr = new Object[maxsize];
		this.maxsize = maxsize;
		top = -1;
	}
	
	//��� (�Լ�)
	//���� empty �Ǿ� �ִ�
	public boolean empty() {
		return (top == -1);
	}
	
	//���� full �Ǿ� �ִ�
	public boolean full() {
		return (top == maxsize -1); //�迭�� ������ ���ȣ�� top ������
	}
		
	//���� push 
	public void push(Object i) {
		//������ �ֱ�
		if(full()) {
			System.out.println("������ ������ �־��");
		}else {
			stackarr[++top] = i; //ó�� top = -1 >> ���� [0] �濡 �� �ֱ�
		}
	}
	//���� pop
	public Object pop() {
		Object output = null;
		if(empty()) {
			System.out.println("������ ��� �־��");
		}else {
			output = stackarr[top];
			top--; //point 
		}
		return output;
	}
	
}
