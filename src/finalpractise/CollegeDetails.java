package finalpractise;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollegeDetails {
	
	public static void main(String[] args) {
		
		PojoClass x = new PojoClass();
		x.setEmpid(45);
		x.setEmpname("sujith");
		x.setEmpcity("chennai");
		
		PojoClass x1 = new PojoClass();
		x1.setEmpid(46);
		x1.setEmpname("Brindha");
		x1.setEmpcity("Madurai");
		
		ArrayList<PojoClass> li=new ArrayList<PojoClass>();
		
		li.add(x);
		li.add(x1);
		
		for (int i = 0; i < li.size(); i++) {
			
			int empid = li.get(i).getEmpid();
			String empname = li.get(i).getEmpname();
			String empcity = li.get(i).getEmpcity();
			
			System.out.println(empid);
			System.out.println(empname);
			System.out.println(empcity);
			
			
			
		}
		
		Set<PojoClass> ls=new LinkedHashSet<PojoClass>();
		ls.add(x);
		ls.add(x1);
		
		for (PojoClass f : ls) {
			
			System.out.println(f.getEmpid());
			System.out.println(f.getEmpcity());
			System.out.println(f.getEmpname());
			
		}
		
		
		Map<Integer, PojoClass> ly=new  LinkedHashMap<Integer, PojoClass>();
		
		ly.put(1, x);
		ly.put(2, x1);
		Set<Entry<Integer, PojoClass>> r = ly.entrySet();
		
		for (Entry<Integer, PojoClass> s : r) {
			System.out.println(s.getKey());
			System.out.println(s.getValue().getEmpid());
			System.out.println(s.getValue().getEmpname());
			System.out.println(s.getValue().getEmpcity());
			
		}
		
		
		
		{
		}
		
		
	}

}
