package finalpractise;

public class Fullyabstratcion03 implements Fullyabstraction, Fullyabstraction01 {

	@Override
	public void par1() {
System.out.println("para1");		
	}

	@Override
	public void par2() {
System.out.println("para2");		
	}

	@Override
	public void par3() {
System.out.println("para3");		
	}

	@Override
	public void test1() {
System.out.println("test1");		
	}

	@Override
	public void test2() {
System.out.println("test2");		
	}

	@Override
	public void test3() {
System.out.println("test3");		
	

	}
public static void main(String[] args) {
	
	
	Fullyabstratcion03 x=new Fullyabstratcion03();
	
	x.par1();
	x.par2();
	x.par3();
	x.test1();
	x.test2();
	x.test3();
}
}
