class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        stack<pair<int,int>>s;
        vector<int>ans;
        ans.push_back(0);
        s.push({temperatures[temperatures.size()-1],temperatures.size()-1});
        int j=temperatures.size()-2;
        while(j>=0){
            
                if(s.top().first>temperatures[j]){
                    ans.push_back(s.top().second-j);
                } else {
                    while(s.size()!=0 && s.top().first<=temperatures[j]){
                        s.pop();
                    }
                    if(s.size()!=0 && s.top().first>temperatures[j]){
                        ans.push_back(s.top().second-j);
                    }
                    else if(s.size()==0){
                        ans.push_back(0);
                    }
                }
                s.push({temperatures[j],j});
                j--;
            }
             reverse(ans.begin(),ans.end());
             return ans;
        }
    
};
