package practice.factorial;

import java.math.BigInteger;

import com.generic.SingleInput;

public class Recursive extends SingleInput {
	public static void main(String[] args) {
		System.out.println("enter no. for recursive factorial::");
		int number=0;
	//	number=getSingleIntegerInput();
		
		int i =10 + + 11 - 12 + + 13- - 14 + + 15;
		
		System.out.println("i= "+i);
		System.out.println("you have entered ::"+number);
		System.out.println("factorial of "+number+" is ::"+factorial(number));
	}
	
	public static BigInteger factorial(int number){
		//System.out.println("number"+number);
		BigInteger result=new BigInteger("1");
		BigInteger gb=new BigInteger(number+"");
		if(number>1){
			return gb.multiply(factorial(number-1));
		}
		return result;
	}
}
