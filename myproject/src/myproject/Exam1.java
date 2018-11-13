package myproject;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter number of ticket:");
		int ticket = scanner.nextInt();
		System.out.print("How many round-trip ticket:");
		int rtrip = scanner.nextInt();
		System.out.println("ticket :" + ticket);
		System.out.println("round-trip :" + rtrip);
		System.out.println("total :" + (rtrip * (int) (2000 * 0.9) + (ticket - rtrip) * 1000));
	}

}
