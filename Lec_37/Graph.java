package Lec_37;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
//	HashMap<V1,Nbr> HM;
//	HashMap<V1,HashMap<V2,Wt>> HM;
	HashMap<Integer, HashMap<Integer, Integer>> HM = new HashMap<>();

	public Graph(int n) {
		for (int V = 1; V <= n; V++) {
			HM.put(V, new HashMap());
		}
	}

	public void addEdge(int V1, int V2, int wt) {
		HashMap<Integer, Integer> V1_Nbr = HM.get(V1);
		V1_Nbr.put(V2, wt);
		HashMap<Integer, Integer> V2_Nbr = HM.get(V2);
		V2_Nbr.put(V1, wt);
	}

	public boolean isNbr(int V1, int V2) {
		return HM.get(V1).containsKey(V2);
	}

	public int getEdge(int V1, int V2) {
		return HM.get(V1).get(V2);
	}

	public void removeEdge(int V1, int V2) {
		HashMap<Integer, Integer> V1_Nbr = HM.get(V1);
		V1_Nbr.remove(V2);
		HashMap<Integer, Integer> V2_Nbr = HM.get(V2);
		V2_Nbr.remove(V1);
	}

	public int numOfEdges() {
		int ans = 0;
		for (int V : HM.keySet()) {
			ans = ans + HM.get(V).size();
		}
		return ans / 2;
	}

	private boolean hasPath(int curr, int dest, String path, HashSet<Integer> Visited) {
		if (curr == dest) {
			System.out.println(path + " - " + dest);
			return true;
		}
		boolean ans = false;
		Visited.add(curr);
		for (int nbr : HM.get(curr).keySet()) {
			if (!Visited.contains(nbr)) {
				boolean sp = hasPath(nbr, dest, path + curr + " ", Visited);
				ans = ans || sp;
			}
		}
		Visited.remove(curr);
		return ans;

	}

	public boolean hasPath(int curr, int dest) {
		return hasPath(curr, dest, "", new HashSet<>());
	}

	public void BFS(int src) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(src);
		HashSet<Integer> Visited = new HashSet<>();
		while (!Q.isEmpty()) {
			int V = Q.poll();
			if (Visited.contains(V)) {
				System.out.println("cycle!!");
				continue;
			}
			System.out.println(V);
			Visited.add(V);
			for (int nbr : HM.get(V).keySet()) {
				if (!Visited.contains(nbr)) {
					Q.add(nbr);
				}
			}
		}
	}

	public void BFT() {
		int num_comp=0;
		HashSet<Integer> Visited = new HashSet<>();
		for (int src : HM.keySet()) {
			if (Visited.contains(src)) {
				continue;
			}
			num_comp++;
			Queue<Integer> Q = new LinkedList<>();
			Q.add(src);
			while (!Q.isEmpty()) {
				int V = Q.poll();
				if (Visited.contains(V)) {
					System.out.println("cycle!!");
					continue;
				}
				System.out.println(V);
				Visited.add(V);
				for (int nbr : HM.get(V).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}
			}
		}
		System.out.println(num_comp);
	}
}
