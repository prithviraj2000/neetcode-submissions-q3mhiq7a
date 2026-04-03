class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int x =nums[i],count=1;
           while(set.contains(++x)){
            count++;
           }
           ans=Math.max(ans,count);
        }
        return ans;
    }
}
