package javaimplementation;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;

public class arraylistimp {

    // program to create an arraylist
    public static ArrayList<Integer> arrlst(int n){
        int i=0;
        ArrayList<Integer> arr= new ArrayList<>();
        while(i<=n){
            arr.add(i);
            i++;
        }
        return arr;
        }
    
        // program to find the maximum element from an array list
    public static int arrlstMax(ArrayList<Integer> arr){
        int max= Integer.MIN_VALUE;
        int j=arr.size()-1;
        while(j>=0){
            if(max<arr.get(j)){
                max=arr.get(j);
            }
            j--;
        }
        return max;
    }

    // program to sort an arraylist using java collection framework
    public static void arrlsrt(ArrayList<Integer> arr){
        Collections.sort(arr);

     }
    //program for the implementation of the 2D arraylist
    public static void tdarrl(ArrayList<Integer> arr1 , ArrayList<Integer> arr2){
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        main.add(arr1);
        main.add(arr2);
        System.out.println(main);
        for(int i=0;i<main.size();i++){
            ArrayList<Integer> curArrayList= main.get(i);
            for(int j=0;j<curArrayList.size();j++){
                System.out.print(curArrayList.get(j));
            }
            System.out.println();
        }
    } 
    //program to find the container with the most water
    /*
     for given n lines on x axis , use 2 lines to form a container 
     such that it holds the maximum water
    input array of height{1,8,6,2,5,4,8,3,7}
     */
    public static int CWMW(ArrayList<Integer> hiegth){
        int maxwater=0;
        int lp=0;
        int rp= hiegth.size()-1;
        while(lp<rp){
            int w=rp-lp;
            int h =Math.min(hiegth.get(lp), hiegth.get(rp));
            int currwater=w*h;
            maxwater=Math.max(maxwater, currwater);
            if(hiegth.get(lp)<hiegth.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
       return maxwater;
    }

    // program FOR the PAIR SUM 1 : to find if any pair in a sorted arraylist has a target sum
    public static  boolean Psum1(ArrayList<Integer> nums , int target){
        int lp=0;
        int rp =nums.size()-1;
        while(lp<rp){
            int currsum =nums.get(rp)+nums.get(lp);
            if(target==currsum){
                return true;
            }
            else if(currsum<target){
            lp++;}
            else{
            rp--;}
        }
        return false;
    }

    // program for PAIR SUM 2 : find if any pair in a sorted & rotated arraylist has a target sum
    /*
     1.to find the pivot point
     2.use two pointer approach to find the target
     3.to moduleo arithematic for pointer updation
     */
    public static boolean Psum2(ArrayList<Integer> nums , int target){
        int bp=-1;
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)>nums.get(i+1)){
                bp=i  ; //pivot point
            }
        }
        int lp =bp+1;
        int rp=bp;
        while(lp!=bp){
           int currsum = nums.get(rp)+nums.get(lp);
            if(currsum==target){
                return true;
            }
            else if(currsum<target){
                lp=(lp+1)%nums.size();
            }
            else
            {
                rp= (rp+nums.size()-1)%nums.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
    //System.out.println(arrlst(5));
    ArrayList<Integer> arrl = new ArrayList<>();
    ArrayList<Integer> arrl2 = new ArrayList<>();
    arrl.add(1);
    arrl.add(5);
    arrl.add(3);
    arrl.add(4);
    arrl2.add(5);
    arrl2.add(6);
    arrl2.add(7);
    arrl2.add(8);
    ArrayList<Integer> height= new ArrayList<>();
    Collections.addAll(height, 1,8,6,2,5,4,8,3,7);
    //System.out.println(CWMW(height));
    // System.out.println(arrlstMax(arrl));
    // System.out.println(arrl);
    // arrlsrt(arrl);
    // System.out.println(arrl);
    //tdarrl(arrl, arrl2);
    System.out.println(Psum2(arrl, 85));
    }
    }

