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

public class Employee {

	private int empno;
	private String ename;
	private String job;
	
	public Employee() { // default constructor
		empno = 9999;
		ename = "�ƹ���";
		job = "����";
	}
	
	public Employee(int no, String name, String jobdata) { // overloading constructor
		empno = no;
		ename = name;
		job = jobdata;
	}
	
//	public int getEmpno() { // read : getter
//		return empno;
//	}
	public void setEmpno(int empno) { // write : setter
		this.empno = empno;
	}
	
	public String getEname() {
		return ename + "��"; // ���� ...
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

//	public String getJob() {
//		return job;
//	}
	public void setJob(String job) {
		this.job = job;
	}
	
	// �Ϲ� �Լ�
	
	public void employeeInfoPrint() {
		System.out.printf("���: %d, �̸� : %s, ���� : %s\n", empno, ename, job);
		
	}
	
	
}