package javaimplementation;
import java.util.*;
public class greedy {
//activity selection / maximum number of meetings in a room / Disjoint set

//Code 1: When the given end time array is sorted 
public static int Actslctsrt(int[]start , int[] end){
    int maxact=0;
    //1st activity 
    maxact=1;
    int lastend=end[0];
   
    for(int i=1;i<end.length;i++){
        if(start[i]>=lastend){
            maxact++;
            lastend=end[i];
        }
    }
    return maxact;
}

//Code2 : When the given end time array is not sorted
public static int Actslct(int[]start, int[] end){
    //sorting of the given arrays
        int[][] activities = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //lambda function : comparator
        Arrays.sort(activities,Comparator.comparingDouble(i->i[2]));
    
    //same as before
    int maxact=0;
    //1st activity 
    maxact=1;
    int lastend=activities[0][2];
   
    for(int i=1;i<end.length;i++){
        if(activities[i][1]>=lastend){
            maxact++;
            lastend=activities[i][2];
        }
    }
    return maxact;

}
public static void main(String[] args) {
    int start[]={1,3,0,5,8,5};
    int end[]={2,4,6,7,9,9};
    int nsrt_start[]={0,1,3,5,5,8};
    int nsrt_end[]={6,2,4,9,7,9};
    System.out.println(Actslctsrt(start, end));
    System.out.println(Actslct(nsrt_start, nsrt_end));
}

}
