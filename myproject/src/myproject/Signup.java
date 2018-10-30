package myproject;

import java.util.Scanner;

public class Signup {

	public static void main(String[] args) {
		System.out.println("Are you 18 ? Y/N");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println(line);
		boolean adult = line.equalsIgnoreCase("Y");
		System.out.println(adult);
		if (adult) {
			System.out.print("What your age ?");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("What your name ?");
			String name = scanner.nextLine();
			System.out.print("What your nick name ?");
			String nickname = scanner.nextLine();
			System.out.print(age + "/" + name + "/" + nickname);

		} else {
			System.out.print("xxxxxxx,bye");
		}
	}
}