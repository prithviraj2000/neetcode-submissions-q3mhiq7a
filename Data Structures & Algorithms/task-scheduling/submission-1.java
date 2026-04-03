class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer>m = new HashMap<>();
        PriorityQueue<Integer>p = new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]>q=new LinkedList<>();

        for(char x:tasks){
            m.put(x,m.getOrDefault(x,0)+1);
        }

        for (Map.Entry<Character,Integer> entry : m.entrySet()) {
            p.add(entry.getValue());
        }

        int time=0;
        while(!p.isEmpty() || !q.isEmpty()){
            time++;

            if(p.isEmpty()){
                time=q.peek()[1];
            } else{
                int count = p.poll()-1;
                if(count>0){
                    q.add(new int[]{count,time+n});
                }
            }

            if(!q.isEmpty() && q.peek()[1]==time){
                p.add(q.peek()[0]);
                q.poll();
            }


        }

        return time;
    }
}
