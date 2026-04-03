class Solution {
    private class Container{
         int r;
         int c;
         int d;
        public Container(int dis,int i,int j){
            r=i;
            c=j;
            d=dis;
        }
        int getD(){
            return d;
        }
        int getR(){
            return r;
        }
        int getC(){
            return c;
        }
    }
    private static int[][] dir = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public void islandsAndTreasure(int[][] grid) {
        PriorityQueue<Container> q = new PriorityQueue<>(Comparator.comparingInt(c -> c.getD()));
        int[][] vis = new int[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]==0){
                    q.add(new Container(0,i,j));
                    vis[i][j]=1;
                }
            }
        }
        
        while(q.size()>0){
            Container curr = q.peek();
            q.poll();

            for(int[] d:dir){
                
                int nr = curr.getR()+d[0];
                int nc = curr.getC()+d[1];
                int nd = curr.getD()+1;
                
                if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]!=-1 && vis[nr][nc]==0){
                    
                    vis[nr][nc]=1;
                    grid[nr][nc]=nd;
                    q.add(new Container(nd,nr,nc));
                }
            }
        }
        
    }
}
