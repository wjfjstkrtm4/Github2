import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Example002 {

	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;
		
		
		try {
			fr = new FileReader("Ex01_Stream.java");
			fw = new FileWriter("copy_Ex02.txt");
			
			int data = 0;
			
			while((data = fr.read()) != -1) {
				System.out.println("data" + (char)data);
				fw.write(data);
				
			}
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
}