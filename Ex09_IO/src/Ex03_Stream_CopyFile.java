import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex03_Stream_CopyFile {

	public static void main(String[] args) throws Exception {
		String orifile = "C:\\Temp\\1.png";
		String targetfile = "copy.png";
		// default 경로 : C:\FrontAndBackAnd\JAVA\Github2\Ex09_IO
		// 경로를 명시하지 않으면 >> 프로젝트 폴더가 default ...
		
		FileInputStream fis = new FileInputStream(orifile);
		FileOutputStream fos = new FileOutputStream(targetfile);
		
		int data = 0;
		
		while((data = fis.read()) != -1 ) {
			fos.write(data);
		}
		fos.close();
		fis.close();
		System.out.println("작업완료");
	}

}
