package com.codechef;
import static com.codechef.Utils.inputTestCase;
import static com.codechef.Utils.noOfTestCase;
import java.util.List;

public class IDPass {
	public static void main(String[] args) {
		int noOfTestCase=noOfTestCase();
		List<String> testCaseList=inputTestCase(noOfTestCase);
		for(String str:testCaseList){
			if(str.charAt(0)=='b'|| str.charAt(0)=='B'){
				System.out.println("BattleShip");
			}else if(str.charAt(0)=='c'|| str.charAt(0)=='C'){
				System.out.println("Cruiser");
			}else if(str.charAt(0)=='d'|| str.charAt(0)=='D'){
				System.out.println("Destroyer");
			}else if(str.charAt(0)=='f'|| str.charAt(0)=='F'){
				System.out.println("Fragile");
			}
		}
	}

}
