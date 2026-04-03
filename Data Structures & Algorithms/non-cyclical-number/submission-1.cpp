class Solution {
public:
    bool isHappy(int n) {
        map<int,int>m;
        while(n>0 && m[n]!=2){
            int x = n;
            int st = 0;
            while(x>0){
                int t = x%10;
                x=x/10;
                st+=pow(t,2);
            }
            n=st;
            //cout<<n<<endl;
            if(n==1){
                return true;
            }
            m[n]++;
        }
        return false;
    }
};
