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
		System.out.println("¾ÏÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
		String managerPwd = sc.nextLine();
		return managerPwd.equals("0000");
	}

	public static void showManagerMenu() {
		System.out.println("°ü¸®ÀÚ ¸Þ´º");
		System.out.println("1.ÀÏÁ¤°ü¸®");
		System.out.println("2.È¸¿ø¸ñ·Ïº¸±â");
		System.out.println("3.ÁÂ¼®°¡°Ý Àç¼³Á¤");
		System.out.println("0.¸ÞÀÎ¸Þ´º·Î µ¹¾Æ°¡±â");
	}

	public static void showMenu() {
		System.out.println("³ëÁø¿¡¾î ÁÂ¼® ¿¹¾à ÇÁ·Î±×·¥");
		System.out.println("1. È¸¿ø°¡ÀÔ");
		System.out.println("2. ·Î±×ÀÎ");
		System.out.println("3. Á¾·á");
	}

	public static void logIn() {
		File f = null;
		FileInputStream fr = null;
		BufferedInputStream br = null;
		ObjectInputStream ois = null;
		System.out.println("**·Î±×ÀÎ**");
		System.out.println("¿©±Ç¹øÈ£ : ");
		String passportNum = sc.nextLine();
		System.out.println("ºñ¹Ð¹øÈ£ : ");
		String pwd = sc.nextLine();

		Member users = null;

		try {
			f = new File("C:\\Temp\\Members\\" + passportNum + ".txt");

			if (f.exists()) { // ÆÄÀÏÀÌ ¸¸¾à¿¡ Á¸ÀçÇÒ °æ¿ì
				fr = new FileInputStream("C:\\Temp\\Members\\" + passportNum + ".txt");
				br = new BufferedInputStream(fr);
				ois = new ObjectInputStream(br);
				users = (Member) ois.readObject();
				if (users.getPwd().equals(pwd)) {

					System.out.println("·Î±×ÀÎ µÇ¾ú½À´Ï´Ù.");
				} else {
					System.out.println("¿©±Ç¹øÈ£ ¶Ç´Â ºñ¹Ð¹øÈ£¸¦ ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä.");
					logIn();
				}

			} else {
				System.out.println("È¸¿øÁ¤º¸°¡ Á¸ÀçÇÏÁö ¾Ê½À´Ï´Ù.");
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
		System.out.println("1. ¿¹¸ÅÇÏ±â");
		System.out.println("2. ¿¹¸ÅÈ®ÀÎ");
		System.out.println("3. ¿¹¸ÅÃë¼Ò");
		System.out.println("4. ·Î±×¾Æ¿ô");
		System.out.println("5. Á¾·á");
	}

	public static Member signIn() {
		String form;
		String name, passportNum, cardInfo, pwd, phoneNum;
		System.out.println("È¸¿ø°¡ÀÔ *********");
		while (true) {
			System.out.println("ÀÌ¸§	      : ");
			name = sc.nextLine();
			form = "[°¡-ÆR]{2,4}+";
			if (!Pattern.matches(form, name)) {
				System.out.println("Çü½ÄÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("¿©±Ç¹øÈ£\t: ");
			passportNum = sc.nextLine();
			form = "([a-zA-Z]{1}|[a-zA-Z]{2})\\d{8}";

			while (true) {
				File f = new File("C:\\Temp\\Members\\" + passportNum + ".txt");
				if (f.exists()) {
					System.out.println("Á¸ÀçÇÏ´Â ¿©±Ç¹øÈ£ÀÔ´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä");
					System.out.println("¿©±Ç¹øÈ£\t: ");
					passportNum = sc.nextLine();
					form = "([a-zA-Z]{1}|[a-zA-Z]{2})\\d{8}";
				} else {
					break;
				}
			}
			if (!Pattern.matches(form, passportNum)) {
				System.out.println("Çü½ÄÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
			} else {
				break;
			}

		}

		while (true) {
			System.out.println("ÇÚµåÆù¹øÈ£(ex.010-0000-0000) : ");
			phoneNum = sc.nextLine();
			form = "(010)-\\d{4}-\\d{4}";
			if (!Pattern.matches(form, phoneNum)) {
				if (!phoneNum.contains("-")) {
					System.out.println("ÇÏÀÌÇÂÀ» ³Ö¾î ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
				} else {
					System.out.println("Çü½ÄÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
				}
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("Ä«µå¹øÈ£(ex.0000-1111-2222-3333)\t : ");
			cardInfo = sc.nextLine();
			form = "^\\d{4}-?\\d{4}-?\\d{4}-?\\d{4}$";
			if (!Pattern.matches(form, cardInfo)) {
				if (!cardInfo.contains("-")) {
					System.out.println("ÇÏÀÌÇÂÀ» ³Ö¾î ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
				} else {
					System.out.println("Çü½ÄÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
				}
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("ºñ¹Ð¹øÈ£\t : ");
			pwd = sc.nextLine();
			form = "^(?=.*[a-zA-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";
			if (!Pattern.matches(form, pwd)) {
				System.out.println("Çü½ÄÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
			} else {
				break;
			}
		}

		String pathDirectory = "C:\\Temp\\Members";
		File Folder = new File(pathDirectory);
		if (!Folder.exists()) {
			try {
				Folder.mkdir();
				System.out.println("Members Æú´õ°¡ »ý¼ºµÇ¾ú½À´Ï´Ù.");
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
			System.out.println("È¸¿ø°¡ÀÔÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù.");

		} catch (Exception e) {
			System.out.println("¿¡·¯¹ß»ý!!!");
			e.printStackTrace();
		}

		enter();
		return m;

	}

	public static void enter() {
		System.out.println("¾Æ¹«Å°³ª ÀÔ·ÂÇÏ½Ã¸é ¸ÞÀÎÈ­¸éÀ¸·Î µ¹¾Æ°©´Ï´Ù.");
		sc.nextLine();
	}

	public static String whatWay() {
		System.out.println("1. ¿Õº¹ 2. Æíµµ");
		String select = sc.nextLine();
		return select.equals("1") || select.equals("2") ? select : "Àß¸øµÈ ¹øÈ£ÀÔ´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä\n" + whatWay();
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
				: "¿À´ÃÀÌ³ª ¿À´Ã ÀÌÈÄ³¯Â¥¸¦ ¼±ÅÃÇØÁÖ¼¼¿ä.";
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
		System.out.println("[Ãâ¹ß³¯Â¥ : " + firstDate.get(1) + "/" + firstDate.get(2) + "/" + firstDate.get(3) + "] ,"
				+ "[µµÂø³¯Â¥ : " + Calendar2.year + "/" + Calendar2.month + "/" + Print_Util.day2 + "]");
		return toDay.compareTo(firstDate) == 1 || toDay.compareTo(firstDate) == 0
				? Calendar2.year + "/" + Calendar2.month + "/" + Print_Util.day
				: "Ãâ¹ß³¯Â¥³ª Ãâ¹ß³¯Â¥ ÀÌÈÄ³¯Â¥¸¦ ¼±ÅÃÇØÁÖ¼¼¿ä.";
	}

	public static void showCal() {
		Calendar2.input();
		Calendar2.output(Calendar2.year, Calendar2.month);
		while (true) {
			System.out.println("¿¹¸ÅÇÒ ³¯Â¥ÀÇ ÀÏÀ» ÀÔ·ÂÇÏ¼¼¿ä.");
			day1 = Integer.parseInt(sc.nextLine());
			if (day1 >= 1 && day1 <= 31) {
				break;
			} else {
				System.out.println("Àß¸øµÈ ³¯Â¥ÀÔ´Ï´Ù.");
			}
		}
	}

	public static void showCal2() {
		Calendar2.input();
		Calendar2.output(Calendar2.year, Calendar2.month);
		while (true) {
			System.out.println("¿¹¸ÅÇÒ ³¯Â¥ÀÇ ÀÏÀ» ÀÔ·ÂÇÏ¼¼¿ä.");
			day2 = Integer.parseInt(sc.nextLine());
			if (day2 >= 1 && day2 <= 31) {
				break;
			} else {
				System.out.println("Àß¸øµÈ ³¯Â¥ÀÔ´Ï´Ù.");
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
			File[] files = f.listFiles(); // files¿¡´Â ÆÄÀÏ°ú µð·ºÅÍ¸®°¡ µé¾îÀÖÀ½
			for (int i = 0; i < files.length; i++) {

				String name2 = files[i].getName();
				fs = new FileInputStream(path + name2);
				bis = new BufferedInputStream(fs);
				ois = new ObjectInputStream(bis);
				count++;
				users = (Member) ois.readObject();
				
				System.out.println("***************È¸¿øÀÌ¸§***************\t***************ÃÑÈ¸¿ø¼ö***************");
				
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
		
