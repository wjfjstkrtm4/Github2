class Tv {
	 boolean power;
	 int ch;
	 
	 void power() {
		 this.power = !this.power;
	 }
	 
	 void chUp() {
		 this.ch++;
	 }
	 
	 void chDown() {
		 this.ch--;
	 }
}

class Vcr { // ���� �÷��̾�
	boolean power;
	
	void power() {
		this.power = !this.power;
	}
	
	void play() {
		System.out.println("����ϱ�");
	}
	
	void stop() {
		System.out.println("����");
	}
	
	void rew() {

	}
	
	void ff() {
		
	}
}
	// ���赵 : TV, VCR�� ������ �ִ�
	// Vcr ��ɰ� Tv����� �� ���� ���赵�� �ۼ��� �ּ���
	// TvVcr ���赵 ��ǰ�� ����� �;��
	
	// ���赵 ����...
	// class TvVcr extends Tv, Vcr {} (X : ���߻��)
	// Tv extends Vcr
	// TvVcr extends Tv (������ ���)
	
	
	// �������� : ����� �ѹ��� �ϼ���
	// ���, ����
	// ��� : TvVcr �� ���鶧 � ���� ����ϰ�, � ���� �����ϴ��� ...
	
	// �� ���(Tv), ���� ���(Vcr)
	// ������ ���� Ŭ������ ����ض�

class TvVcr extends Tv{
	Vcr vcr;
	
	TvVcr() {
		this.vcr = new Vcr();
	}
	
}







public class Ex03_Inherit_Single {

	public static void main(String[] args) {
	
		TvVcr t = new TvVcr();
		t.power(); // ����
		System.out.println("Tv �������� : " + t.power);
		
		t.chUp();
		t.chUp();
		System.out.println("Tv ä������ : " + t.ch);
		
		// ���� ���� ...
		
		t.vcr.power();  // ����
		System.out.println(t.vcr.power);
		
		t.vcr.play();
		t.vcr.stop();
		t.vcr.power(); // ����
		
		t.power(); // ����
		
		System.out.println("Tv ���� : " + t.power);
		System.out.println("Video ���� : " + t.vcr.power);
		
		

	}

}
