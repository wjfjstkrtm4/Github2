package kr.or.bit;

import java.io.Serializable;

/*
��ü�� �ְ� �޴� ��� (��ü���)
��Ʈ��ũ .... (���μ���)
���ϰ��� ....(���Ͽ��� ��ü�� write, �� ������ read)

����ȭ : (��ü�� �����ؼ� ���� ���� ������ ����)
������ȭ : (��ü�� �����ؼ� ����� ����)

�ǽ�)
��� ����(txt)

��ü�� ���Ͽ� write (����ȭ)
�� ������ read(������ȭ)

 
 
 */



// ���� (��ü ����� �Ϸ���) ���赵�� �ݵ�� implements Serialiszble�� �����ϰ� �־���Ѵ�
public class UserInfo implements Serializable{ // Ż������ ������ ��ǰ�Դϴ� = Serializble �������������� ��ü ����� �Ұ���
	
	public String name;
	public String pwd;
	public int age;
	
	public UserInfo() {
	
	}
	
	public UserInfo(String name, String pwd, int age) {
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}
	
	
	
	
	
}
