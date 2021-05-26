package finalpractise;

public class Partialabstraction extends Abstraction {

	@Override
	public void hdfcbank() {
System.out.println("hdfc bank");		
	}

	@Override
	public void sbibank() {
System.out.println("sbi bank");		
	}
	
	
	public  void citibank() {
System.out.println("cutibank");
	}
	
	public static void main(String[] args) {
		
		
		Partialabstraction x= new Partialabstraction();
		x.axisbank();
		x.citibank();
		x.hdfcbank();
		x.sbibank();
		
	}

}
