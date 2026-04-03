class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
            int i=0;
            for(int j=matrix[0].length-1;j>=0 && i<matrix.length;){
                System.out.println(matrix[i][j]);
                if(matrix[i][j]>target){
                    j--;
                } else if(matrix[i][j]<target){
                    i++;
                }
                else{
                    return true;
                }
            }
        
        return false;

    }
}
