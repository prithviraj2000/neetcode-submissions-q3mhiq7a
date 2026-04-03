class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Arrays.sort(hand);
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int n:hand){
            m.put(n,m.getOrDefault(n,0)+1);
        }

        for(int i=0;i<hand.length;i++){
            int temp=hand[i];
            while(m.size()>0 && m.containsKey(temp) && temp<=hand[i]+groupSize-1){
               
                while(temp<=hand[i]+groupSize-1){
                    if(m.containsKey(temp) && m.get(temp)>0){
                    //System.out.println(temp+" "+m.get(temp));
                    m.put(temp,m.get(temp)-1);
                    //System.out.println(i+" "+temp+" "+m.get(temp));
                    if(m.get(temp)==0){
                        m.remove(temp);
                    }
                    temp++;
                    
                } else {
                    return false;
                }
                }
                
            }
        }
        return true;
    }
}
