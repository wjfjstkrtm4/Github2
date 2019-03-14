import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class System_Reserve {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		List<Member> member = null;

		member = new ArrayList();
		while (true) {
			Print_Util.clearScreen();
			Print_Util.showMenu();
			String select = sc.nextLine();
			switch (select) {
			case Constants.SIGN_IN:
				Print_Util.clearScreen();
				member.add(Print_Util.signIn());
				break;
			case Constants.LOG_IN:
				Print_Util.clearScreen();
				Print_Util.logIn();
				System.out.println("�α��� ����!");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				A: while (true) { // �α��� ȭ������ ���ɴϴ�!
					Print_Util.clearScreen();
					Print_Util.logInMenu();
					select = sc.nextLine();
					switch (select) {
					case Constants.RESERVATION:
						Print_Util.clearScreen();
						switch (Print_Util.whatWay()) {
						case "1":

							System.out.println("���");
							while (true) {
								Print_Util.showCal();
								String toDate = Print_Util.checkDate();
								System.out.println(toDate);
								if (!toDate.equals("�����̳� ���� ���ĳ�¥�� �������ּ���.")) {
									break;
								}
							}
							System.out.println("����");
							while (true) {
								Print_Util.showCal2();
								String fromDate = Print_Util.checkDate2();
								System.out.println(fromDate);
								if (!fromDate.equals("��߳�¥�� ��߳�¥ ���ĳ�¥�� �������ּ���.")) {
									break;
								}
							}
							Print_Util.enter();
							break;
						case "2":
							System.out.println("���");
							while (true) {
								Print_Util.showCal();
								String toDate = Print_Util.checkDate();
								System.out.println(toDate);
								if (!toDate.equals("�����̳� ���� ���ĳ�¥�� �������ּ���.")) {
									break;
								}
							}
							break;
						}

						break;
					case Constants.RESERVATION_CHECK:
						Print_Util.clearScreen();
						break;
					case Constants.RESERVATION_CANCLE:
						Print_Util.clearScreen();
						break;
					case Constants.LOG_OUT: // �α׾ƿ��� �ϸ� ����ȭ������ !
						System.out.println("�α׾ƿ� ��.");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break A;
					case Constants.EXIT2:
						return;
					default:
						System.out.println("�ùٸ� ���ڸ� �ٽ� �Է��ϼ���.");

					}
				}
				break;
			case Constants.EXIT:
				return;
			case Constants.MANAGER_MODE:
				if (!Print_Util.ManagerMenuPassword()) {
					System.out.println("�н����尡 Ʋ���ϴ�");
					Print_Util.enter();
					continue;
				}
				System.out.println("������ ���� �Ϸ�.");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				escape: while (true) {
					Print_Util.clearScreen();
					Print_Util.showManagerMenu();
					select = sc.nextLine();
					switch (select) {
					case Constants.SCHEDULE:
						break;
					case Constants.MEMBER_LIST:
						Print_Util.MemberList();
						break;
					case Constants.SEAT_PRICE_RESET:
						break;
					case Constants.RETURN:
						break escape;
					default:
						System.out.println("�ùٸ� ���ڸ� �ٽ� �Է��ϼ���.");
					}
				}

			default:
				System.out.println("�ùٸ� ���ڸ� �ٽ� �Է��ϼ���.");
			}
		}
	}
}