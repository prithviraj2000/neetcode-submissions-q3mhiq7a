class Solution {
    public int missingNumber(int[] nums) {
        int x = nums.length;
        int temp=0;
        for(int i=0;i<=x;i++){
            temp^=i;
        }
        for(int a:nums){
            temp^=a;
        }
        return temp;
    }
}
