class Solution {
    public String minWindow(String s, String t) {
        
        HashMap<Character,Integer>m=new HashMap<>();
        for(int i=0;i<t.length();i++){
            m.put(t.charAt(i),m.getOrDefault(t.charAt(i),0)+1);
        }

        int count = 0;
        int startIndex = -1,minlength=Integer.MAX_VALUE;
        int i=0,j=0;
        while(i<s.length()){

            if(!m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)-1);
            }
           
            if(m.get(s.charAt(i))>0){
                count++;
                
            }
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)-1);
            System.out.println(count);
            while(count==t.length()){
                if(i-j+1<minlength){
                    startIndex=j;
                minlength=Math.min(minlength,i-j+1);
                }
                
                m.put(s.charAt(j),m.get(s.charAt(j))+1);
                if(m.get(s.charAt(j))>0){
                    count--;
                }
                j++;
            }
           
            i++;
        }
        return startIndex==-1?"": s.substring(startIndex,startIndex+minlength);
    }
}
