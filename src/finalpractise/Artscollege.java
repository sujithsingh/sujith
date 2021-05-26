package finalpractise;

public class Artscollege extends Methodoverriding {

	public void bsc() {
		System.out.println("sujith");
	}

	public void bba() {
		System.out.println("babyma");
	}

	@Override
	public void ug() {
		System.out.println("tsc colege");

	}

	@Override
	public void pg() {
		System.out.println("prince coolege");
	}
	
	public static void main(String[] args) {
		
		Artscollege y= new Artscollege();
		y.bba();
		y.bsc();
		y.pg();
		y.ug();
	}
	
}
