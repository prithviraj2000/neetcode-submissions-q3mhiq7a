class Solution {
     private class Pair{
        int r;
        int c;
        int t;
        public Pair(int i,int j,int time){
            r=i;
            c=j;
            t=time;
        }
        int getR(){
            return r;
        }
        int getC(){
            return c;
        }
        int getT(){
            return t;
        }
    }
    private static int[][] dir = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new ArrayDeque<>();
        int n =grid.length;
        int m =grid[0].length;
        int[][] vis = new int[n][m];
        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=1;
                } else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int ans = 0;
        while(q.size()>0){
            Pair curr = q.peek();
            int t  = curr.getT();
           
            q.poll();
            int flag=0;
            for(int[] d:dir){
                int nr = curr.getR()+d[0];
                int nc = curr.getC()+d[1];

                if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0 && grid[nr][nc]==1){
                    flag=1;
                    fresh--;
                    vis[nr][nc]=1;
                    grid[nr][nc]=2;
                    q.add(new Pair(nr,nc,t+1));
                }
            }
            if(flag==1){
                ans = Math.max(ans,t+1);
            }
        }
        if(fresh>0){
            return -1;
        }
        return ans==0?0:ans;
        
    }
}
