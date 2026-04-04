class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<int[]>a=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    a.add(new int[]{i,j});
                }
            }
        }

        for(int[] x: a){
            for(int i=0;i<matrix.length;i++){
                matrix[i][x[1]]=0;
            }
            for(int j=0;j<matrix[0].length;j++){
                matrix[x[0]][j]=0;
            }
        }
    }
}
