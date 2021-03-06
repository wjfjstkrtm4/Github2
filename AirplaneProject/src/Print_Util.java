import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.*;

public class Print_Util {

	private static Scanner sc = new Scanner(System.in);
	private static int day = 0;
	private static int day1 = 0;
	private static int day2 = 0;
	private static Calendar firstDate = null;

	public static void clearScreen() {
		for (int i = 0; i < 80; i++)
			System.out.println("");
	}

	public static boolean ManagerMenuPassword() {
		System.out.println("암호를 입력하세요.");
		String managerPwd = sc.nextLine();
		return managerPwd.equals("0000");
	}

	public static void showManagerMenu() {
		System.out.println("관리자 메뉴");
		System.out.println("1.일정관리");
		System.out.println("2.회원목록보기");
		System.out.println("3.좌석가격 재설정");
		System.out.println("0.메인메뉴로 돌아가기");
	}

	public static void showMenu() {
		System.out.println("노진에어 좌석 예약 프로그램");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
	}

	public static void logIn() {
		File f = null;
		FileInputStream fr = null;
		BufferedInputStream br = null;
		ObjectInputStream ois = null;
		System.out.println("**로그인**");
		System.out.println("여권번호 : ");
		String passportNum = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pwd = sc.nextLine();

		Member users = null;

		try {
			f = new File("C:\\Temp\\Members\\" + passportNum + ".txt");

			if (f.exists()) { // 파일이 만약에 존재할 경우
				fr = new FileInputStream("C:\\Temp\\Members\\" + passportNum + ".txt");
				br = new BufferedInputStream(fr);
				ois = new ObjectInputStream(br);
				users = (Member) ois.readObject();
				if (users.getPwd().equals(pwd)) {

					System.out.println("로그인 되었습니다.");
				} else {
					System.out.println("여권번호 또는 비밀번호를 다시 입력해주세요.");
					logIn();
				}

			} else {
				System.out.println("회원정보가 존재하지 않습니다.");
				logIn();
			}

		} catch (Exception e) {
			e.printStackTrace();
			logIn();
		} finally {
			try {
				ois.close();
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void logInMenu() {
		System.out.println("1. 예매하기");
		System.out.println("2. 예매확인");
		System.out.println("3. 예매취소");
		System.out.println("4. 로그아웃");
		System.out.println("5. 종료");
	}

	public static Member signIn() {
		String form;
		String name, passportNum, cardInfo, pwd, phoneNum;
		System.out.println("회원가입 *********");
		while (true) {
			System.out.println("이름	      : ");
			name = sc.nextLine();
			form = "[가-힣]{2,4}+";
			if (!Pattern.matches(form, name)) {
				System.out.println("형식이 올바르지 않습니다. 다시 입력하세요.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("여권번호\t: ");
			passportNum = sc.nextLine();
			form = "([a-zA-Z]{1}|[a-zA-Z]{2})\\d{8}";

			while (true) {
				File f = new File("C:\\Temp\\Members\\" + passportNum + ".txt");
				if (f.exists()) {
					System.out.println("존재하는 여권번호입니다. 다시 입력해주세요");
					System.out.println("여권번호\t: ");
					passportNum = sc.nextLine();
					form = "([a-zA-Z]{1}|[a-zA-Z]{2})\\d{8}";
				} else {
					break;
				}
			}
			if (!Pattern.matches(form, passportNum)) {
				System.out.println("형식이 올바르지 않습니다. 다시 입력하세요.");
			} else {
				break;
			}

		}

		while (true) {
			System.out.println("핸드폰번호(ex.010-0000-0000) : ");
			phoneNum = sc.nextLine();
			form = "(010)-\\d{4}-\\d{4}";
			if (!Pattern.matches(form, phoneNum)) {
				if (!phoneNum.contains("-")) {
					System.out.println("하이픈을 넣어 다시 입력하세요.");
				} else {
					System.out.println("형식이 올바르지 않습니다. 다시 입력하세요.");
				}
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("카드번호(ex.0000-1111-2222-3333)\t : ");
			cardInfo = sc.nextLine();
			form = "^\\d{4}-?\\d{4}-?\\d{4}-?\\d{4}$";
			if (!Pattern.matches(form, cardInfo)) {
				if (!cardInfo.contains("-")) {
					System.out.println("하이픈을 넣어 다시 입력하세요.");
				} else {
					System.out.println("형식이 올바르지 않습니다. 다시 입력하세요.");
				}
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("비밀번호\t : ");
			pwd = sc.nextLine();
			form = "^(?=.*[a-zA-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";
			if (!Pattern.matches(form, pwd)) {
				System.out.println("형식이 올바르지 않습니다. 다시 입력하세요.");
			} else {
				break;
			}
		}

		String pathDirectory = "C:\\Temp\\Members";
		File Folder = new File(pathDirectory);
		if (!Folder.exists()) {
			try {
				Folder.mkdir();
				System.out.println("Members 폴더가 생성되었습니다.");
			} catch (Exception e) {
				e.getStackTrace();
			}
		}

		Member m = new Member(name, phoneNum, cardInfo, passportNum, pwd);

		try {
			String pathFile = "C:\\Temp\\Members\\" + passportNum + ".txt";
			File file = new File(pathFile);
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(m);
			oos.close();
			fos.close();
			System.out.println("회원가입이 완료되었습니다.");

		} catch (Exception e) {
			System.out.println("에러발생!!!");
			e.printStackTrace();
		}

		enter();
		return m;

	}

	public static void enter() {
		System.out.println("아무키나 입력하시면 메인화면으로 돌아갑니다.");
		sc.nextLine();
	}

	public static String whatWay() {
		System.out.println("1. 왕복 2. 편도");
		String select = sc.nextLine();
		return select.equals("1") || select.equals("2") ? select : "잘못된 번호입니다. 다시 입력하세요\n" + whatWay();
	}

	public static String checkDate() {
		GregorianCalendar today = new GregorianCalendar();
		int year = today.get(today.YEAR);
		int month = today.get(today.MONTH) + 1;
		int day = today.get(today.DAY_OF_MONTH);

		Calendar toDay = Calendar.getInstance();
		Calendar today2 = Calendar.getInstance();
		toDay.set(Calendar2.year, Calendar2.month, Print_Util.day1);
		today2.set(year, month, day);
		firstDate = toDay;

		return today2.compareTo(toDay) == -1 || today2.compareTo(toDay) == 0
				? Calendar2.year + "/" + Calendar2.month + "/" + Print_Util.day
				: "오늘이나 오늘 이후날짜를 선택해주세요.";
	}

	public static String checkDate2() {
		GregorianCalendar today = new GregorianCalendar();
		int year = today.get(today.YEAR);
		int month = today.get(today.MONTH) + 1;
		int day = today.get(today.DAY_OF_MONTH);

		Calendar toDay = Calendar.getInstance();
		Calendar fromDay = Calendar.getInstance();
		Calendar today2 = Calendar.getInstance();
		toDay.set(Calendar2.year, Calendar2.month, Print_Util.day1);
		today2.set(year, month, day);
		System.out.println("[출발날짜 : " + firstDate.get(1) + "/" + firstDate.get(2) + "/" + firstDate.get(3) + "] ,"
				+ "[도착날짜 : " + Calendar2.year + "/" + Calendar2.month + "/" + Print_Util.day2 + "]");
		return toDay.compareTo(firstDate) == 1 || toDay.compareTo(firstDate) == 0
				? Calendar2.year + "/" + Calendar2.month + "/" + Print_Util.day
				: "출발날짜나 출발날짜 이후날짜를 선택해주세요.";
	}

	public static void showCal() {
		Calendar2.input();
		Calendar2.output(Calendar2.year, Calendar2.month);
		while (true) {
			System.out.println("예매할 날짜의 일을 입력하세요.");
			day1 = Integer.parseInt(sc.nextLine());
			if (day1 >= 1 && day1 <= 31) {
				break;
			} else {
				System.out.println("잘못된 날짜입니다.");
			}
		}
	}

	public static void showCal2() {
		Calendar2.input();
		Calendar2.output(Calendar2.year, Calendar2.month);
		while (true) {
			System.out.println("예매할 날짜의 일을 입력하세요.");
			day2 = Integer.parseInt(sc.nextLine());
			if (day2 >= 1 && day2 <= 31) {
				break;
			} else {
				System.out.println("잘못된 날짜입니다.");
			}
		}
	}

	public static void MemberList() {
		File f = null;
		String name = null;
		int count = 0;


		FileInputStream fs = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		String path = "C:\\Temp\\Members\\";
		String line = "";
		Member users = null;
		try {
			f = new File(path);
			File[] files = f.listFiles(); // files에는 파일과 디렉터리가 들어있음
			for (int i = 0; i < files.length; i++) {

				String name2 = files[i].getName();
				fs = new FileInputStream(path + name2);
				bis = new BufferedInputStream(fs);
				ois = new ObjectInputStream(bis);
				count++;
				users = (Member) ois.readObject();
				
				System.out.println("***************회원이름***************\t***************총회원수***************");
				
				System.out.println("               " + "["+users.getName()+"]"+"\t"+"                   		" + "["+count+"]");
			}
			

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				ois.close();
				bis.close();
				fs.close();

			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
		
