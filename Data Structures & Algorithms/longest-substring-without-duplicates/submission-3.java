class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>st = new HashMap<>();
        int i=0,j=0,ans=0;
        while(j<s.length()){
            if(st.containsKey(s.charAt(j))){
                System.out.println(j);
                ans = Math.max(ans,j-st.get(s.charAt(j)));
                while(st.containsKey(s.charAt(j))){
                    st.remove(s.charAt(i));
                    i++;
                }
                
            } else {
                ans = Math.max(ans,j-i+1);
                
            }
            st.put(s.charAt(j),j);;
            j++;
        }
        return ans;
    }
}
