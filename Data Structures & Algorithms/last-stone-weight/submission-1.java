class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x:stones){
            pq.add(x);
        }

        while(pq.size()>=2){
            int x = pq.poll();
            int y = pq.poll();
            int z = Math.abs(x-y);
            if(z!=0){
                pq.add(z);
            }
        }
        return pq.size()==0?0:pq.peek();

    }
}
