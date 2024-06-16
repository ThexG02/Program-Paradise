public class TWO_POINTER {
    public static boolean pairwithsum(int nums[],int target){
        int s=0;
        int e= nums.length-1;
        while(s<=e){
            int sum =nums[s]+nums[e];
            if(sum==target){
                return true;
            }
            else if(sum<target){
                s++;
            }
            else{
                e--;
            }
            
        }
        return false;
    }
public static void main(String[] args) {
    int nums[]= {1,2,3,4,5};
    System.out.println(pairwithsum(nums, 97));
}
}
