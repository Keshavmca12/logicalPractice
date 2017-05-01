package practice.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamClass {

	public static void main(String[] args) {
		
		try {
			System.out.println("fis"+37354);
			System.out.println("bis"+813);//E:\\keshav_software\\SHANKAR   IAS    ENVIRONMENT     NEW.pdf
			//E:\\keshav_software\\fisRead.pdf
			InputStream fis=new FileInputStream(new File("C:\\Users\\NICSI\\Desktop\\extra\\pics\\grapes.jpg"));
			OutputStream fos=new FileOutputStream(new File("E:\\keshav_software\\grapes.jpg"));
			int content;
			long fisStart,fisEnd;
			long output;
			fisStart=System.currentTimeMillis();
			try {
				while ((content = fis.read()) != -1) {
					fos.write(content);
					// convert to char and display it
					//System.out.print((char) content);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fisEnd=System.currentTimeMillis();
			output=fisEnd-fisStart;
			System.out.println("time fis   ::"+output);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
