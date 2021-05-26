package javaprogramspractise;

import java.util.Scanner;

public class Samplecontrolstatement {

	public static void main(String[] args) {

		// int age = 15;

		// if (age>=18) {
		// System.out.println("person is eligible to vote");

		// } else {

		// System.out.println("person is not eligible to vote");

		// }

		// to print odd or even number
		// Scanner sc = new Scanner(System.in);
		// System.out.println(" enter the number");
		//
		// int x = sc.nextInt();
		//
		// if (x % 2==1) {
		//
		// System.out.println("odd number");
		//
		// } else {
		//
		// System.out.println(" not odd number");
		// }

		// for (int i = 0; i <=100; i=i+3) {

		// System.out.println(i);

		// }

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");

		int x = sc.nextInt();

		int oddsum = 0;

		for (int i = 1; i < x; i++) {

			if (i % 2 == 1) {

				oddsum = oddsum + i;

			}

		}
		System.out.println(oddsum);
	}
}