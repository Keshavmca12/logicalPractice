package com.codechef;


public class TicTacToe {
	public static void main(String[] args) {
		/* int noOfTestCase=noOfTestCase(); */
		String[][] inputArray = new String[][] { { "0", "x", "x" },
				{ "0", "x", "0" }, { "x", "0", "00" } };
		/*
		 * System.out.println("inputArray : " + inputArray.length);
		 * System.out.println("inputArray[i] :  " + inputArray[0].length);
		 */
		boolean result = true;
		for (int i = 0;i< inputArray.length;i++) {                 
			for (int j = 0; j < inputArray[i].length; j++) {
				if (i == j) {
					result = checkElement(inputArray, i, j);
					if (result) {
						System.out.println("exiting first loop match found");
						break;
					} 
				}
			}
			if (result) {
				System.out.println("exiting second  loop match found");
				break;
			} 
		}
		System.out.println("finally  result  :: " + result);
	}

	private static boolean checkElement(String[][] inputArray, int i, int j) {
		System.out.println("index i:: " + i + "    j ::  " + j);
		System.out.println("element  inputArray[i][j]  :: " + inputArray[i][j]);
		boolean result = false;
		if (i == 0 && j == 0) {
			System.out.println("inside diagonal check");
			for (int k = 1; k < inputArray.length; k++) {
				for (int l = 1; l < inputArray[k].length; l++) {
					if (k == l && inputArray[i][j] != inputArray[k][l]) {
						System.out.println(" k :: " + k + "   l  ::" + l);
						System.out.println("element  inputArray[k][l]  :: "
								+ inputArray[k][l]);
						result = false;
						break;
					} else {
						result = true;
					}
				}
			}
		}
		if(result){
			System.out.println("diagonagl result index i:: " + i + "    j ::  " + j);
			return result;
		}
		
		for (int k = 0; k < inputArray.length; k++) {
			for (int l = 0; l < inputArray[k].length; l++) {
				if (k+l==inputArray.length && inputArray[i][j] != inputArray[k][l]) {
					System.out.println(" k :: " + k + "   l  ::" + l);
					System.out.println("element  inputArray[k][l]  :: "
							+ inputArray[k][l]);
					result = false;
					break;
				} else {
					result = true;
				}
			}
		}
		
		if(result){
			System.out.println("diagonagl result index i:: " + i + "    j ::  " + j);
			return result;
		}
		
		
		for (int k = 0; k < inputArray[i].length; k++) {
			if (inputArray[i][j] != inputArray[i][k]) {
				System.out.println(" i :: " + i + "   k  ::" + k);
				System.out.println("element  inputArray[i][k]  :: "
						+ inputArray[i][k]);
				result = false;
				break;
			} else {
				result = true;
			}
		}
		
		if(result){
			System.out.println(" row result index i:: " + i + "    j ::  " + j);
			return result;
		}
		
		for (int k = 0; k < inputArray.length; k++) {
			if (inputArray[i][j] != inputArray[k][j]) {
				System.out.println(" k :: " + k + "   j  ::" + j);
				System.out.println("element  inputArray[k][j]  :: "
						+ inputArray[k][j]);
				result = false;
				break;
			} else {
				result = true;
			}
		}
		if(result){
			System.out.println(" col result index i:: " + i + "    j ::  " + j);
		}
		return result;
	}

}
