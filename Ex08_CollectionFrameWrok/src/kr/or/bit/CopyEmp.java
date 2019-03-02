package kr.or.bit;

// DTO, VO, DOMAIN
// Data Transfer Object
// Value Object


// Emp e = new Emp(); // ��� 1���� ������ ���� �� �ִ� ��ü


public class CopyEmp {

	private int empno;
	private String ename;
	private int sal;
	
	public CopyEmp(int empno, String ename, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	
	

	public int getSal() {
		return sal;
	}



	public void setSal(int sal) {
		this.sal = sal;
	}



	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	
	
	
	
	
	
	
}
