package kr.or.bit;

public class Emp {

	private int empno;
	private String name;
	private int sal;
	private String job;
	public int mgr;
	
	public int getEmpno() { // getter (ĸ��ȭ�� �ڿ��� ���ؼ� read)
		return empno;
	}
	public void setEmpno(int empno) { // setter (ĸ��ȣ�� �ڿ��� ���ؼ� write)
		if(empno <=0) {
			this.empno = 9999;
		} else {
			this.empno = 8888;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	
}
