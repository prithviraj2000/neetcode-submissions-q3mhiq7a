class KthLargest {
    PriorityQueue<Integer>pq = new PriorityQueue<>();
    int t;
    public KthLargest(int k, int[] nums) {
        t=k;
        for(int n:nums){
            pq.add(n);
            if(pq.size()>k){
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if (pq.size() > t) {
            pq.poll();
        }
        return pq.peek();
    }
}
