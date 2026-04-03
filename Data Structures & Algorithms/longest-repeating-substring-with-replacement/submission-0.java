class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>m= new HashMap<>();
        int maxfreq = 0,ans=0,j=0 ;
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            maxfreq=Math.max(maxfreq,m.get(s.charAt(i)));
            
            System.out.println(i+1-maxfreq);
            while((i-j+1)-maxfreq>k){
                m.put(s.charAt(j),m.get(s.charAt(j))-1);
                if(m.get(s.charAt(j))==0){
                    m.remove(s.charAt(j));

                }
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}
