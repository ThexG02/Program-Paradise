public class MATRIX_TRAVERSAL {

    //ROW WISE TRAVERSAL IN A MATRIX
    public static void rowwisetraversal(int[][] nums){
    for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[i].length;j++){
            System.out.print(nums[i][j]);
        }
        System.out.println();
    }
}


//COLOUMN WISE TRAVERSAL IN A MATRIX
public static void coloumnwisetraversal(int[][] nums){
    int row=nums.length;
    int col=nums[0].length;
    for(int i=0;i<col;i++){
        for(int j=0;j<row;j++){
System.out.print(nums[j][i]);
        }
        System.out.println();
    }
}

// SPRIRAL ORDER TRAVERSAL IN A MATRIX
    public static void spiralmatrix(int[][] nums){
        int startrow =0;
        int endrow= nums.length-1;
        int startcol=0;
        int endcol=nums[0].length-1;
        while((startrow<=endrow) && (startcol<=endcol) ){
            //top
            for(int j=startcol;j<=endcol;j++){
                System.out.print(nums[startrow][j]);
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(nums[i][endcol]);
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                System.out.print(nums[endrow][j]);
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--){
                System.out.print(nums[i][startcol]);
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }

    }
    public static void main(String[] args) {
        int nums[][] = {
            {1,2,3},
            {8,9,4},
            {7,6,5}};
        //rowwisetraversal(nums);
        //coloumnwisetraversal(nums);
        spiralmatrix(nums);
        }
    
}

