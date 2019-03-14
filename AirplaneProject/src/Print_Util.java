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
		System.out.println("��ȣ�� �Է��ϼ���.");
		String managerPwd = sc.nextLine();
		return managerPwd.equals("0000");
	}

	public static void showManagerMenu() {
		System.out.println("������ �޴�");
		System.out.println("1.��������");
		System.out.println("2.ȸ����Ϻ���");
		System.out.println("3.�¼����� �缳��");
		System.out.println("0.���θ޴��� ���ư���");
	}

	public static void showMenu() {
		System.out.println("�������� �¼� ���� ���α׷�");
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		System.out.println("3. ����");
	}

	public static void logIn() {
		File f = null;
		FileInputStream fr = null;
		BufferedInputStream br = null;
		ObjectInputStream ois = null;
		System.out.println("**�α���**");
		System.out.println("���ǹ�ȣ : ");
		String passportNum = sc.nextLine();
		System.out.println("��й�ȣ : ");
		String pwd = sc.nextLine();

		Member users = null;

		try {
			f = new File("C:\\Temp\\Members\\" + passportNum + ".txt");

			if (f.exists()) { // ������ ���࿡ ������ ���
				fr = new FileInputStream("C:\\Temp\\Members\\" + passportNum + ".txt");
				br = new BufferedInputStream(fr);
				ois = new ObjectInputStream(br);
				users = (Member) ois.readObject();
				if (users.getPwd().equals(pwd)) {

					System.out.println("�α��� �Ǿ����ϴ�.");
				} else {
					System.out.println("���ǹ�ȣ �Ǵ� ��й�ȣ�� �ٽ� �Է����ּ���.");
					logIn();
				}

			} else {
				System.out.println("ȸ�������� �������� �ʽ��ϴ�.");
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
		System.out.println("1. �����ϱ�");
		System.out.println("2. ����Ȯ��");
		System.out.println("3. �������");
		System.out.println("4. �α׾ƿ�");
		System.out.println("5. ����");
	}

	public static Member signIn() {
		String form;
		String name, passportNum, cardInfo, pwd, phoneNum;
		System.out.println("ȸ������ *********");
		while (true) {
			System.out.println("�̸�	      : ");
			name = sc.nextLine();
			form = "[��-�R]{2,4}+";
			if (!Pattern.matches(form, name)) {
				System.out.println("������ �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("���ǹ�ȣ\t: ");
			passportNum = sc.nextLine();
			form = "([a-zA-Z]{1}|[a-zA-Z]{2})\\d{8}";

			while (true) {
				File f = new File("C:\\Temp\\Members\\" + passportNum + ".txt");
				if (f.exists()) {
					System.out.println("�����ϴ� ���ǹ�ȣ�Դϴ�. �ٽ� �Է����ּ���");
					System.out.println("���ǹ�ȣ\t: ");
					passportNum = sc.nextLine();
					form = "([a-zA-Z]{1}|[a-zA-Z]{2})\\d{8}";
				} else {
					break;
				}
			}
			if (!Pattern.matches(form, passportNum)) {
				System.out.println("������ �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
			} else {
				break;
			}

		}

		while (true) {
			System.out.println("�ڵ�����ȣ(ex.010-0000-0000) : ");
			phoneNum = sc.nextLine();
			form = "(010)-\\d{4}-\\d{4}";
			if (!Pattern.matches(form, phoneNum)) {
				if (!phoneNum.contains("-")) {
					System.out.println("�������� �־� �ٽ� �Է��ϼ���.");
				} else {
					System.out.println("������ �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
				}
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("ī���ȣ(ex.0000-1111-2222-3333)\t : ");
			cardInfo = sc.nextLine();
			form = "^\\d{4}-?\\d{4}-?\\d{4}-?\\d{4}$";
			if (!Pattern.matches(form, cardInfo)) {
				if (!cardInfo.contains("-")) {
					System.out.println("�������� �־� �ٽ� �Է��ϼ���.");
				} else {
					System.out.println("������ �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
				}
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("��й�ȣ\t : ");
			pwd = sc.nextLine();
			form = "^(?=.*[a-zA-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";
			if (!Pattern.matches(form, pwd)) {
				System.out.println("������ �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
			} else {
				break;
			}
		}

		String pathDirectory = "C:\\Temp\\Members";
		File Folder = new File(pathDirectory);
		if (!Folder.exists()) {
			try {
				Folder.mkdir();
				System.out.println("Members ������ �����Ǿ����ϴ�.");
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
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");

		} catch (Exception e) {
			System.out.println("�����߻�!!!");
			e.printStackTrace();
		}

		enter();
		return m;

	}

	public static void enter() {
		System.out.println("�ƹ�Ű�� �Է��Ͻø� ����ȭ������ ���ư��ϴ�.");
		sc.nextLine();
	}

	public static String whatWay() {
		System.out.println("1. �պ� 2. ��");
		String select = sc.nextLine();
		return select.equals("1") || select.equals("2") ? select : "�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���\n" + whatWay();
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
				: "�����̳� ���� ���ĳ�¥�� �������ּ���.";
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
		System.out.println("[��߳�¥ : " + firstDate.get(1) + "/" + firstDate.get(2) + "/" + firstDate.get(3) + "] ,"
				+ "[������¥ : " + Calendar2.year + "/" + Calendar2.month + "/" + Print_Util.day2 + "]");
		return toDay.compareTo(firstDate) == 1 || toDay.compareTo(firstDate) == 0
				? Calendar2.year + "/" + Calendar2.month + "/" + Print_Util.day
				: "��߳�¥�� ��߳�¥ ���ĳ�¥�� �������ּ���.";
	}

	public static void showCal() {
		Calendar2.input();
		Calendar2.output(Calendar2.year, Calendar2.month);
		while (true) {
			System.out.println("������ ��¥�� ���� �Է��ϼ���.");
			day1 = Integer.parseInt(sc.nextLine());
			if (day1 >= 1 && day1 <= 31) {
				break;
			} else {
				System.out.println("�߸��� ��¥�Դϴ�.");
			}
		}
	}

	public static void showCal2() {
		Calendar2.input();
		Calendar2.output(Calendar2.year, Calendar2.month);
		while (true) {
			System.out.println("������ ��¥�� ���� �Է��ϼ���.");
			day2 = Integer.parseInt(sc.nextLine());
			if (day2 >= 1 && day2 <= 31) {
				break;
			} else {
				System.out.println("�߸��� ��¥�Դϴ�.");
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
			File[] files = f.listFiles(); // files���� ���ϰ� ���͸��� �������
			for (int i = 0; i < files.length; i++) {

				String name2 = files[i].getName();
				fs = new FileInputStream(path + name2);
				bis = new BufferedInputStream(fs);
				ois = new ObjectInputStream(bis);
				count++;
				users = (Member) ois.readObject();
				
				System.out.println("***************ȸ���̸�***************\t***************��ȸ����***************");
				
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
		
