package practice.string;

import java.util.Scanner;

public class StringLengthRecurssion {
	private int id;
	public static void main(String[] args) {
		StringLengthRecurssion  slr=new StringLengthRecurssion();
		StringLengthRecurssion slr1=new StringLengthRecurssion();
		slr=slr1;
		System.out.println(slr.equals(slr1));
		System.out.println(slr==slr1);
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String revStr=revStr(str);
		System.out.println("reverseed string    :  "+revStr);
		
		System.out.println("************2nd approch*********");
		String revStrExp="";
		for(int i=0;i<str.length();i++){
			revStrExp=str.charAt(i)+revStrExp;
		}
		System.out.println("revStrExp  :   "+revStrExp);
	}
	
	private static String revStr(String str){
		if(str.length()<2){
			return str;
		}
		return revStr(str.substring(1))+str.charAt(0);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
