/*
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


/*
�䱸����
īƮ (Cart)
īƮ���� ���忡 �ִ� ��� ������ǰ�� ���� �� �ִ� 
īƮ�� ũ��� �����Ǿ� �ִ� (10��) : 1��  , 2�� ���� �� �ְ� �ִ� 10������ ���� �� �ִ�
���� ������ ���� �ϸ� ... īƮ�� ��´�

���뿡 ���� ��ü ���
������� �ʿ�
summary() ��� �߰��� �ּ���
����� ������ �����̸� �� �������� ����
�� �����ݾ� ��� ���
hint) īƮ ������ ��� ���� (Buy())
hint) Buyer ..>> summary()  main �Լ����� ����Ҷ�

�����ڴ� default �ݾ��� ������ �ְ� �ʱ�ݾ��� ������ �� �� �ִ�
*/

class Product2{  //������ǰ
	int price;
	int bonuspoint;
	
	//Product() {	}
	Product2(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price /10.0);
	}
}
class KtTv2 extends Product2 {
	KtTv2(){
		super(5000);
	}
	@Override
	public String toString() {
		return "KtTv2";
	}
}

class Audio2 extends Product2 {
	Audio2(){
		super(100);
	}
	@Override
	public String toString() {
		return "Audio2";
	}
}

class NoteBook2 extends Product2 {
	NoteBook2(){
		super(100);
	}
	@Override
	public String toString() {
		return "Notebook2";
	}
}

class Buyer2{
	int money=10000;
	int bonuspoint=0;
	
	//��ٱ��� ����(��ٱ��ϴ� ��� ������ǰ�� ���� �� �ִ�)***
		Product2[] cart = new Product2[10];
		int index =0;
		
		
	//****************************************************
	
	Buyer2() {
		//this.money = 10000;
		//this.bonuspoint = 0;
		this(10000,0);
	}
	Buyer2(int money , int bonuspoint){
		this.money = money;
		this.bonuspoint = bonuspoint;
	}	
	
	
	
	void Buy(Product2 product) { //���� (��ǰ����) //KtTv parameter �� ...
		if(this.money < product.price) {
			System.out.println("���� �ܾ��� �����մϴ� ^^");
			return; //���� ������ ���� ����
		}
		
		//Cart ���� ����
		if(this.index >= 10) {
			System.out.println("[���� �� ���� ��̾��]");
			return; //���� ������ ���� ����
		}
		
		//Cart ��� ************************************
		//if ó�� .. null �� ��
		cart[index++] = product; //0��° ���� ..	//++index	
		//**********************************************
				
		//�� ��������
		this.money -= product.price;
		this.bonuspoint += product.bonuspoint;
		System.out.println("������ ������ : " + product.toString());
		System.out.println("���� �ܾ� : " + this.money);
		System.out.println("���� ����Ʈ : " + this.bonuspoint);
	}
	
	//���� (��ٱ���) ���� ������ ��� ...
	//������ �Ѿ� (Product2)
	//������ ���
	void Summary() {
		int totalprice = 0;
		int totalbonuspoint=0;
		String productlist ="";
		
		//for(int i = 0 ; i < cart.length ; i++)
		//{ if(cart[i] == null)break; }
		
		for(int i = 0 ; i < index ; i++) {
			totalprice += cart[i].price;
			totalbonuspoint += cart[i].bonuspoint;
			productlist += cart[i].toString() + " ";
		}
		System.out.println("***********************");
		System.out.printf("**���Ź��� �Ѿ�  :[%d]**\n",totalprice);
		System.out.printf("**����Ʈ  �Ѿ�   :[%d]**\n",totalbonuspoint);
		System.out.printf("**���Ź��Ǹ���Ʈ :[%s]**\n",productlist);
		
	}
	
}


public class Ex13_Inherit_KeyPoint_Override {
	public static void main(String[] args) {
		
		Buyer2 buyer = new Buyer2(100000,0);
		KtTv2 tv = new KtTv2();
		Audio2 audio = new Audio2();
		NoteBook2 notebook = new NoteBook2();
		
		buyer.Buy(tv);
		buyer.Buy(tv);
		buyer.Buy(audio);
		buyer.Buy(audio);
		buyer.Buy(audio);
		buyer.Buy(audio);
		buyer.Buy(notebook);
		
		buyer.Summary();
		
	}

}
