package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * problem statement: they have given some activities with start time and end time of each activity 
 * and constraint is that we only do one activity at a time without overlapping activities, 
 * so we have to find a way to do maximum activity.
 * 
 * Algorithm :
 * Step 1: sort activities according to end time of activities
 * step 2: take first activity 
 * step 3: if next activity start time greater than the current activity end time then choose this next activity
 *         else 
 *         skip next activity; 
 * step 4: repeat step 3 till the end of all activity.
 * */


public class ActivitySelectionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size = ");
		int n = sc.nextInt();
		ArrayList<StartAndEnd> al = new ArrayList<StartAndEnd>();
		for(int i = 0; i < n; i++) {
			StartAndEnd st = new StartAndEnd();
			System.out.print("Enter start time = ");
			st.start = sc.nextInt();
			System.out.print("Enter end time = ");
			st.end = sc.nextInt();
			al.add(st);
		}
		int maxActivity = getMaxActivity(al);
		System.out.println("Max possible activity are = "+maxActivity);
		sc.close();
	}

	private static int getMaxActivity(ArrayList<StartAndEnd> al) {
		Collections.sort(al, new MyComparator());
		int selectedActivity = 1;
		int preChoosenActEndTime = al.get(0).end;
		System.out.println(al.get(0).toString());
		for(int i = 1; i < al.size(); i++) {
			if(preChoosenActEndTime < al.get(i).start) {
				selectedActivity++;
				preChoosenActEndTime = al.get(i).end;
				System.out.println(al.get(i).toString());
			}
		}
		return selectedActivity;
	}

}

//below classes are use for sorting purpose 
class StartAndEnd { //this class is use for creating an array of time
	int start;
	@Override
	public String toString() {
		return "StartAndEnd [start=" + start + ", end=" + end + "]";
	}
	int end;
}

class MyComparator implements Comparator<StartAndEnd> {

	@Override
	public int compare(StartAndEnd arg0, StartAndEnd arg1) {
		// TODO Auto-generated method stub
		if(arg0.end ==  arg1.end)
			return 0;
		else if(arg0.end > arg1.end)
			return 1;
		else
			return -1;
	}
	
}