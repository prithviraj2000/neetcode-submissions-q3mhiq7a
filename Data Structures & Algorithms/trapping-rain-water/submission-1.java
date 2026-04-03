class Solution {
    public int trap(int[] height) {
        int[] lmax=new int[height.length];
        int[] rmax=new int[height.length];
        lmax[0]=height[0];
        rmax[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            lmax[i]=Math.max(lmax[i-1],height[i]);
        }
        for(int i=height.length-2;i>0;i--){
            rmax[i]=Math.max(rmax[i+1],height[i]);
        }
        int ans = 0;
        for(int i=1;i<height.length-1;i++){
            //System.out.println(height[i]+"--"+lmax[i]+"--"+rmax[i]);
            
                ans+=(Math.min(lmax[i],rmax[i])-height[i]);
            
        }
        return ans;
    }
}
