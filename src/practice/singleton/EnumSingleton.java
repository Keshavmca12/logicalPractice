package practice.singleton;

 enum Test {
	INSTANCE;
	public static int i=5;
	public static void main(String[] args) {
		System.out.println("instace"+Test.INSTANCE);
		
	}

}

 public class EnumSingleton {
	public static void main(String[] args) {
		Test se=Test.INSTANCE;
		System.out.println(se.i);
	}
}
