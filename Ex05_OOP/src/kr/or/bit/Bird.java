package kr.or.bit;


// protected ���� : ��Ӱ��迡�� ������ ...
// ����� �ʿ���ϸ� �������� ... �Ƹ� �ʿ��Ұ�

// ���� : ���� �� �� �ִ�, ���� ������
public class Bird {
	public void fly() {
		System.out.println("i am fly..");
	}
	
	// ������ ������ ...
	protected void movefast() {
		fly();
	}
	
	
}
