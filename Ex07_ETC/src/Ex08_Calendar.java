import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import kr.or.bit.Edu_Date;

/*
* Calendar �� ��ӹ޾� ������ ������ Ŭ������ 
 * GregorianCalendar
   buddhisCalendar �ִµ� getInstance()�� [�ý����� ������ ��������]�� [Ȯ��]�ؼ�
      �±��� ��� buddhisCalendar �� �ν��Ͻ��� ��ȯ�ϰ� �� �ܿ��� GregorianCalendar
     �� �ν��Ͻ��� ��ȯ�Ѵ�
   GregorianCalendar �� Calendar�� ��ӹ޾� ���ó� ������ �������� ����ϰ� �ִ� 
   �׷����¿� �°� ������ ������ �±��� ������ ������ ���������� GregorianCalendar ���
   �׷��� �ν��Ͻ��� ���� �����ؼ� ������� �ʰ� �޼��带 ���ؼ� �ν��Ͻ��� ��ȯ�ް��ϴ�
   ������ �ּ��� �������� ���α׷� ������ �ϵ��� �ϱ� ����
   class MyApp{
     static void main(){
      Calendar cal = new GregorianCalendar(); .. �±� �����ϰ� ��� // ���� �±����󿡼� ������ �ٲ������
      �ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����......    }  }
   class MyApp{
     static void main(){
      Calendar cal = Calendar.getInstance(); // os�� �������ִ� ������ �°� �±�, �ٸ����� �ٵ�
        �ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����......   }  }
  API : ������ Protected Calendar() 
 */
//Java API
//��¥ : Date (��) -> Calendar(��)
public class Ex08_Calendar {
	public static void main(String[] args) {
		//��� �ý����� ��¥�� ����
		Date dt = new Date(); //������
		System.out.println(dt);
		
		Calendar cal = Calendar.getInstance();// �̱����̶�⺸�ٴ� 
		System.out.println(cal.toString()); //toString ������ (��¥ ���� ���ڿ� ����)
		//Calendar cal2 = new GregorianCalendar();
		//System.out.println(cal2);
		System.out.println("�⵵ : " + cal.get(Calendar.YEAR));
		System.out.println("��(0~11) : " + (cal.get(Calendar.MONTH)+1));
		System.out.println("�� : " + cal.get(Calendar.DATE));
		
		System.out.println("�� ���� ��° �� :" + cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		//��  ��  �� ����ϼ���
		//����  ���� (AM PM)
		System.out.println("�� : "+ cal.get(Calendar.HOUR));
		System.out.println("�� : "+ cal.get(Calendar.MINUTE));
		System.out.println("�� : "+ cal.get(Calendar.SECOND));
		System.out.println("���� ���� :" + cal.get(Calendar.AM_PM));
		//���� 0 , ���� 1
		
		//�� ����Ʈ (���� �ý���)
		//150�� (������) >> 120������ ��¥ ������ ������ �ִ� (������ �ð�)
		//2018��02��12��   >> ���� >> 2018-02-12 // �� .... 
		//��¥ ���� �ѹ��� �����ؼ� ��ü �ݿ� : Ŭ���� >> �Լ� (static) >> ��¥ 
		String date = Edu_Date.DateString(Calendar.getInstance());
		System.out.println(date);
		
		String date2 = Edu_Date.DateString(Calendar.getInstance(),"::");
		System.out.println(date2);
		
		String date3 = Edu_Date.monthFormat_DateString(Calendar.getInstance());
		System.out.println(date3);
	}

}















