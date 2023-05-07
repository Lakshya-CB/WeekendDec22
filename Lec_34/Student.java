package Lec_34;

public class Student {
	int Age;
	String Name;
	static int total_st=9999;

	public Student() {
		// TODO Auto-generated constructor stub
		total_st++;
	}
	public static int getTot() {
		
		return total_st;
	}
}
