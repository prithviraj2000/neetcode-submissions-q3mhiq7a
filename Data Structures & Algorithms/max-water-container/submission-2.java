class Solution {
    public int maxArea(int[] heights) {
        int ans = 0;
        int i=0,j=heights.length-1;
        while(i<j){
            ans=Math.max(ans,(j-i)*Math.min(heights[i],heights[j]));
            if(heights[j]>heights[i]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}
