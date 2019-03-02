package kr.or.bit;
 
import java.util.Random;
import java.util.Scanner;
 
//���赵
//Lotto lotto = new Lotto();
//lotto.SelectLottoNumber(); >> �޴� ����
//1 ���� �Է� >> selectBasicNumber() �Լ� ȣ�� (�ǹ�ȣ ����) >> ���
//2 ���� �Է� >> ȭ�鿡 ���.....
//3 ���� �Է� >> ����
public class Lotto {
    private Scanner scanner;
    private Random r; //r.nextInt(45)+1 (1~45)
    private int[] numbers;
                     //static{}  , {}  �ʱ���
    public Lotto() { //Ư���� ����:member field �ʱ�ȭ :(������ �Լ�) , constructor
        scanner = new Scanner(System.in); //�ʱ�ȭ (���� ���� �ּҰ��� ���°�)
        r = new Random();
        numbers = new int[6];
    }
    
    //����� �����غ����� (�Լ�)
    //�Լ��ϳ��� ��� �ϳ�
   
   private String showMenu(Scanner scanner) {
       System.out.println("*********************");
       System.out.println("1. ��÷ ���� ��ȣ ����:");
       System.out.println("2. ����.^^!");
       System.out.println("*********************");
       System.out.print("����� ���ϴ� ��ȣ�� ����:");
       String selectionnum = scanner.nextLine();
       return selectionnum;
   } 
    
   public void selectLottoNumber() {
       //�޴� ����....
escape: while(true) {
           String selectionnum = showMenu(scanner);
           switch (selectionnum) {
                   case "1": 
                           do {
                               selectBasicLottoNumber(r,numbers); //����
                           }while(!checkAverage(numbers) && (!maxMin(numbers)));
                           // checkAverage(numbers) �� ���ε� !�ٿ��� �����̹Ƿ�
                           // �����ϵ��� ��ӵ��� ���̸� ���´�
                            showLottoNumbers(numbers); //ȭ�� ���
                       break;
                   case "2": System.out.println("Good Lucky");
                   		
                       break escape; //escape �������� Ż��..
                   default :
                       System.out.println("Not Operation");
                       break;
               }    
       }
       
   }
   
   private void  selectBasicLottoNumber(Random r , int[] numbers) {
       //�Ƿζ� ��ȣ �����ϰ� �ߺ��� ���� ó�� �ϴ� �Լ�
       for (int i = 0; i < 6; i++) {
           numbers[i] = r.nextInt(45)+1; //���� ����
          for (int j = 0; j < i; j++) {
              if (numbers[i] == numbers[j]) {
                  i--; //point
                  break;
              }
           }
        }
   }
   
   private void showLottoNumbers(int[] numbers) {
       for (int i = 0; i < numbers.length; i++) {
           for (int j = i + 1; j < numbers.length; j++) {
               if (numbers[i] > numbers[j]) {
                   int temp = numbers[i];
                   numbers[i] = numbers[j];
                   numbers[j] = temp;
               }
           }
       }
       for(int i = 0 ; i < numbers.length ; i++) {
           System.out.printf("[%2d]",numbers[i]);
       }
       System.out.println();
   }
   
   
   //����(��� �Լ�) (6���� ���� ���ؼ� 6���� ���� ����� ������ 5���� ũ�ų� ����
   //10���� �۰ų� ������ ��ȣ ����
   //(avg >= 5 && avg <= 10)  true ���� ... �� ������ �ƴϸ� �������ϰڴ�
   private boolean checkAverage(int[] numbers) {
       int sum=0;
       int average=0;
       for(int i = 0 ; i < numbers.length ; i++) {
           sum+= numbers[i];
       }
       average = sum/numbers.length;
       return (average >= 5 && average <= 10); //5,6,7,8,9,10 >> true
       
   }
   
   private boolean maxMin(int[] numbers) {
		int min = numbers[0] ;
		int max = numbers[numbers.length-1];

		return (min <=10 && max >=40); 
	
	}
   
}
 
 