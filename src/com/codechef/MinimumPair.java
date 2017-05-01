package com.codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumPair {
	/*public static void main(String[] args) {
		int[] arr={45,56,12,89,98,7777,522,32,010,20};
		int minimum=9999;
		int secMinimum=9999;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<minimum){
				secMinimum=minimum;
				minimum=arr[i];
			}else if(arr[i]<secMinimum){
				secMinimum=arr[i];
			}
		}
		System.out.println(" minm  :: "+minimum  +"    secminm :: "+secMinimum);
	}*/
	public static void main(String[] args) {
		System.out.println("enter no of test cases   ::  ");
		Scanner scanner=new Scanner(System.in);
		int noOfTestCase=scanner.nextInt();
		List<String> testCaseList=new ArrayList<String>();
		for(int i=0;i<noOfTestCase;i++){
			Scanner sc=new Scanner(System.in);
			testCaseList.add(sc.nextLine());
		}
		System.out.println("testCaseList  ::  "+testCaseList);
		List<List<Integer>> listArray=new ArrayList<List<Integer>>();
		for(String testCase:testCaseList){
			//System.out.println("test case :: "+testCase);
			String[]  testCaseArray=testCase.split(" ");
			List<Integer> intArray=null;
			for(int j=0;j<testCaseArray.length;j++){
				if(j==0){
					intArray=new ArrayList<Integer>();
				}
				intArray.add(Integer.parseInt(testCaseArray[j]));
			}
			listArray.add(intArray);
		}
		List<Integer> resultList=new ArrayList<Integer>();
		for(List<Integer> arr:listArray){
			//System.out.println("arrr   ::   "+arr);
			int num=findMinimumPair(arr);	
			resultList.add(num);
		}
		System.out.println("result   :    "+resultList);
	}
	
	private static int findMinimumPair(List<Integer> array){
		int minimum=99999;
		int secondMinimum=99999;
		for(int i=0;i<array.size();i++){
			if(array.get(i)<minimum){
				secondMinimum=minimum;
				minimum=array.get(i);
			}else if(array.get(i)<secondMinimum){
				secondMinimum=array.get(i);
			}
		}
		System.out.println("minm ::  "+minimum+"   secondminimum :: "+secondMinimum);
		int result=minimum+secondMinimum;
		return result;
	}
}
