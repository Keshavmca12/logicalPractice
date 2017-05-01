package practice.string;

import java.util.HashMap;
import java.util.Map;

public class StringConversion {
	public static void main(String[] args) {
		char ch='5';
		String str1=Character.toString(ch);
		str1=String.valueOf(ch);
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		String str=String.valueOf(5);
		hm.put("d",10);
		for(Map.Entry<String, Integer> en:hm.entrySet()){
			System.out.println(en.getKey()+en.getValue()+hm.get("d"));
		}
		str.concat(str1);
		System.out.println("str"+str);
		System.out.println('5'+""+15);
	}
}
