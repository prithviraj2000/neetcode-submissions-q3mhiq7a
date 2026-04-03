class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int upperBound = Arrays.stream(piles).max().orElse(0);
        int l=1,r=upperBound;
        int ans = upperBound;
        while(l<=r){
            int m = (l+r)/2;
            int totalTime = 0;
            for(int p:piles){
                totalTime+=Math.ceil((double) p / m);
            }
            if (totalTime <= h) {
                ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }

        }
        return ans;
    }
}
