package Lec_26;

public class Client {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
		s1.Name = "babu";
		s1.Age = 55;
		s1.Intro();

		Student s2 = new Student();
		System.out.println(s2);
		s2.Name = "Raju";
		s2.Age = 25;
		s2.Intro();
		
		s1.party(s2.Name);

//		public void party(String Name) {
//			System.out.println(this.Name+" with "+Name);
//		}
	}
}
