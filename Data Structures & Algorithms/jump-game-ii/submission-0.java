class Solution {
    public int jump(int[] nums) {
        int totalSteps = 0,l=0,r=0,farthest = 0;
        while(r<nums.length-1){
            for(int i=l;i<=r;i++){
                farthest = Math.max(farthest,i+nums[i]);
            }
            l=r+1;
            r=farthest;
            totalSteps++;
        }
        return totalSteps;

    }
}
