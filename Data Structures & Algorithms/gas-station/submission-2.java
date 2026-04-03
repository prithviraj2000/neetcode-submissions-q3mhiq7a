class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totgas = Arrays.stream(gas).sum();
        int totcost = Arrays.stream(cost).sum();
        if(totgas<totcost){
            return -1;
        }
        totgas=0;
        int start=-1;
        for(int i=0;i<gas.length;i++){
            totgas+=gas[i];
            if(totgas<cost[i]){
                totgas=0;
                start = -1;
            } else {
                totgas-=cost[i];
                if(start==-1){
                    start=i;
                }
            }
        }
        return start;
    }
}
