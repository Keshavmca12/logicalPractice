package practice.factorial;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

import com.generic.SingleInput;

public class Iterative extends SingleInput{
	public static void main(String[] args) {
		System.out.println("enter no. for iterative factorial::");
		int number=getSingleIntegerInput();
		System.out.println("you have entered ::"+number);
		System.out.println("factorial of "+number+" is ::"+factorial(number));
	}
	public static int factorial(int number){
		//System.out.println("number"+number);
		int result=1;
		for(int i=1;i<=number;i++){
		//	System.out.println("result "+result + "    i  :::"+i);
			result*=i;
		}
		return result;
	}
}


class SMPAIR
{
   static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	static void solve()
	{
	   int t=readInt();
	   while(t-->0)
	   {
	       int n=readInt();
	       int a[]=readNumArray(n);
	       int min1=9999999;int min2=99999999;
	       for(int i=0;i<n;i++)
	       {
	           if(a[i]<min1)
	           {
	               min2=min1;
	               min1=a[i];
	           }
	           else if(a[i]<min2)
	           {
	               min2=a[i];
	           }
	   }
	   out.println(min1+min2);
}
}
public static void main(String[] args) throws Exception
	{
		//long S = System.currentTimeMillis();
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
		//long G = System.currentTimeMillis();
		//tr(G-S+"ms");
	}
	
	private static boolean eof()
	{
		if(lenbuf == -1)return true;
		int lptr = ptrbuf;
		while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;
		
		try {
			is.mark(1000);
			while(true){
				int b = is.read();
				if(b == -1){
					is.reset();
					return true;
				}else if(!isSpaceChar(b)){
					is.reset();
					return false;
				}
			}
		} catch (IOException e) {
			return true;
		}
	}
	
	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;
	
	private static int read()
	{
		if(lenbuf == -1)throw new InputMismatchException();
		if(ptrbuf >= lenbuf){
			ptrbuf = 0;
			try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private static boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
	private static int skip() { int b; while((b = read()) != -1 && isSpaceChar(b)); return b; }
	
	private static double readDouble() { return Double.parseDouble(readString()); }
	private static char readChar() { return (char)skip(); }
	
	private static String readString()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
			sb.appendCodePoint(b);
			b = read();
		}
		return sb.toString();
	}
	
	private static char[] readString(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b))){
			buf[p++] = (char)b;
			b = read();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	
	private static char[][] nm(int n, int m)
	{
		char[][] map = new char[n][];
		for(int i = 0;i < n;i++)map[i] = readString(m);
		return map;
	}
	
	private static int[] readNumArray(int n)
	{
		int[] a = new int[n];
		for(int i = 0;i < n;i++)a[i] = readInt();
		return a;
	}
	
	private static int readInt()
	{
		int num = 0, b;
		boolean minus = false;
		while((b = read()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = read();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = read();
		}
	}
	
	private static long readLong()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while((b = read()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = read();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = read();
		}
	}
	
	private static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}