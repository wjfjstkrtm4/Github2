/*
 ����� ��� , �̸� , ����(job)�� ������ �ִ� => ��Ģ (ĸ��ȭ) => read , write ���� setter , getter
 ��� ������ default �� ��� =9999 , �̸�=�ƹ��� , ����=���� 
 Employee e = new Employee() 
  ������ �Լ��� ���(�� ���������) ���,�̸�,���� �� �Է��Ͽ� ��� ���� �����ϸ� 
 ����� ������ �� ����� ������ ��� , �̸� , ����  ���� �� ���� ������ �� �ִ�
 ���������  ��� ,�̸� ,������ �ѹ��� Ȯ�� �� �� �ְ� 
(������ ������ Ȯ�� �Ұ� �ϴ�) ���������� ����� �̸������� ��ȸ�����ϴ�. ��µǴ� ������ �ݵ�� "��"�̶�� ���ڰ� .....  
*/


package kr.or.bit;

public class Employee2 {
	private int empno;
	private String ename;
	private String job;
	
	public Employee2() {
		empno = 9999;
		ename = "�ƹ���";
		job = "����";
	}
	
	public Employee2(int empno, String ename, String job) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
	
	}
	public String getEename() {
		return ename + "��";
	}
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public void setename(String ename) {
		this.ename = ename;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public void employee2InfoPrint() {
		System.out.println("��� : " + empno + ", " + "�̸� : " + ename + ", " + "���� : " + job);
		
	}
	
	
	
	
}
