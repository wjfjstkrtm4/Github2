package kr.or.bit;
/*
�䱸���� ����
Tv�� ä�������� ������ �ִ�(���� ��� 1~250ä��)
Tv�� �귣�� �̸��� ������ �ִ�(���� ��� �Ｚ, ����, ����)
Tv�� ä�� ��ȯ ����� ������ �ִ�(ä���� ���� �� �� �ִ� (�Ѵܰ辿))
��� 2�� (++ , --)
Tv�� ���������� ������ �ִ�
TV�� ������ On �� ���� �ְ�, off �Ҽ��� �ִ�
 */
public class Tv {
	
	public int ch; // public int ch = 1; // ä�������� ������1�� �ϰڴ�
	public String brandName;
	public boolean power; // true (on) , flase(off)
	
	public void ch_up() {
		// member filed ���� ��
		ch++;
	}
	
	public void ch_down() {
		ch--;
	}
	
	public void power_on() {
		power = true; // Tv�� ������ ������
	}
	
	public void power_off() {
		power = false; // Tv�� ������ ������
	}
	

	
	
	
	
	
}
