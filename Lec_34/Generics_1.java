package Lec_34;

import java.util.Comparator;

public class Generics_1 {
	static class Student implements Comparable<Student> {
		public Student(String s, int i) {
			// TODO Auto-generated constructor stub
			Name = s;
			Age = i;
		}

		int Age;
		String Name;

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "{" + Name + "," + Age + "}";
		}

		@Override
		public int compareTo(Student o) {
//			A.compareTo(B)
//		this = A
//		o = B;
			return this.Age - o.Age;
		}
	}

	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student("A", 2);
		arr[1] = new Student("Ba", 1);
		arr[2] = new Student("zC", 10);
		arr[3] = new Student("xD", -1);
		arr[4] = new Student("aE", 4);

		print(arr);
		sort(arr, new comAge());
		print(arr);

	}

//	public static void print(Object[] arr) {
//		for(Object s: arr) {
//			System.out.println(s);
//		}
//	}
	public static <oo> void print(oo[] arr) {
		for (oo s : arr) {
			System.out.print(s);
		}
		System.out.println();
	}

	public static <pui extends Comparable<pui>> void sort(pui[] arr) {

		for (int count = 1; count < arr.length; count++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					pui temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

	static class com implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.Name.compareTo(o2.Name);
		}

	}

	static class comAge implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.Age - o2.Age;
		}

	}

	static class comUlta implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return -o1.Age + o2.Age;
		}

	}

	public static <pui> void sort(pui[] arr, Comparator<pui> ccc) {
		for (int count = 1; count < arr.length; count++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (ccc.compare(arr[i], arr[i + 1]) > 0) {
					pui temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
}
