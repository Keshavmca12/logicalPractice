package com.codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TictacToePrediction {

	public static void main(String[] args) {
		System.out.println("enter test case  ");
		Scanner sc = new Scanner(System.in);
		int noOfTestCase = sc.nextInt();
		System.out.println("noftesxtcase  ::  " + noOfTestCase);
		List<List<String>> inputArray = new ArrayList<>();
		for (int i = 0; i < noOfTestCase; i++) {
			Scanner input = new Scanner(System.in);
			System.out.println("enter row and col of matrix");
			String str = input.nextLine();
			System.out.println(" str :: " + str);
			String[] rowCol = str.split(" ");
			System.out.println("rowCol[0]  :  " + rowCol[0]
					+ "      rwoClo[1]   :  " + rowCol[1]);
			List<String> inputList = new ArrayList<>();
			System.out.println("enetr element  of  " + rowCol[0] + "*"
					+ rowCol[1] + "  matrix in form of 0 and x only");
			for (int j = 0; j < Integer.parseInt(rowCol[0]); j++) {
				inputList.add(input.nextLine());
			}
			System.out
			.println("  i  :  " + i + "    inputList  : " + inputList);
			inputArray.add(inputList);
			if (i + 1 == noOfTestCase) {
				System.out.println("  input Array  :  " + inputArray);
				sc.close();
				input.close();
			}
		}
		List<String> outputList=new ArrayList<String>();
		for(List<String> inputString:inputArray){
			int index=0;
			String[][] singleInputCase=new String[inputString.size()][];
			for(String rowStr:inputString){
				String[] strArray=rowStr.split(" ");
				singleInputCase[index++]=strArray;
			}
			boolean result = true;
			for (int i = 0;i< singleInputCase.length;i++) {
				for (int j = 0; j < singleInputCase[i].length; j++) {
					if (i == j) {
						result = isWinPossible(singleInputCase, i, j,"x");
						if (result) {
							System.out.println("exiting first loop match found");
							break;
						} 
					}
				}
				if (result) {
					System.out.println("exiting second  loop match found");
					break;
				}else{
					result=false;
				}
			}
			if(result){
				outputList.add("Yes");
			}else{
				outputList.add("No");
			}
		}
		System.out.println("output list ::  "+outputList);
	}
	private static boolean isWinPossible(String[][] inputArray, int i, int j,String playerElement) {
		System.out.println("index i:: " + i + "    j ::  " + j);
		System.out.println("element  inputArray[i][j]  :: " + inputArray[i][j]);
		int match=0;
		boolean result = false;
		if (i == 0 && j == 0) {
			System.out.println("inside diagonal check");
			for (int k = 1; k < inputArray.length; k++) {
				for (int l = 1; l < inputArray[k].length; l++) {
					if (k == l && !playerElement.equals(inputArray[k][l])) {
						if(match+1!=inputArray[i].length){
							match=0;
						}
						System.out.println(" k :: " + k + "   l  ::" + l);
						System.out.println("element  inputArray[k][l]  :: "
								+ inputArray[k][l]);
					} else {
						if(k<inputArray[i].length-1){
							match++;
						}
					}
				}
			}
		}
		if(match+1==inputArray[i].length){
			result = true;
			System.out.println("diagonagl result index i:: " + i + "    j ::  " + j);
			return result;
		}
		for (int k = 0; k < inputArray[i].length; k++) {
			if (!playerElement.equals(inputArray[i][k])) {
				match=0;
				System.out.println(" i :: " + i + "   k  ::" + k);
				System.out.println("element  inputArray[i][k]  :: "
						+ inputArray[i][k]);
			} else {
				match++;
			}
		}

		if(match+1==inputArray[i].length){
			result = true;
			System.out.println(" row result index i:: " + i + "    j ::  " + j);
			return result;
		}

		for (int k = 0; k < inputArray.length; k++) {
			if (!playerElement.equals(inputArray[k][j])) {
				System.out.println(" k :: " + k + "   j  ::" + j);
				System.out.println("element  inputArray[k][j]  :: "
						+ inputArray[k][j]);
				match=0;
			} else {
				match++;
			}
		}
		if(match+1==inputArray.length){
			result = true;
			System.out.println(" col result index i:: " + i + "    j ::  " + j);
		}
		return result;
	}
}
