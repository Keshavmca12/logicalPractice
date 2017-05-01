package practice.fibonacci;

import java.util.Scanner;

public class Iterative {
	public static void main(String[] args) {
		System.out.println("enter size of iterative fibonacci series  ::");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		sc.close();
		System.out.println("series start ************");
		fibonacci(size);
		System.out.println("series end ***********");
	}

	public  static void fibonacci(int size){
		int temp;
		int last=temp=0;
		int secondLast=0;
		for(int pos=0;pos<size;pos++){
			if(pos<=1){
				last=pos;
			}else{
					temp=last;
				//	System.out.println("secondLast  "+secondLast);
					last= last+secondLast;
					secondLast=temp;
			}
			
		//	System.out.println("last   :"+last);
			System.out.println(last);
		}
	}


}
