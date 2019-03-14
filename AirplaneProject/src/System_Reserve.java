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
				System.out.println("로그인 성공!");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				A: while (true) { // 로그인 화면으로 들어옵니다!
					Print_Util.clearScreen();
					Print_Util.logInMenu();
					select = sc.nextLine();
					switch (select) {
					case Constants.RESERVATION:
						Print_Util.clearScreen();
						switch (Print_Util.whatWay()) {
						case "1":

							System.out.println("출발");
							while (true) {
								Print_Util.showCal();
								String toDate = Print_Util.checkDate();
								System.out.println(toDate);
								if (!toDate.equals("오늘이나 오늘 이후날짜를 선택해주세요.")) {
									break;
								}
							}
							System.out.println("도착");
							while (true) {
								Print_Util.showCal2();
								String fromDate = Print_Util.checkDate2();
								System.out.println(fromDate);
								if (!fromDate.equals("출발날짜나 출발날짜 이후날짜를 선택해주세요.")) {
									break;
								}
							}
							Print_Util.enter();
							break;
						case "2":
							System.out.println("출발");
							while (true) {
								Print_Util.showCal();
								String toDate = Print_Util.checkDate();
								System.out.println(toDate);
								if (!toDate.equals("오늘이나 오늘 이후날짜를 선택해주세요.")) {
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
					case Constants.LOG_OUT: // 로그아웃을 하면 메인화면으로 !
						System.out.println("로그아웃 중.");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break A;
					case Constants.EXIT2:
						return;
					default:
						System.out.println("올바른 숫자를 다시 입력하세요.");

					}
				}
				break;
			case Constants.EXIT:
				return;
			case Constants.MANAGER_MODE:
				if (!Print_Util.ManagerMenuPassword()) {
					System.out.println("패스워드가 틀립니다");
					Print_Util.enter();
					continue;
				}
				System.out.println("관리자 인증 완료.");
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
						System.out.println("올바른 숫자를 다시 입력하세요.");
					}
				}

			default:
				System.out.println("올바른 숫자를 다시 입력하세요.");
			}
		}
	}
}