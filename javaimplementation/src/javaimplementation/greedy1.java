package javaimplementation;

import java.util.*;

public class greedy1 {

	public static void main(String[] args) {
		// activity selection
		int start[] = { 1, 3, 0, 5, 8, 5 };
		int end[] = { 2, 4, 6, 7, 9, 9 };
		int activities[][]=new int [start.length][3];
		for(int i=0;i<end.length;i++) {
			activities[i][0]=i;
			activities[i][1]=start[i];
			activities[i][2]=end[i];
			}
		//sorting 
		Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));
		//1st activity 
		int maxact = 0;
		ArrayList<Integer> ans = new ArrayList<>();
		maxact = 1;
		ans.add(activities[0][0]);
		int lastend = activities[0][2];
		for (int i = 1; i < end.length; i++) {
			if (activities[i][1] >= lastend) {
				maxact++;
				lastend = activities[i][2];
				ans.add(activities[i][0]);
			}
		}
		System.out.println("maximum Activity:" + maxact);
		for (int i = 0; i < ans.size(); i++) {
			System.out.print("A" + ans.get(i) + " ");
		}
		System.out.println();

	}

}
