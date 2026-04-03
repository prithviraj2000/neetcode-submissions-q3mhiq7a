class Solution {
    public double myPow(double x, int n) {
        int nn=n;
        if(n<0)nn=n*-1;
        double ans=1;
        while(nn>0){
            if(nn%2==1){
                ans*=x;
                nn-=1;
            } else {
                x*=x;
                nn/=2;
            }
        }
        if(n<0)return 1/(double)ans;
        return ans;
    }
}
