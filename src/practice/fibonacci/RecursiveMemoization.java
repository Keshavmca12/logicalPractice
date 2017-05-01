package practice.fibonacci;

import java.util.Scanner;
import java.util.TreeMap;

public class RecursiveMemoization {
	static TreeMap<Integer, Integer> fibCache = new TreeMap<Integer, Integer>();

	public static void main(String[] args) {
		System.out
				.println("enter size of fibonnaci series with recursive memoization ::");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.close();
		System.out.println("series start ************");
		for (int i = 0; i < size; i++) {
			System.out.println(fibonacci(i));
		}
		System.out.println("series end ***********");
	}

	public static int fibonacci(int size) {

		if (size <= 1) {
			return size;
		} else {
			if (fibCache.get(size) == null) {
				fibCache.put(size, fibonacci(size - 1) + fibonacci(size - 2));
			}
			return fibCache.get(size);
		}
	}
}
