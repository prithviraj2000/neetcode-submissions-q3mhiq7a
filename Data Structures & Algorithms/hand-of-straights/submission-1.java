class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Arrays.sort(hand);
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int n:hand){
            m.put(n,m.getOrDefault(n,0)+1);
        }

        for(int i=0;i<hand.length;i++){
            int end = hand[i] + groupSize - 1;
            while(m.containsKey(hand[i])){
                for (int card = hand[i]; card <= end; card++) {
                    if (!m.containsKey(card)) return false;

                        m.put(card, m.get(card) - 1);

                        if (m.get(card) == 0) {
                        m.remove(card);
                    }
                }
            }
                
            
        }
        return true;
    }
}
