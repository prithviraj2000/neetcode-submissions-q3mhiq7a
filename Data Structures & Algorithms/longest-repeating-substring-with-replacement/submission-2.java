class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>m = new HashMap<>();
        int ans=0,maxFreq=0,j=0;
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            maxFreq = Math.max(maxFreq,m.get(s.charAt(i)));

            while((i-j+1)-maxFreq>k){
                m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0)-1);
                if(m.get(s.charAt(j))==0){
                    m.remove(m.get(s.charAt(j)));
                }
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}
