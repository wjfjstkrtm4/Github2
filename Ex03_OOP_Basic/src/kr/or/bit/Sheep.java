package kr.or.bit;

public class Sheep {
//	���� �ó�����
//	��� �̸��� ���� ���� �ִ� ž���ο��� ���ݰ� ���� ���԰� ���ԵǾ���Ѵ�.
//	�谡 ��������� �̸��� ���� �� , ž���ο� , ���� , ���԰� �ݵ�� ���ԵǾ�� �Ѵ�.
//	�谡 ��������� ���� ������ ���� �Ұ��ϴ�.
	
	private String sheepName;
	private int door;
	private int maxPerson;
	private int price;
	private int weight;
	// �̸� 
	// ���� ��
	// �ִ� ž���ο�
	// ����
	// ���� ����
	
	public Sheep(String sheepName, int door, int maxPerson, int price, int weight) {
		
		this.sheepName = sheepName;
		this.door = door;
		this.maxPerson = maxPerson;
		this.price = price;
		this.weight = weight;
		
	}
	


	public String getSheepName() {
		return sheepName;
	}

	public int getDoor() {
		return door;
	}

	public int getMaxPerson() {
		return maxPerson;
	}

	public int getWeight() {
		return weight;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	
}
