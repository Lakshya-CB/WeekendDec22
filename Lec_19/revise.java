package Lec_19;

public class revise {
	public static void main(String[] args) {
//		PD(4,1);
//		PI(1, 4);
//		Pat(3);
		ER(4, 4);
	}
	public static void PD(int e, int s) {
		if(e<s) {
			return;
		}
//		BP :PD(5,1) (e,s)
//		SP :PD(5,2) (e,s+1)
		PD(e,s+1);
		System.out.println(s);
	}
	
	public static void PI(int s, int e) {
		if(s>e) {
			return;
		}
//		BP : (s,e)
//		self 
		int mid = (s+e)/2;
		PI(s, mid-1);
		System.out.println(mid);
		PI(mid+1,e);
	}
	public static void PID(int s, int e) {
		if(s>e) {
			return;
		}
//		BP : PID(1,4,1);
//		SP : PID(2,4,2)
		System.out.println(s);
		PID(s+1,e);
		System.out.println(s);
	}
	public static void Pat(int n) {
		if(n==0) {
			return;
		}
		Pat(n-1);
		for(int i=1;i<=n;i++) {
			System.out.print("-");
		}
		System.out.println();
		Pat(n-1);
	}
	public static void ER(int major,int len) {
		for(int i=0;i<len;i++) {
			for(int cnt =1;cnt<=major;cnt++) {
				System.out.print("-");
			}
			System.out.println(i);
			Pat(major-1);
		}
		for(int cnt =1;cnt<=major;cnt++) {
			System.out.print("-");
		}
		System.out.println(len);
	}
	
}
