package Lec_27;

public class client_1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		
//		s1.age = -10;
		System.out.println(s1.getAge());
		try {
			s1.setAge(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s1.Intro();
		s1.setAge(1000);
		System.out.println("azaad");
	}
}
