package myproject;

import java.util.Scanner;

public class Math {

	public static void main(String[] args) {
		int x = 5 / 3;
		int y = 5 % 3;
		System.out.println(x);
		System.out.println(y);
		float z = 5.36745f;
		float n = 9.354678978f;
		String name1 = "james";
		System.out.printf("I want %.3f and %.2f  \n%s\n", z, n, name1);
		System.out.println("Celsius:");
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextDouble();
		System.out.println(c * (9 / 5.0) + 32 + "f");

	}

}
