/*
���Ǽ��� ... ���赵�� ������ ... (������)

�������� ���赵 �ۼ��� .....(������) 

������
��Ӱ��� (is ~ a : ���) ������ �����̴� (�θ����� �ڷ�)
>> ���� �����̴� (0)
>> �簢���� �����̴� (O)

���԰��� (has ~ a : ����) ������ ������ ������ �ִ�  (������ ������ ������ �ִ�)
>> ���� ������ ������ �ִ� (X)
>> �簢���� ������ ������ �ִ� (X)

----------------------------------------
�� Ŭ����

���� Ŭ����

>> ��� (�� extends ����)

���� ���̴� (X)
���� ����(x,y)
���� ���� ������ �ִ� (has ~a) ���԰���
>> class �� { �� ������;}


���� , ��
������ ���̴�(is ~ a)(X)
������ ���� ������ �ִ�(has ~ a)(O)
class ����{}
class ��{}

class ����{ �� gun; }
----------------------------------------
���� ��� 
��, �簢��, �ﰢ�� ����� ���踦 �ۼ��ϰ� �;��
�� : ������ ������, �׸���, ����
�ﰢ�� : ������ ��, �׸���, ���� 
�簢�� : �װ��� ��, �׸���, ����
�� : (x,y)

����
���� �����̴�
�ﰢ���� �����̴�
�簢���� �����̴�

���� : (�Ϲ�ȭ, �߻�ȭ) �и� : ����, �׸���
�� (��üȭ, Ư��ȭ) -> ���� ������

�� ����(x,y)
���� ���̴�(X)
�ﰢ���� ���̴�(X)
�簢���� ���̴�(X)

���� ���� ������ �ִ�(O)
�ﰢ���� ���� ������ �ִ�(O)
�簢���� ���� ������ �ִ�(O)
(has ~ a)

�Ϲ�ȭ, �߻�ȭ(����и�) : shape (����, �׸���)
				   : point(x, y)
class Shape{}
class Point{}

��üȭ, Ư��ȭ(circle, triangle)
 


class A {
	B b;
}

 
 */

// �߻�ȭ, �Ϲ�ȭ

class Shape {
	String color = "gold";
	void draw() {
		System.out.println("������ �׸���");
	}
}
class Point {
	int x;
	int y;


	Point() {
//		this.x = 1;
//		this.y = 2;
		this(1,2); // �����ڸ� ȣ���ϴ� this
	}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}


//���� ���弼��(���� : ������ �������� ������ �ִ�)
// ���� �����̴�(is ~ a) extends 
// ���� ���� ������ �ִ�(has ~ a) ��������

// ���� Ư����, ��ü�� : ������

class Circle extends Shape {
	Point center; // member filed(��ǰ�� ���°���) | has ~ a (���԰���)
	int r; // member filed(��üȭ, Ư����)
	
		Circle() {
			this.center = new Point(5, 8);
			this.r = 10;
			
		}
		
		Circle(Point center, int r) {
			this.center = center;
			this.r = r;
		}
}
// ���� 1)
// �ﰢ�� Ŭ���� ���弼��
// ���� : �ﰢ���� 3���� ���� ���� �׸��� �׸��ٶ�� ����� �������ִ�
// Shape, point Ȱ���ؼ� �۾��ϼ���
// 3���� (x, y), (x, y), (x, y) �ǹ�
// default �ﰢ���� �׸����� �ְ�, 3���� ��ǥ���� �޾Ƽ� �׸��� �׸� ���� �ִ�

class triangle extends Shape {
	Point x; // ����Ÿ�� (�ʱ�ȭ : �ּҰ�)
	Point y;
	Point z;
	
	public triangle() {
//		x = new Point(10,20);
//		y = new Point(30,40);
//		z = new Point(50,60);
		this(new Point(10,20), new Point(30,40), new Point(50,60));
	}
	
	public triangle(Point x, Point y, Point z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void trianglePoint() {
		System.out.printf("x :(%d,%d)y ", x.x, y.y);
		System.out.printf("x :(%d,%d)y ", y.x, y.y);
		System.out.printf("x :(%d,%d)y ", z.x, z.y);
	}
}

public class Ex02_Inherit_Composite {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.draw();
		System.out.println(c.color);
		System.out.println(c.r);
		System.out.println(c.center.x);
		System.out.println(c.center.y);
		
		Point point = new Point(10, 15);
		Circle c2 = new Circle(point, 20);
		System.out.println(c2.color);
		System.out.println(c2.r);
		System.out.println(c2.center.x);
		System.out.println(c2.center.y);
		c2.draw();
	
		triangle tri = new triangle();
		tri.trianglePoint();
		tri.draw();
		
		triangle tir2 = new triangle(new Point(1,2), new Point(3,4), new Point(5,6));
		tri.trianglePoint();
	}

}
