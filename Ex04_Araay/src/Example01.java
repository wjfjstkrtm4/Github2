/*
 1. 1~45������ ������ �߻����� 6���� �迭�� ��������
 2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�
 -- �ֱ����� ���ϴ°� ���� ������
 3. �迭�� �ִ� 6���� ���� ���� ������ ���� ��Ű����
 4. �� ����� ��� �ִ� �迭�� ����ϼ���
 */
public class Example01 {

	public static void main(String[] args) {
		
		int[] toto = new int[6];
		
	
		
		for(int i = 0; i<toto.length; i++) {
			toto[i] = (int)(Math.random() *45) +1;
			
			for(int z = 0; z<i; z++) {
				
				if(toto[z] == toto[i]) {
					toto[i] = (int)(Math.random() *45) +1;
//					i--;
//					break;
					
				}
			}
		}
		for(int i = 0; i<toto.length; i++)  {
			
			for(int j = i+1; j<toto.length; j++) {
				
				if(toto[i] > toto[j]) {
					int temp = toto[i];
					toto[i] = toto[j];
					toto[j] = temp;
					
				}
			}
		}
		for(int i = 0; i<toto.length; i++) {
			System.out.println(toto[i]);
		}

	}

}
