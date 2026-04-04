class Solution {
    private static int[][]dir = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    void dfs(char[][] board,int[][] reachable,int i,int j){
        reachable[i][j]=1;
        for(int []d:dir){
            int nr = i+d[0];
            int nc = j+d[1];
            if(nr>=0&&nr<board.length&&nc>=0&&nc<board[0].length&&board[nr][nc]=='O'&& reachable[nr][nc]==0){
                dfs(board,reachable,nr,nc);
            }
        }
    }
    public void solve(char[][] board) {
        int[][] reachable = new int[board.length][board[0].length];

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if((i==0 || j==0 ||i==board.length-1||j==board[0].length-1) &&board[i][j]=='O'){
                    dfs(board,reachable,i,j);
                }
            }
        }
        for(int i=0;i<reachable.length;i++){
            for(int j=0;j<reachable[0].length;j++){
                if(reachable[i][j]==0 && (i!=0 || i!=reachable.length-1||j!=0 || j!=reachable[0].length-1)){
                    board[i][j]='X';
                }
            }
        }
    }
}
