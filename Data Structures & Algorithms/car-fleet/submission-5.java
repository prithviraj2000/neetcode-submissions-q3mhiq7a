class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        ArrayList<Pair>fleetList=new ArrayList<>();
        for(int i=0;i<position.length;i++){
           fleetList.add(new Pair(position[i],
        (target - position[i]) / (double) speed[i]));
        //System.out.println(((target - position[i]) / (double) speed[i]));
        }
        Collections.sort(fleetList,(a,b)->b.first-a.first);

        int ans=0;
        double prevTime=0;
        for(Pair x : fleetList){
            if(prevTime<x.second){
                prevTime=x.second;
                ans++;
            }
        }
        return ans;

    }
}
public class Pair{
     Integer first;
     Double second;
     Pair(Integer first,Double second){
        this.first=first;
        this.second=second;
    }
    void setfirst(Integer x){
        first=x;

    }
    void setsecond(Double x){
        second=x;

    }
    Integer getfist(){
        return first;
    }
    Double getsecond(){
        return second;
    }
}
