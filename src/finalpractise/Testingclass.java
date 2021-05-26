package finalpractise;

import java.util.ArrayList;
import java.util.List;

public class Testingclass {
	
	public static void main(String[] args) {
		
		
		Sampleday x= new Sampleday();
		x.setCollegeid(126655);
		x.setCollegename("satymabama");
		x.setCollegecity("chennai");
		;
		List<Sampleday> x1=new ArrayList<Sampleday>();
		x1.add(x);
		
		for (int i = 0; i < x1.size(); i++) {
			
			int collegeid = x1.get(i).getCollegeid();
			String collegename = x1.get(i).getCollegename();
			String collegecity = x1.get(i).getCollegecity();
			
			System.out.println(collegeid);
			System.out.println(collegename);
			
			System.out.println(collegecity);
		}
	
		
		
	}
}
