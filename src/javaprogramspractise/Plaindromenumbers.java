package javaprogramspractise;

public class Plaindromenumbers {
	public static void main(String[] args) {
		for (int n = 1; n <=100; n++) {
			int a=n,i=0,j=0;
			while (a>0) {
				i=a%10;
				j=(j*10)+i;
				a=a/10;
				
			}
			
			if (n==j) {
				System.out.println(n);
				
			}
		}
	}

}
