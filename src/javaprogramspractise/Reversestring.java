package javaprogramspractise;

public class Reversestring {
	
	public static void main(String[] args) {
		
		String s="kerala";
		
		String v="";
		
		int length = s.length();
		
		for (int i = length-1; i >=0; i--) {
			
			v=v+s.charAt(i);
			System.out.println(v);
			
			
			
			
			
		}
		

		
	}

}
