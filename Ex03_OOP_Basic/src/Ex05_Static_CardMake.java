import kr.or.bit.Card;

public class Ex05_Static_CardMake {

	public static void main(String[] args) {
		
		// 53 ī�� ����
		
//		Card c = new Card();
//		c.number = 1;
//		c.kind = "heart";
//		c.h= 500;
//		c.w = 200;
//		c.cardInfo();
//		
//
//		Card c2 = new Card();
//		c2.number = 10;
//		c2.kind = "heart";
//		c2.cardInfo();
		//  ........
		// �̶� ���� ī�尡 ...
		// ī�� ũ�⸦ �÷��ּ��� h = 500, w = 200
		// ���赵�� �ٲٸ� �ȵǹǷ�, ���⼭ 53���� ������ ī�带 �����ϴ� �۾��� �ؾ��Ѵ�
		// ī�� ������ ������ ���ؼ� 53�� ��� ī�� ����		
		
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		Card.h = 10;
		Card.w = 20;
		c.cardInfo();
		

		Card c2 = new Card();
		c2.number = 1;
		c2.kind = "heart";
		c.cardInfo();

		Card c3 = new Card();
		c3.number = 1;
		c3.kind = "heart";
		c.cardInfo();
	}

}
