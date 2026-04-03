class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Duplet>p = new PriorityQueue<>((x, y) -> y.a - x.a);
        for(Map.Entry<Integer,Integer>entry:m.entrySet()){
            p.add(new Duplet(entry.getValue(),entry.getKey()));
        }
        int [] ans = new int[k];
        int i=0;
        while(k>0){
            ans[i]=p.poll().getb();
            i++;
            k--;
        }
        return ans;
    }
}
class Duplet{
    int a;
    int b;
    Duplet(int a, int b){
        this.a=a;
        this.b=b;
    }
    void seta(int a){
        this.a=a;
    }
    int geta(){
        return a;
    }
    void setb(int b){
        this.b=b;
    }
    int getb(){
        return b;
    }
}
