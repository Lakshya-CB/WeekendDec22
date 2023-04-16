package Lec_27;

public class Student {
	// data parsing!!
	private int age = 10;
	String Name = "kon hein tu?";

	Student(String Name, int age) {
//		this.
		this.Name = Name;
		this.age = age;
	}

	Student() {

	}

	public void Intro() {
		System.out.println(Name + "-" + age);
	}

	public void party(String Name) {
		System.out.println(this.Name + " with " + Name);
	}

	public int getAge() {

		return age;
	}

	public void setAge(int a) throws Exception {
		if (a < 0) {
//			throw new RuntimeException("kya kar hein?!");// unchecked!!
			throw new Exception("kya bhai!!?");
		}
		age = a;
		return;
	}
}
