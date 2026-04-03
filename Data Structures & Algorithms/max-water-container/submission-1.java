class Solution {
    public int maxArea(int[] heights) {
        int i = 0,j=heights.length-1;
        int ans=0;
        while(i<j){
            if(heights[i]>heights[j]) {
                ans=Math.max(ans,Math.min(heights[i],heights[j])*(j-i));
                j--;
            } else {
                ans=Math.max(ans,Math.min(heights[i],heights[j])*(j-i));
                i++;
            }
        }
        return ans;
    }
}
