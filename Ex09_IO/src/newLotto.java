import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JOptionPane;

class lottoNumAuto extends Thread {

	static boolean stop = false;

	public void run() {
		int num = 0;
		int cnt = 0;
		a: for (int i = 10; i > 0; i--) {
			if (stop) {
				break a;
			}
			System.out.println("���� �ð�: " + i);
			try {
				Thread.sleep(1000); // cpu�� �����ϰ� �ִ� �ʴ� ��� ����

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

		if (newLotto.lottoNum.size() < 6) {
			for (int j = 0; newLotto.lottoNum.size() < 6; j++) {
				newLotto.lottoNum.add((int) (Math.random() * 45) + 1);

			}
		}
		System.out.println("����� �ζǹ�ȣ�� " + newLotto.lottoNum);
		newLotto.fileWrite();
	}
}

class lottoNumStick extends Thread {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int num = 0;
		System.out.println("�ζǹ�ȣ�� �������� �Է��մϴ�. 1~45������ ��ȣ�� �Է��ϼ���: ");

		for (int i = 0; newLotto.lottoNum.size() < 6; i++) {
			System.out.printf("%d��° ����: \n", i + 1);
			num = Integer.parseInt(sc.nextLine());

			for (int j = 0; j < newLotto.lottoNum.size(); j++) {
				if (newLotto.lottoNum.contains(num)) {
					System.out.println("�ߺ��� ���Դϴ�. �ٽ� �Է��ϼ���!");
					num = Integer.parseInt(sc.nextLine());

				}

			}
			newLotto.lottoNum.add(num);
			System.out.println("");

		}
		lottoNumAuto.stop = true;
	}

}

public class newLotto {
	static Set<Integer> lottoNum = new TreeSet<Integer>();

	static String date() {
		int year = 0;
		int month = 0;
		int day = 0;

		String result = "";
		Calendar cal = Calendar.getInstance();

		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;

		day = cal.get(Calendar.DATE);

		result = year + "." + month + "." + day;
		return result;
	}

	public static void fileWrite() {
		try {
			FileWriter pw = new FileWriter("C:\\Temp\\" + date() + ".txt", true);

			pw.write("�ζǹ�ȣ:" + newLotto.lottoNum.toString() + "");

			// for (int i = 0; i < lottoNumAuto.lottoNum.size(); i++) {
			// pw.write(lottoNumAuto.lottoNum+"\n");

			pw.write("\n");
			pw.close();
		} catch (Exception e) {

		}

	}

	public static void main(String[] args) {
		lottoNumStick stick = new lottoNumStick();
		lottoNumAuto auto = new lottoNumAuto();

		stick.start();
		auto.start();

	}

}