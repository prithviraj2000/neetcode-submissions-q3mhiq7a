class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;
        while(l<=r){
            int rate = (l+r)/2;

            int time = 0;
            for(int x : piles){
                time += Math.ceil((double)x/rate);
            }
            if(time>h){
                l=rate+1;
            } else{
                res=rate;
                r=rate-1;
            }
        }
        return res;
    }
}
