class Solution {
    class Link{
        int to;
        int fee;
        Link(int to,int fee){
            this.to=to;
            this.fee=fee;
        }
        int getFee(){
            return fee;
        }
        int getTo(){
            return to;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Link>>adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Link>());
        }

        for(int[]f:flights){
            adj.get(f[0]).add(new Link(f[1],f[2]));
        }
        

        int dis[] = new int[n];
        for(int i=0;i<n;i++){
            dis[i]=Integer.MAX_VALUE;
        }
        dis[src]=0;
        Queue<int[]>q= new LinkedList<>();
        q.add(new int[]{0,src,0});
        while(!q.isEmpty()){
            int[] top = q.poll();
            int currNode = top[1];
            int fee = top[2];
            int stops = top[0];

            if(stops>k){
                continue;
            }

            for(Link l : adj.get(currNode)){
                if(fee+l.getFee()<=dis[l.getTo()] && stops<=k){
                    dis[l.getTo()]=fee+l.getFee();
                    q.add(new int[]{stops+1,l.getTo(),dis[l.getTo()]});
                }
            }
        }

        if(dis[dst]==Integer.MAX_VALUE)return -1;
        return dis[dst];
    }
}
