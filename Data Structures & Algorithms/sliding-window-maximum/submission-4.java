class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Pair>pq = new PriorityQueue<>((x,y)->y.getA()-x.getA());
        int i=0,j=0;
        List<Integer>ans = new ArrayList<>();
        while(j<nums.length){
            pq.add(new Pair(nums[j],j));
            
            if(j-i+1==k){
                //System.out.println(j+" "+i+" "+pq.peek().getA()+" "+pq.peek().getB());
                ans.add(pq.peek().getA());
                while(pq.size()>0 && j-pq.peek().getB()+1>=k){
                   pq.poll();
                }
                i++;
            }
            j++;
        }
        int[] res = new int[ans.size()];
        for(int l=0;l<ans.size();l++){
            res[l]=ans.get(l);
        }
        return res;

    }
    static class Pair{
         int a;
         int b;
        Pair(int a,int b){
            this.a=a;
            this.b=b;
        }
        void setA(int a){
            this.a=a;
        }
        void setB(int b){
            this.b=b;
        }
        int getA(){
            return a;
        }
        int getB(){
            return b;
        }


    }
}

