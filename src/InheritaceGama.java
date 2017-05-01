
public class InheritaceGama {
	public static void main(String[] args) {
		//Gamma g1 =  (Gamma) new Alpha();
	//	Gamma g2 = (Gamma) new Beta();
		//Beta b1=(Beta) new Alpha();
		Alpha aaa=new Alpha();
		Beta b2=new Beta();
		 aaa=b2;
		 System.out.println( aaa.getType());
		System.out.println(b2.getType() + " " 
		+ b2.getType());
		Alpha a=new Beta();
		System.out.println("alpha beta  :: "+a.getType());
		Alpha ag = new Gamma();
		
		System.out.println(" alpha gama  ::"+ag.getType());
		}
	
	}
class Alpha {
String getType() { return "alpha"; }
}
class Beta extends Alpha {
String getType() { return "beta"; }
}
class Gamma extends Beta {
//String getType() { return "gamma"; }
}


