

// Inner Class
// Ŭ���� �ȿ� Ŭ������ �ִ�

// Inner Class ����
// AWT, SWING, Android(event) ó�� : ��ư Ŭ��, ���콺 ���� , ...


class OuterClass {
	public int pdata = 10;
	public int data = 20;
	
	// 1. �ڿ��� ���� ������ ���ϰ� �ϱ� ���ؼ�
	// 2. member field �� ����Ǵ� ����
	// 3. ���� : [[[[[ Outerclass�� �������ִ� �ڿ��� ���� ���� ���� ]]]]]
	class InnerClass { // �̳� Ŭ����
		void msg() {
			System.out.println("outerclass data : "  + data);
			System.out.println("outerclass data : " + pdata);
		}
	}
	
}
public class Ex11_InnerClass {

	public static void main(String[] args) {
		
	OuterClass outobj = new OuterClass();
	System.out.println("outobj.pdata : " + outobj.pdata);
	
	OuterClass.InnerClass innerobj = outobj.new InnerClass();
	innerobj.msg();
	
	
		

	}

}
