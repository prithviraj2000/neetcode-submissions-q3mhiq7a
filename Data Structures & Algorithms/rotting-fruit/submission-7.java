class Solution {
    int[][] directions = new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
    public int orangesRotting(int[][] grid) {
        int fresh =0;
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]>q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    fresh++;
                } else if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        int minutes = 0;
        while(fresh>0 && q.size()>0){
            int length = q.size();
            for (int i = 0; i < length; i++) {
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];
                for (int[] dir : directions) {
                    int row = r + dir[0];
                    int col = c + dir[1];
                    if (row >= 0 && row < grid.length &&
                        col >= 0 && col < grid[0].length &&
                        grid[row][col] == 1) {
                        grid[row][col] = 2;
                        q.offer(new int[]{row, col});
                        fresh--;
                    }
                }
            }  
            minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }
}
