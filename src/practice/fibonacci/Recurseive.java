
package practice.fibonacci;

import java.util.Scanner;

public class Recurseive {
	public static void main(String[] args) {
		System.out.println("enter size of fibonnaci series with recursion ::");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		sc.close();
		System.out.println("series start ************");
		for(int i=0; i<size; i++){
		System.out.println(fibonacci(i));
		}
		System.out.println("series end ***********");
	}
	public  static int fibonacci(int size){
		if(size<=1){
			return size;
		}else{
			return fibonacci(size-1)+fibonacci(size-2);
		}
	}
}
