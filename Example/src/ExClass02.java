

import java.io.IOException;

public class ExClass02 {

	public ExClass02(String path) throws IOException, ArithmeticException {
		
	}
	
	
	public void call() throws ArithmeticException, IndexOutOfBoundsException {
		System.out.println("call �Լ� start");
		int i = 1/0;
		System.out.println("call �Լ� end");
	}
	
	
}
