package myproject;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello world");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your name");
		String name=scanner.nextLine();
		System.out .println(name);
		

		/*int age = 19;
		float weight = 86.4f;
		float height = 1.8f;
		String name = "james tseng";
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("weight:" + weight);
		System.out.println("height:" + height);
		float bmi = weight / (height * height);
		System.out.println("bmi:" + bmi);*/
        Person p = new Person(86.4f,1.8f);
        System.out.println(p.bmi());
    Student stu =new Student("Hank",70,90);
    stu.name="Hank";
    stu.english= 70;
    stu.math=90;
    stu.print();
    System.out.println(3<=5);
	}

}
