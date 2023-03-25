package Lec_21;

public class Climb_Stairs {
	public static void main(String[] args) {
		
	}
	public static void suvle(int curr, int dest,String path) {
		
//		BP : 0 , 4
//		SP :
		if(curr==dest) { // +ve BC
			System.out.println(path);
			return;
		}
		
		if(curr > dest) { // -ve BC
			return;
		}
		suvle(curr+1, dest, path+"1");
		suvle(curr+2, dest, path+"2");
		suvle(curr+3, dest, path+"3");
		
	}
}
