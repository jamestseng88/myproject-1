package myproject;

import java.util.Random;
import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int enter = scanner.nextInt();
		int secret = random.nextInt(10) + 1;
	
		System.out.println(secret);
		while (true)
			System.out.println();
		
		

	}
}