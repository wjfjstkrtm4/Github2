package kr.or.bit;
//�츮 ���� �ý��ۿ� ���Ǵ� ��¥ ���õ� �Լ�  ...

//�� �Լ��� ���� ���ȴٸ� >> new ��ü ���� (x) >> Ŭ�����̸�.�Լ��̸�() static >> 
//�پ��� ��¥ ���°� �ʿ��ϴٸ� >> �Լ��߰� (�����ε�)

import java.util.Calendar;

public class Edu_Date {
	public static String DateString(Calendar date) {
		return date.get(Calendar.YEAR) + "��" + (date.get(Calendar.MONTH) + 1) + "��" + date.get(Calendar.DATE) + "��";
	}

	public static String DateString(Calendar date, String opr) {
		return date.get(Calendar.YEAR) + opr + (date.get(Calendar.MONTH) + 1) + opr + date.get(Calendar.DATE);
	}
	// ����� : ���� ���ڸ� ǥ��  (1~9)���ڸ� , 10,11,12 ���ڸ�
	//

	// ��� 2�ڸ� ǥ�� : 2018-02-12
	// 2018-01-01
	// 2019-12-12
	public static String monthFormat_DateString(Calendar date) {
		String month="";
		if((date.get(Calendar.MONTH)+1) < 10) {
			month = "0" + (date.get(Calendar.MONTH)+1);
		}else {
			month = String.valueOf((date.get(Calendar.MONTH)+1));
		}
		return date.get(Calendar.YEAR) + "��" 
		       + month + "��" 
		       + date.get(Calendar.DATE) + "��";
	}

}


