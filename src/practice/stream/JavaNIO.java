package practice.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaNIO {
	public static void main(String[] args) {
		Path path = Paths.get("E:\\keshav_software\\SHANKAR   IAS    ENVIRONMENT     NEW.pdf");
		long nioStart=System.currentTimeMillis();
	    try(BufferedReader reader = Files.newBufferedReader(path, Charset.forName("ISO-8859-1"))){

	      
	      String currentLine = null;
	      while((currentLine = reader.readLine()) != null){//while there is content on the current line
	        System.out.println(currentLine); // print the current line
	      }
	      System.out.println("time nio   ::"+(System.currentTimeMillis()-nioStart));
	    }catch(IOException ex){
	      ex.printStackTrace(); //handle an exception here
	    }
	}

}
