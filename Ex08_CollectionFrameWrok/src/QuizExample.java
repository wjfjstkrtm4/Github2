import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class QuizInfo {
    String question;
    String answer;
    String result;

    QuizInfo(String question, String answer, String result) {
        this.question = question;
        this.answer = answer;
        this.result = result;
    }

    
}

public class QuizExample {

    public static void main(String[] args) {
       HashMap<Integer, QuizInfo> quiz = new HashMap();
       Scanner sc = new Scanner(System.in);
       String answer;
       int count=0;
       boolean result;
       quiz.put(1, new QuizInfo("�Ƹ���Ƽ���� ������? ","�ο��뽺���̷���","���?"));
       quiz.put(2, new QuizInfo("ȣ���� ������?","ĵ����","���?"));
       quiz.put(3, new QuizInfo("�ε��� ������?","������","���?"));
       quiz.put(4, new QuizInfo("������ ������?","īƮ����","���?"));
       quiz.put(5, new QuizInfo("�ʸ����� ������?","���Ҷ�","���?"));
       quiz.put(6, new QuizInfo("������ ������?","������","���?"));
       quiz.put(7, new QuizInfo("�̶�ũ�� ������?","�ٱ״ٵ�","���?"));
       quiz.put(8, new QuizInfo("�븸�� ������?","Ÿ�̺���","���?"));
       quiz.put(9, new QuizInfo("�߱��� ������?","����¡","���?"));
       quiz.put(10, new QuizInfo("������ ������?","���","���?"));

       for(int i = 1 ; i <= quiz.size() ; i++) {
           // Set set =quiz.keySet();

           System.out.println(quiz.get(i).question);
           answer = sc.nextLine();
           result = quiz.get(i).answer.equals(answer);
           if(result) {
               quiz.get(i).result = "����";
               System.out.printf("%s�Դϴ�.\n",quiz.get(i).result);
               
               count++;
           }else {
               quiz.get(i).result = "����";
               System.out.printf("%s�Դϴ�.\n",quiz.get(i).result);
           }
           //System.out.println(quiz.keySet().toArray()[i]);


       }
       System.out.printf("%d�� ������ϴ� !" , count);
    }

}