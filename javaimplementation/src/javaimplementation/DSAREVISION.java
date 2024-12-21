package javaimplementation;

import java.util.*;

public class DSAREVISION {

    // ARRAys :

    // TWO POINTERS
    // public static void arrayRev(int[] arr) {

    //     for (int x : arr) {
    //         System.out.print(x);
    //     }
    //     System.out.println();

    //     int lp = 0;
    //     int rp = arr.length - 1;
    //     while (lp <= rp) {
    //         int temp = arr[lp];
    //         arr[lp] = arr[rp];
    //         arr[rp] = temp;
    //         lp++;
    //         rp--;
    //     }
    //     for (int x : arr) {
    //         System.out.print(x);
    //     }
    // }

    // Binary search : only for sorted array

    // public static boolean Bsearch(int[] arr, int target) {
    //     int si = 0;
    //     int ei = arr.length - 1;
    //     int mid;
    //     while (si <= ei) {
    //         mid = si + ((ei - si) / 2);
    //         if (arr[mid] == target) {
    //             return true;
    //         }
    //         else if (arr[mid]>target){
    //             ei=mid-1;
    //         }
    //         else{
    //             si=mid+1;
    //         }
    //     }
    //     return false;
    // }


    //DIVIDE AND CONQURE
    //merge sort

    // public static void mergsrt(int[] arr, int si , int ei){
      
    //     if(si>=ei){
    //         return;
    //     }
    //     int mid =si+((ei-si)/2);
    //     mergsrt(arr, si, mid);// left portion
    //     mergsrt(arr, mid+1, ei);// right portion
    //     mergemain(arr, mid, si, ei);

        
    // }

    // public static int[] mergemain(int[]arr , int mid , int si , int ei){
    //     int i=si;
    //     int j=mid+1;
    //     int k =0;
    //     int temp[]=new int[ei-si+1];
    //     while(i<=mid && j<=ei){
    //         if(arr[i]<arr[j]){
    //             temp[k]=arr[i];
    //             i++;k++;
    //         }
    //         else if(arr[i]>arr[j]){
    //             temp[k]=arr[j];
    //             k++;j++;
    //         }
    //     }
    //     while(i<=mid){
    //         temp[k++]=arr[i++];
    //     }
    //     while(j<=ei){
    //         temp[k++]=arr[j++];
    //     }
    //     for(k=0,i=si;k<temp.length;k++,i++){
    //         arr[i]=temp[k];
    //     }
    //     return arr;
        
        
    // }

    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    public static class BuildTree{
        static int idx =-1;
        public static Node builBtree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;

            }
            Node nn = new Node(nodes[idx]);
            nn.left=builBtree(nodes);
            nn.right=builBtree(nodes);
            return nn;
        }

    }


    
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5 };
        // int arr2[]={6,5,3,2,41,1};
        // mergsrt(arr2, 0, 5);
        // for (int x : arr2) {
        //     System.out.print(x);
        // }

        //arrayRev(arr);
        //System.out.println(Bsearch(arr, 37));
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BuildTree tree = new BuildTree();
       Node root = tree.builBtree(arr);
        System.out.println(root.data);
    }

}
