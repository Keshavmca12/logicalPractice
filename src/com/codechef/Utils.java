package com.codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
	public static int noOfTestCase(){
		System.out.println("enter no of test cases   ::  ");
		Scanner scanner=new Scanner(System.in);
		int noOfTestCase=scanner.nextInt();
		return noOfTestCase;
	}

	public static List<String> inputTestCase(int noOfTestCase){
		List<String> testCaseList=new ArrayList<String>();
		for(int i=0;i<noOfTestCase;i++){
			Scanner sc=new Scanner(System.in);
			testCaseList.add(sc.nextLine());
		}
		System.out.println("testCaseList  ::  "+testCaseList);
		return testCaseList;
	}
}
