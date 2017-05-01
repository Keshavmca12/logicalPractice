package C;

public class Class {
Class c =new Class();
public static void main(String[] args) {
	//B b=new B();
	B b=null;
	//Integer i = new Integer(1);
	 
   String s = new String("");
 //  System.out.println(null);
	 b.staticMethod();
}

}
class B{
	Class c=new Class();
	static void staticMethod()
    {
        System.out.println("Static Method");
    }
}
