/*
Today Point : [��Ӱ���]���� override : ��Ӱ��迡���� �޼��� ������
-��Ӱ��迡�� �ڽ�Ŭ������ �θ�Ŭ������ �޼����� ������
-������: �Լ��� ���´� ��ȭ�� ���� .... ���븸 �ٲ�� �� 
       : Ʋ�� ��ȭ�� �ƴ϶� ������ ��ȭ  {�Լ��� ���� �� ���� ����}
       
����) ��Ӱ��迡�� ...
1. �θ��Լ��� �̸��� ����
2. �θ��Լ��� parameter ����
3. �θ��Լ��� return type ����
4. �ᱹ���� { ��ȣ�ȿ� ���� ����}       
*/
class Point2{
	int x = 4;
	int y = 5;
	String getPosition() {
		return "x :" + this.x + " y :" + this.y;
	}
}

//3���� ���� �ʿ��ϴ�
//2���� ���� ������ �ִ� ���赵 ...
class Point3D extends Point2{
	int z = 6;
    
	
	
	@Override
	String getPosition() {
		// TODO Auto-generated method stub
		return "x :" + this.x + " y :" + this.y + " z :" + this.z;
	}

	
	//String getPosition3d() {return 
	// "x :" + this.x + " y :" + this.y + "z :" + this.z; }
	//�� �ϳ��� �̸��� ���� �Լ��� ����� ���� �ʾƿ�
	//�θ� ����ϴ� �Լ��� ������ �־��
	//������....
	//������ �����ϴ� ���
	//@Override ����(Annotation)
	//Annotation : JAVA code ������ ������ �� ���� �ΰ����� ����
	//[�����Ϸ�]�� [������]���� �����ϴ� ���
	
	//@Override : ������ �˻� ... �����Ϸ��� ������ ���� ����
	
	/*
	 * @Override String getPosition() { return "x :" + this.x + " y :" + this.y +
	 * " z :" + this.z; }
	 */
	
}

public class Ex04_Inherit_override {

	public static void main(String[] args) {
		Point3D point = new Point3D();
		point.x = 3;
		point.y = 6;
		point.z = 9;
		String result = point.getPosition();
		System.out.println(result);

	}

}
