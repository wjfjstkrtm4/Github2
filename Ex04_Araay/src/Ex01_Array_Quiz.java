
public class Ex01_Array_Quiz {

	public static void main(String[] args) {
		
		// ���а� �л����� �⸻��� ���� ����
	
		/*
		 ����� ����ؼ� max ������ �ִ밪(�ְ�����) min ������ �ּҰ�(��������)
		���) max > 97, min > 54
		 */
		
		
		
			int[] score = new int[] {79,88,97,54,56,95,100, 200, 300};
	        
	        int max = score[0];
	        int min = score[0];
	        
	        
	        for(int i = 1; i < score.length; i++) {
//				
//				if(score[i] >max) max = score[i];
//				if(score[i] <min) min = score[i];
	        	
	        	
//	        max = (score[i] >max) ? score[i]:max;
//			min = (score[i] <min) ? score[i]:min;
	        }
			System.out.println("max : " + max);
			System.out.println("min : " + min);
//	        
//	         for(int i=0; i<score.length; i++) {
//	             if(max<score[i]) {
//	                 max = score[i];
//	             }
//	             if(min>score[i]) {
//	                 min = score[i];
//	             }
//	             //System.out.println("score["+ i +"] : "+score[i]);
//	         }
//	         
//	         
//	         System.out.println("max: "+max);
//	         System.out.println("min: "+min);
//		

		
		int[] number = new int[10];
		
		// 10�� �濡 ���� 1���� 10���� �ʱ�ȭ�Ѵ�
		// number[0]
		for(int i = 0; i<number.length; i++) {
			number[i] = i+1;
			System.out.println(number[i]);
		}
		
		
		// ��� �л��� �⸻��� ���� �����Դϴ� (5����)
		
		int sum = 0;
		float average = 0f;
		int[] jumsu = {100, 55, 90, 60, 78};
		
//		for(int i = 0; i<jumsu.length; i++) {
//			sum = sum + jumsu[i];
//
//		}
//		average = (float)sum/jumsu.length;
		
		for(int i = 0; i<jumsu.length; i++) {
		sum = sum + jumsu[i];
		if(i == jumsu.length-1) {
			average = sum / (float)jumsu.length;
		}
		}

		System.out.printf("�Ѱ���� : [%d], ���� : [%d], ��� : [%f]", jumsu.length, sum, average);
		
		/*
		
		
		
		1. �� �����
		2. ������ ��
		3. ������ ���
		��) 2, 3 ������ �ϳ��� for������ ����ض�
		 */
		
		
	
		

	}
	
}
