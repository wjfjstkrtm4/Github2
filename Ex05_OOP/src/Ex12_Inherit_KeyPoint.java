/*
�ó�����(�䱸����)
����� ������ǰ ���� �ַ���� �����ϴ� ������Դϴ�
A��� ������ǰ ������ ���µǸ� 
[Ŭ���̾�Ʈ �䱸����]
������ǰ��  ��ǰ�� ���� , ��ǰ�� ����Ʈ ������ ���������� ������ �ֽ��ϴ�
������ ������ǰ�� ��ǰ�� ������ �̸��� ������ �ִ�
ex)
������ ������ǰ�� �̸��� ������ �ִ�(ex: Tv , Audio , Computer)
������ ������ǰ�� �ٸ� ������ ������ �ִ�(Tv:5000, Audio:6000 ....)
��ǰ�� ����Ʈ�� ������ 10% �����Ѵ�
 
�ùķ��̼� �ó�����
������ : ��ǰ�� �����ϱ� ���� �ݾ����� , ����Ʈ ������ ������ �ִ� 
���� ��� : 10����  , ����Ʈ 0
�����ڴ� ��ǰ�� ������ �� �ִ� , ���������� �ϰԵǸ� ������ �ִ� ����  �����ϰ� 
����Ʈ�� �ö󰣴�
�����ڴ� ó�� �ʱ� �ݾ��� ���� �� �ִ�
*/
class Product{  //������ǰ
	int price;
	int bonuspoint;
	
	
	//Product() {	}
	Product(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price /10.0);
	}
	
	
}
class KtTv extends Product {
	KtTv(){
		super(5000);
		
	}
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product {
	Audio(){
		super(100);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}

class Notebook extends Product {
	Notebook(){
		super(10000);
	}
	@Override
	public String toString() {
		return "Notebook";
	}
}

class Buyer{
	int money=10000;
	int bonuspoint=0;
	
	/*
	 ��������
	 ��������(�ܾ� - ��ǰ�� ���� , ����Ʈ ���� ����)
	 �����ڴ� ���忡 �ִ� ��� ��ǰ�� ������ �� �ִ�
	 ���������ϴ� �Լ� ����
	 KtTv , Audio , NoteBook ���� ����
	 
	 1�� ���� ������ ���ٸ� �Ͽ��� �ް� ^^
	 
	 ���忡 ��ǰ�� 1000�� �ٸ� ��ǰ�� �߰� (POS ��� �ڵ�ȭ)
	 ������ ���� ���忡 �ڵ� ��ġ
	 ���� >> �� >> �ڵ��� ����
	 KtTv , Audio , NoteBook ������ 997 ���� ��ǰ�� �������� �Ұ�
	 **��ǰ�� �߰� �� ������ �����Լ� �����ؾ߸� .......
	 
	   �䱸���� : ��ǰ�� �߰� �Ǵ��� �Ͽ��̿��� �ް� ...
	 
	*/
	/*
	1���ڵ�  
	  
	void kttvBuy(KtTv n) { //���� (��ǰ����) //KtTv parameter �� ...
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ� ^^");
			return; //���� ������ ���� ����
		}
		//�� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}
	void audioBuy(Audio n) { //���� (��ǰ����) //KtTv parameter �� ...
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ� ^^");
			return; //���� ������ ���� ����
		}
		//�� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}
	void notebookBuy(Notebook n) { //���� (��ǰ����) //KtTv parameter �� ...
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ� ^^");
			return; //���� ������ ���� ����
		}
		//�� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}
	*/
	//2�� ���� : �Լ��� ����
	//method overloading ��� 
	/*
	void Buy(KtTv n) { //���� (��ǰ����) //KtTv parameter �� ...
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ� ^^");
			return; //���� ������ ���� ����
		}
		//�� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}
	void Buy(Audio n) { //���� (��ǰ����) //KtTv parameter �� ...
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ� ^^");
			return; //���� ������ ���� ����
		}
		//�� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}
	void Buy(Notebook n) { //���� (��ǰ����) //KtTv parameter �� ...
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ� ^^");
			return; //���� ������ ���� ����
		}
		//�� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}
	*/
	// Product n = aa;
	// Product n = bb;
	// Product n = cc;
	//3�� ���� (������)
	void Buy(Product n) { //���� (��ǰ����) //KtTv parameter �� ...
						  // ������ : �θ��� ���� Ÿ�Ժ����� �ڽ��� �ּҰ��� ���� �� ���� ���ִ�
						 // product n = aa;
						// n�� aa�� �ּҰ��� �������� n�� �θ��� �ڿ��� ������ �����ϴ�
				
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ� ^^");
			return; //���� ������ ���� ����
		}
		//�� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
		
		
		
		
	}
}

public class Ex12_Inherit_KeyPoint {

	public static void main(String[] args) {
	
		//KtTv tv = new KtTv();
		//System.out.println(tv.toString());
		//System.out.println(tv.price);
		//System.out.println(tv.bonuspoint);
		KtTv tv = new KtTv();
		Audio audio = new Audio();
		Notebook notebook = new Notebook();
		
		
		
		/* 1��
		Buyer buyer = new Buyer();
		buyer.kttvBuy(tv);
		buyer.notebookBuy(notebook);
		buyer.notebookBuy(notebook);
		buyer.audioBuy(audio);
		*/
		
//		Product a = tv;
		Buyer buyer = new Buyer();
		buyer.Buy(tv);
		System.out.println(buyer.money);
		buyer.Buy(notebook);
		System.out.println(buyer.money);
		
		buyer.Buy(notebook);
		System.out.println(buyer.money);
		
		buyer.Buy(notebook);
		buyer.Buy(audio);

	

	}

}



