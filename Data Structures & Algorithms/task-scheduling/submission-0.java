class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer>h=new HashMap<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]>q=new LinkedList<>();
        
        for(char x : tasks){
            h.put(x,h.getOrDefault(x,0)+1);
        }


        for (Map.Entry<Character,Integer> entry : h.entrySet()) {
            pq.add(entry.getValue());
        }

        int time = 0;

        while(!pq.isEmpty() || !q.isEmpty()) {
            time++;

            if(pq.isEmpty()){
                time=q.peek()[1];
            } else {
                int cnt = pq.poll()-1;
                if(cnt>0){
                    q.add(new int[]{cnt,time+n});
                }
            }

            if(!q.isEmpty() && q.peek()[1]==time){
                pq.add(q.poll()[0]);
            }
        }

        return time;

    }
}

