package javaprogramspractise;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numnber");
		int n=sc.nextInt();
		int a, i=0,j=0;
		a=n;
		while (a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
			
		}
		System.out.println(j);
		
		if (n==j) {
			System.out.println("it is palindrome");
		} else {
			System.out.println(" it is not palindrome");
		}
		
	}


}
