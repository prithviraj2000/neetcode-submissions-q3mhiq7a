class Solution {
    private class Pair{
        int val;
        int idx;
        Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        void setVal(int val){
            this.val=val;
        }
        void setIdx(int idx){
            this.idx=idx;
        }
        int getVal(){
            return val;
        }
        int getIdx(){
            return idx;
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.getVal()-a.getVal());
        int i=0,j=0,x=0;
        int[] ans = new int[nums.length-k+1];
        while(j<nums.length){
            pq.add(new Pair(nums[j],j));
            if(pq.size()>=k){
                while(j-pq.peek().getIdx()>=k){
                    pq.poll();
                }
                ans[x++]=pq.peek().getVal();
            }
            j++;
        }
        return ans;


    }
}
