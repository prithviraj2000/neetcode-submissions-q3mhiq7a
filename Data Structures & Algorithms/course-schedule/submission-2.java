class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] p : prerequisites){
            adj.get(p[1]).add(p[0]);
        }

        
        int[] indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }

        

        Queue<Integer>q = new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        ArrayList<Integer> topo = new ArrayList<>();
        
        while(!q.isEmpty()){
            int node = q.poll();
            topo.add(node);
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        System.out.print(topo.size());
        if(topo.size()==numCourses)return true;
        return false;
    }
}
