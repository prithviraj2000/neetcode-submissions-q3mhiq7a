class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] lprod = new int[nums.length];
        int[] rprod = new int[nums.length];
        lprod[0]=nums[0];
        rprod[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            lprod[i]=lprod[i-1]*nums[i];
        }
        for(int i=nums.length-2;i>0;i--){
            rprod[i]=rprod[i+1]*nums[i];
        }
        nums[0]=rprod[1];
        nums[nums.length-1]=lprod[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            nums[i]=lprod[i-1]*rprod[i+1];
        }
        return nums;
    }
}  
