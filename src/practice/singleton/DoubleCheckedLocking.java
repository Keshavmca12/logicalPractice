package practice.singleton;

import java.io.Serializable;

public class DoubleCheckedLocking implements Serializable {
	private static volatile DoubleCheckedLocking dcl=null;
	private DoubleCheckedLocking() {
		// TODO Auto-generated constructor stub
	}

	public static DoubleCheckedLocking getInstance(){
		if(dcl==null){
			synchronized (DoubleCheckedLocking.class) {
				if(dcl==null){
					dcl=new DoubleCheckedLocking();
				}
			}
		}
		return dcl;
	}
	protected Object readResolve() {
		return dcl;
	}

	public static void main(String[] args) {
		DoubleCheckedLocking dcl1=getInstance();
		DoubleCheckedLocking dcl2=getInstance();
		System.out.println("dcl1  ::"+dcl1);
		System.out.println("dcl2  ::"+dcl2);
		boolean flag=dcl1==dcl2;
		System.out.println("flag :: "+flag);
	}


}
