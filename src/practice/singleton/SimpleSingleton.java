package practice.singleton;

public class SimpleSingleton {

	
	public static void main(String[] args) {
		SimpleSingle ss1=SimpleSingle.getInstance();
		SimpleSingle ss2=SimpleSingle.getInstance();
		System.out.println(" ss1 :"+ss1);
		System.out.println(" ss2 :"+ss2);
		boolean flag=ss1==ss2;
		
		System.out.println("flag  ::"+flag);
	}
}


class SimpleSingle{
	
	private static SimpleSingle ss=null;
	private SimpleSingle() {
		// TODO Auto-generated constructor stub
	}
	public static SimpleSingle getInstance(){
		if(ss==null){
			ss=new SimpleSingle();
		}
		return ss;
	}
	
}
