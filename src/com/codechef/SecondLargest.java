package com.codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondLargest {
	/*public static void main(String[] args) {
		int[] arr={45,56,12};
		int largest=-1;
		if(arr[0]>arr[1]){
			if(arr[2]>arr[0]){
				largest=arr[2];
			}else{
				largest=arr[0];
			}
		}else{
			if(arr[2]>arr[1]){
				largest=arr[2];
			}else{
				largest=arr[1];
			}
		}
		System.out.println("largest  :: "+largest);
	}*/
	public static void main(String[] args) {
		System.out.println("enter no of test cases   ::  ");
		Scanner scanner=new Scanner(System.in);
		int noOfTestCase=scanner.nextInt();
		scanner.close();
		List<String> testCaseList=new ArrayList<String>();
		for(int i=0;i<noOfTestCase;i++){
			Scanner sc=new Scanner(System.in);
			testCaseList.add(sc.nextLine());
			sc.close();
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
			int num=findSecondLargest(arr);	
			resultList.add(num);
		}
		System.out.println("result   :    "+resultList);
	}
	
	private static int findSecondLargest(List<Integer> array){
		int secLargest=-1;
		if(array.get(0)>array.get(1)){
			if(array.get(2)>array.get(0)){
				secLargest=array.get(0);
			}else{
				secLargest=array.get(2);
			}
		}else{
			if(array.get(2)>array.get(1)){
				secLargest=array.get(1);
			}else{
				secLargest=array.get(2);
			}
		}
	//	System.out.println("secLargest  :: "+secLargest);
		return secLargest;
	}
}
