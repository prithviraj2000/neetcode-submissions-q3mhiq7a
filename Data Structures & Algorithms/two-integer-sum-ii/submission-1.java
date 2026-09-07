class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>m = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int r = target-numbers[i];
            if(m.containsKey(r)){
                return new int[]{m.get(r),i+1};
            }
            m.put(numbers[i],i+1);
        }
        return new int[]{-1,-1};
    }
}
