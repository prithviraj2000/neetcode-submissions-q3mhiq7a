class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0,totalCost=0;
        totalGas = Arrays.stream(gas).sum();
        totalCost = Arrays.stream(cost).sum();
        if(totalCost>totalGas){
            return -1;
        }
        int ans = 0;
        totalGas=0;
        totalCost=0;
        for(int i=0;i<gas.length;i++){
            totalGas+=gas[i];
            totalCost=cost[i];

            if(totalGas>=totalCost){
                totalGas-=totalCost;
                if(ans==-1){
                    ans=i;
                }
               
            } else {
                totalGas=0;
                ans=-1;
            }
        }
        return ans;


    }
}
