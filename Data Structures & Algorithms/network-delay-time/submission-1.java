class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>>adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] t : times){
            adj.get(t[0]).add(new int[]{t[1],t[2]});
        }

        int dis[] = new int[n+1];
        for(int i=0;i<=n;i++){
            dis[i]=Integer.MAX_VALUE;
        }
        dis[k]=0;

        Queue<int[]>q= new LinkedList<>();
        q.add(new int[]{k,0});
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int node = curr[0], time = curr[1];
            if (dis[node] < time) {
                continue;
            }
            for (int[] nei : adj.get(node)) {
                int nextNode = nei[0], weight = nei[1];
                if (time + weight < dis[nextNode]) {
                    dis[nextNode]= time + weight;
                    q.offer(new int[] {nextNode, time + weight});
                }
            }
        }
        int res =Integer.MIN_VALUE;
        for(int i=1;i<dis.length;i++){
            res = Math.max(res,dis[i]);
        }
        
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
