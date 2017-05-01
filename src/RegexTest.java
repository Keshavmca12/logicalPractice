import java.util.regex.Pattern;


public class RegexTest {
 public static void main(String[] args) {
	 boolean flag=Pattern.matches("^(?!.*=).*$+", "ke,'shav");
	 boolean flag1=Pattern.matches("^[^=']*$", "dfds");
	System.out.println("flag1 :: "+flag1);
}
}
