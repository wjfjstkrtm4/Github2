package kr.or.bit;


public class Quiz{
	private String[] �迭 = new String[5];
	private String �帣;
	private String ����̸�;
	private String �����̸�;
	private String ��ȭ����;
	private String �����⵵;

	public Quiz(String ��ȭ����, String �帣, String ����̸�, String �����̸�, String �����⵵){
		this.��ȭ���� = ��ȭ����;
		this.�帣 = �帣;
		this.����̸� = ����̸�;
		this.�����̸� = �����̸�;
		this.�����⵵ = �����⵵;
		
		�迭[0] = ��ȭ����;
		�迭[1] = �帣;
		�迭[2] = ����̸�;
		�迭[3] = �����̸�;
		�迭[4] = �����⵵;
	}
	public String[] get�迭() {
		return �迭;
	}
	public String get�帣() {
		return �帣;
	}
	public String get����̸�() {
		return ����̸�;
	}
	public String get�����̸�() {
		return �����̸�;
	}
	public String get��ȭ����() {
		return ��ȭ����;
	}
	public String get�����⵵() {
		return �����⵵;
	}
	public void �迭() {

	}
	public void ��ȭ_����_���(){
		for(int i = 0 ; i < �迭.length ; i++){
			
		 System.out.println(�迭[i]);
		}
	}
}  
 