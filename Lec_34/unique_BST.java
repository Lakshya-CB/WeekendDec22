package Lec_34;

public class unique_BST {
	public int numTrees(int n) {
        return solve(1,n);
    }
    public int solve(int s, int e){
        if(s>=e){
            return 1;
        }
        int ans = 0;
        for(int r =s;r<=e;r++){
            int L = solve(s,r-1);
            int R = solve(r+1,e);
            ans = ans + L*R;
        }
        return ans;
    }
}
