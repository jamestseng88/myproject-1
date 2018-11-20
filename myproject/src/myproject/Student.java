package myproject;

public class Student {
	String name;
	int english;
	int math;

	public Student(String name, int english, int math) {
		this.name = name;
		this.english = english;
		this.math = math;
	}

	public void print() {

		System.out.println(name + "\t" + english + "\t" + math + "\t" + highest() + "\t");
		System.out.println(getAverage());
		if (getAverage() < 60) {
			System.out.println("FAILED");
		} else {
			System.out.println("PASS");
		}
	}

	public int getAverage() {
		return (english + math) / 2 ;
	}
	public int highest() {
		if (english > math) {
			return english;

		} else {
			return math;
		}

	}
}
