
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		IntegerPrinter ip = new IntegerPrinter(67);
//		ip.display();
//		
//		StringPrinter sp = new StringPrinter("hello");
//		sp.display();
		
		Printer<Integer> p = new Printer<>(23);
		p.display();
		
		Printer<String> p1= new Printer<>("hello");
		p1.display();
	}
	

}
