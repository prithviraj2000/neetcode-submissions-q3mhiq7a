class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set = new HashSet<>();
        int ans = 0;
        int i=0,j=0;
        while(j<s.length()){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            ans = Math.max(j-i+1,ans);
            j++;
            
        }
        return ans;
    }
}
