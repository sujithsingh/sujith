package javaprogramspractise;

import java.util.Scanner;

public class Factorialnumbers {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int x=1;
		for (int i = 1; i <=n; i++) {
			x=x*i;
			
		}
		System.out.println(x);
	}

}
