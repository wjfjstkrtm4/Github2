package kr.or.bit;

import java.io.IOException;

public class ExClass {

	public ExClass(String path) throws IOException, ArithmeticException{ 
		// ������ ���ܸ� ��������  --> ExClass�� ����ϰ������ ����ó���� �ؾ���
		
	}
	
	public void call() throws ArithmeticException, IndexOutOfBoundsException {
		System.out.println("call �Լ� start");
		int i = 1/0;
		System.out.println("call �Լ� end");
		
	}
}
