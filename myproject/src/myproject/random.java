package myproject;

import java.util.Random;
import java.util.Scanner;

public class random {
	public static void main(String[] args) {
		Random random = new Random();
		int secret = random.nextInt(100) + 1;
		System.out.println(secret);
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if(x!=secret){
			System.out.println("false");
		
		}else
		System.out.println("ture");
		
	}
}
