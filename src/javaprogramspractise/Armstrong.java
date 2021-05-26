package javaprogramspractise;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = Sc.nextInt();
		int a = n, i = 0, j = 0;
		while (a > 0) {
			i = a % 10;
			j = (i * i * i) + j;
			a = a / 10;

		}
		

		if (n == j) {
			System.out.println("it is armstong");

		} else {
			System.out.println(" it is not armstrong");

		}
	}

}
