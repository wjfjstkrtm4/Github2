
/*
å�� å�̸��� ������ ������ �ִ�
å�� ���ǵǸ� �ݵ�� å�� å�� �̸��� ������ ������ �־���Ѵ�
å�� �̸��� ���� ������ Ư�� ����� ���ؼ��� �� �� �ְ� ���ǵ� ���Ŀ��� ������ �� ����
å �̸��� ���� ������ ���� ������ ���� �� �ִ� 
 */
public class Book {
	private String bookName;
	private int bookPrice;
	
	
public String getBookName() {
		return bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	//	public Book() { // �ݵ�� ... å�� �����ɶ� ... �̸�,, ������ ������
//					// ���������� �ᵵ ���������� �䱸���׿� ��߳���
//		
//	}
	public Book(String bookName, int bookPrcie) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		
		
	}
	
	public void BookInfo() {
		System.out.println("å �̸� : bookName" + bookName);
		System.out.println("å ���� : bookPrice" + bookPrice);
	}
	
	
	
	
	
}



