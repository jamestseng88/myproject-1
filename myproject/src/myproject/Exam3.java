package myproject;

import java.util.Random;
import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int secret = random.nextInt(10) + 1;
		int enter = 0;
		int x = 0;
		System.out.println(secret);
		while (enter != secret && x<=4) {
			System.out.println("Please enter your answer " + x +"/4");
			enter = scanner.nextInt();
			if (enter > secret) {
				System.out.println("lower");
			} else if (enter < secret) {
				System.out.println("higher");

			} else
				System.out.println("Great! The secret number is " + secret);
		}
		x++;
	}
}