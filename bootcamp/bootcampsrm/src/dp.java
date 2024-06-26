public class dp {
    //dp is mainly implemented for the multivalued data
    /*
     1.memoization : storing the things || recurrsion + data structure || applicable in most of the problems
     2.tabulation : loop + data structure
     3.space optimized: not apllicable in most of the problems
     */
//fibonacci sereis using recurssion
public static int fibrec(int n){
    if(n==0 || n==1){
        return n;
    }
    return fibrec(n-1) + fibrec(n-2);
}

// fibonacci series using DP (memoisation) O(n)
public static int fibmemo(int n , int[] dp){
    if(n==0||n==1){
        
        return n;
    }
    if(dp[n]!=0){
        return dp[n];
    }
    dp[n]= fibmemo(n-1, dp)+fibmemo(n-2, dp);
    return dp[n];
}

// fibonacci series using DP(tabulation) O(n)
public static int fibtabu(int n , int[] dp){
    dp[0]=0;
    dp[1]=1;
    for(int i =2; i<n+1;i++){
        dp[i]=dp[i-1]+dp[i-2];

    }
    return dp[n];
}

// fibonacci series using DP (space optimized)
public static void fibso(int n){
    int f=0;
    int s=1;
    int t= 0;
    for(int i=2;i<n+1;i++){
   
    System.out.print(f+" "+s+" "+t);
    t=f+s;
    System.out.println();

    s=t;
    f=s;
}

}
public static void main(String[] args) {
   // System.out.println(fibrec(5));
    int n=5;
    int[] dp = new int[n+1];
   // System.out.println(fibmemo(n, dp));
   //System.out.println(fibtabu(n, dp));
   fibso(n) ;
}
}
