package javaprogramspractise;

import java.util.Scanner;

public class Countofgivennumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int a = n, i = 0;
		while (a > 0) {
			a = a / 10;
			i++;

		}
		System.out.println(i);
	}

}
