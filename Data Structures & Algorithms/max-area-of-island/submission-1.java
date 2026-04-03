class Solution {
    private int[][] dir = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
   
    int solve(int[][] grid,int[][] vis,int m,int n,int i,int j){
         vis[i][j]=1;
        int area=1;
        for(int[] d: dir) {
            int r = i+d[0];
            int c = j+d[1];

            if(r>=0 && r<n && c>=0 && c<m && grid[r][c]==1 && vis[r][c]==0){
                
                area+=solve(grid,vis,m,n,r,c);
            }
        }
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];

        int ans =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                 
                    ans=Math.max(ans,solve(grid,vis,m,n,i,j));
                }
                
            }
        }
        return ans;
    }
}
