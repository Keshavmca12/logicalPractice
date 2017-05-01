package practice.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferInputStreamCLass {
	public static void main(String[] args) {
		try {
			System.out.println("fis read"+37354+"fis read and write"+320258);
			System.out.println("bis"+813+"bis read and write"+1772);
			FileInputStream fis=new FileInputStream(new File("C:\\Users\\NICSI\\Desktop\\extra\\pics\\grapes.jpg"));
			OutputStream fos=new FileOutputStream(new File("E:\\keshav_software\\bisReadgarpes.jpg"),true);
			BufferedInputStream bis=new BufferedInputStream(fis);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			long bisEnd,bisStart;
			int content;
			
			bisStart=System.currentTimeMillis();
			try {
				while ((content = bis.read()) != -1) {
					//System.out.println(content);
					bos.write(content);
					// convert to char and display it
					//System.out.print((char) content);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bisEnd=System.currentTimeMillis();
			System.out.println("time bis   ::"+(bisEnd-bisStart));
			
			try {
				bis.close();
				fis.close();
				bos.close();
				fos.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
