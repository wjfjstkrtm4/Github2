
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.Random;
import java.util.Scanner;
 
//���赵
//Lotto lotto = new Lotto() ; 
//lotto.SelectLottoNumber() ; >> �޴� ����
//1 �Է� -> ��ȣ���� selectBasicNumber() �Լ� ȣ�� (�ǹ�ȣ ����)
//2 �Է� -> ���α׷� ����......
public class LottoHomework  {
    private Scanner sc;
    private Random r;
    // r.nextInt(45)
    private int[] numbers;
    private int[] input;
    private int count;
    private FileReader fr = null;
    private FileWriter fw = null;
    private PrintWriter pw = null;
    private int count2 = 1;
	
 
    // static{}
    public LottoHomework() { // Ư���� ���� : ����ʵ� �ʱ�ȭ.. ( ������ �Լ� ) , constructor
        sc = new Scanner(System.in);// �ʱ�ȭ (���������� �ּҰ��� ���°�.)
        r = new Random();
        numbers = new int[6];
        input = new int[6];

    }
 
    public void showLottoMenu() {
        int i;
        do {
            System.out.println("�ζ����α׷�");
            System.out.println("******************");
            System.out.println("1. �ζ� ��ȣ �ޱ�");
            System.out.println("2. �ζ� �ùķ��̼�");
            System.out.println("3. ���α׷� ����");
            System.out.println("*****************");
            System.out.println("���ϴ� ��ȣ(1~3) �Է� :");
            i = sc.nextInt();
            if (i < 1 || i > 3) {
                System.out.println("Error : 1~3���� �Է��ϼ���.");
                System.out.println();
            }
            switch (i) {
 
            case 1:
                String path = "C:\\Temp\\zzz\\{0}.txt";
                Object pathForm = count2;
                String resultPath = MessageFormat.format(path, pathForm);
                do {
                    selectGetNumber();
                } while (maxMin(numbers) == false);
                
                try {
                	
					pw = new PrintWriter(resultPath);
					System.out.print("���� ��ȣ : ");
	           
	                pw.printf("%d, %d, %d, %d, %d, %d", numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5]);
	                pw.close();
	        		fr = new FileReader(resultPath);
					BufferedReader br = new BufferedReader(fr);
			
	                String data = "";
	                while((data = br.readLine()) != null) {
	                	System.out.println(data);
		                
	                }
                } catch (IOException e) {
                	System.out.println(e.getMessage());
                }
    
                System.out.println();
                System.out.println();
                count2++;
                break;
            case 2:
                simul();
                break;
            }
        } while (i != 3);
    }
    
 
    private void selectGetNumber() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int swap = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = swap;
                }
            }
        }
 
    }
 
    private void simul() {
 
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println("���� ���� 6�� �Է�(1~45) : ");
        for (int i = 0; i < numbers.length; i++) {
            input[i] = sc.nextInt();
        }
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (input[i] == numbers[j]) {
                    count += 1;
                }
            }
        }
        System.out.print("��÷��ȣ : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.printf("%d�� �¾ҽ��ϴ�! ", count);
        System.out.println();
        System.out.println();
        // ����(��� �Լ�) (6���� ���� ���ؼ� 6���� ���� ����� ������ 5���� ũ�ų� ����
        // 10���� �۰ų� ������ ��ȣ �����ϰڴ�)
        // (avg >= 5 && avg <= 10) true ���� ... ������ �ٸ��� ������
    }
 
    private boolean maxMin(int[] numbers) {
        int max = numbers[numbers.length - 1];
        int min = numbers[0];
 
        return (max >= 40 && min <= 10); // �ִ밪�� 40�̻� , �ּҰ��� 10����
    }
    
 
}