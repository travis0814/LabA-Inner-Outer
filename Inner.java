class Outer{
	int a = 4;
	
	class Inside{
		int b = 6;
	}
	
}
public class Inner {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inside i = o.new Inside();
		  System.out.println(o.a + " " + i.b);
		
		

	}
     
}    
