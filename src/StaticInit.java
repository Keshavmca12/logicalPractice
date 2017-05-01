import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticInit implements Rideable {

	StaticInit() {
		System.out.print("c ");
	}

	{
		System.out.print("y ");
	}

	static public   void main(String[] args) {
		String a="abc";
		String b= a+"d"; 
		String c="abc"+"d";
		String d = "abcd";
		System.out.println(b==c);
		System.out.println(c==d);

		new StaticInit().go();
		List p = new ArrayList();
		p.add(7);
		p.add(2);;
		p.add(5);
		p.add(2);
	
		Collections.sort(p);
		System.out.println(p);
		
		String[] sa = {"tom ", "jerry "}; 
		for(int x = 0; x < 3; x++) { 
		for(String s: sa) { 
		System.out.print(x + " " + s); 
		if( x == 1) break; 
		}
		}
	}

	void go() {
		System.out.print("g ");
	}

	static {
		System.out.print("x ");
	}
	public String getGait() {
		return " mph, lope";
	}


}

interface Rideable {
String getGait();
}
