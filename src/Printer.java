
public class Printer <T> {
	
	T thingToPrint;
	
	public Printer(T thingToPrint) {
		
		this.thingToPrint = thingToPrint;
	}
	
	public void display() {
		System.out.println(thingToPrint);
	}
	

}
