class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        ArrayList<double[]> a = new ArrayList<>();
        int i=0;
        for(int p:position){
            double t = (target-p)/(speed[i]*1.0);
            a.add(new double[]{p*1.0,t});
            i++;
        }
        a.sort((x, y) -> Double.compare(y[0], x[0]));
        for(double[]d:a){
            System.out.println(d[0]+" "+d[1]);
        }
        int ans=1;
        double lastTime=a.get(0)[1];
        for(i=1;i<a.size();i++){
            if(lastTime<a.get(i)[1]){
                
                ans++;
                lastTime=a.get(i)[1];
          
            }
        }

        return ans;




    }
}
