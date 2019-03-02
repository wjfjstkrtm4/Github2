import java.util.ArrayList;
import java.util.List;

class Product {
	
	
}

class Tv extends Product {
	@Override
	public String toString() {
		return "Tv";
		
	}
}

class Audio extends Product {
	@Override
	public String toString() {
		return "Audio";
		
	}
}

class NoteBook extends Product {
	@Override
	public String toString() {
		return "NoteBook";
		
	}
}


public class Ex07_Generic_Quiz {

	public static void main(String[] args) {
		
		// 1. Array (�迭) ����ؼ� cart ����� 3���� ��������
		// 2. ArrayList�� ����ؼ� cart�� ����� 3���� ��������
		
		Product[] cart = new Product[3];
		cart[0] = new Tv();
		cart[1] = new Audio();
		cart[2] = new NoteBook();
		
		
		
		
		
		List<Product> product = new ArrayList<Product>();
		product.add(new Tv());
		product.add(new Tv());
		product.add(new Tv());
		product.add(new Tv());
		product.add(new Audio());
		product.add(new Tv());
		product.add(new NoteBook());
		
		for(Product pro : product) {
			System.out.println(pro.toString());
		}
		
//		
		
//		ArrayList<Product> li = new ArrayList<Product>();
//		
//		li.add(new Tv());
//		li.add(new Audio());
//		li.add(new NoteBook());
//		
//		System.out.println(li.toString());
		
	}

}
