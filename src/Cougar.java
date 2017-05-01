class Feline {
	public String type = "f ";
	public String test = "accessible";

	public Feline() {
		System.out.print("feline ");
	}

	public void display() {
		System.out.println("parentFunc");
	}
}

public class Cougar extends Feline {
	public Cougar() {
		System.out.print("cougar ");
	}
	public void display(){
		System.out.println("childFunc");
		super.display();
	}

	/*static	public  void main(String[] args) {

		new Cougar().go();
		new Cougar().display();
		main("");
	}*/
	
	   public static void main(String[] args) {
	        String out = "Some ungodly gibberish";
	        //char x = \u000a; out = out + " and then some more. ";
	        System.out.println(out);
	    }
	
	static	public  void main(String args) {

		new Cougar().go();
		new Cougar().display();
	}

	void go() {
		type = "c ";
		test = "changedEveryWhere";
		System.out.print(this.type + super.type);
		System.out.println(super.test + this.test);
	}
}
