package kr.or.bit;

/*
������ : ȫ�浿
��¥ : 2019-02-08
���� : Emp.java(�������)

class ���赵�̴�
���赵�� �⺻���� ������Ҵ� (����,�������� + ��������)
					�Ӽ�(����)field + ���(�Լ�)method
 
 
 
 */
public class Emp {

	public int empno; // ���(���� > ���� > member filed(instance variable)
	public String ename; // �̸�
	public String job; // ����

	private int sal; // �޿� (ĸ��ȭ, ����ȭ : �����Ҵ�)
	// sal��� �ϴ� ������ ���� read(get), write(set) �� �� �־���Ѵ�

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) { // write (���� �Ҵ�)
		if (sal < 0) {
			this.sal = 0;
		} else {

			this.sal = sal;
		}
	}

	private int mgr; // ������ ���

	public int getMgr() { // read ����� �ϴ� �Լ� (getter�Լ�)
		return mgr;
	}

	public void setMgr(int mgr) { // write ����� �ϴ� �Լ� (setter �Լ�)
		this.mgr = mgr;
	}
	 
	// ĸ��ȭ�� ����ʵ忡 ���ؼ� �а�, ���� ����� �ϴ� �Լ��� 
	// getter, setter�Լ���� �θ���
	
	
	
	// ���(�Լ�)
	public String getEmpInfo() {
		return empno + "/" + ename + "/" + job + "/" + sal;
	}
	
	
	
	
	
	
	
	
}
