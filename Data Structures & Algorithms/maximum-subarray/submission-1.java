class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0],ans=nums[0];
        for(int i=1;i<nums.length;i++){ 
            sum+=nums[i];
            ans=Math.max(ans,Math.max(sum,nums[i]));
            if(sum<0){
                sum=0;
            }
            
        }
        return ans;
    }
}
