package com.generic;

import java.util.Scanner;

public abstract class SingleInput {
	public static int getSingleIntegerInput() {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		sc.close();
		return input;
	}
}
