class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxRate = Arrays.stream(piles).max().getAsInt();

        int l = 1,r=maxRate;
        int ans = r;

        while(l<=r){
            int mid = (l+r)/2;
            int time=0;
            for(int x:piles){
                time+= Math.ceil(x/(mid*1.0));
            }

            if(time>h){
                l=mid+1;
            }else if(time<=h){
                ans=mid;
                r=mid-1;
            }
        }
        return ans;


    }
}
