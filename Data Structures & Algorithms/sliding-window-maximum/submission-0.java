class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         PriorityQueue<Pair> p = new PriorityQueue<>(
    (x, y) -> Integer.compare(y.geta(), x.geta())
);

        int i=0,j=0;
        int[] ans = new int[nums.length-(k-1)];
        int x=0;
        while(j<nums.length){
            p.add(new Pair(nums[j],j));
            //System.out.println(p.peek().geta());
            if(j-i+1==k){
                while(!p.isEmpty() && j-p.peek().getb()>=k){
                    //System.out.println(p.peek().geta() +" "+ (j-p.peek().getb()));
                    p.poll();
                }
                ans[x]=p.peek().geta();
                x++;
                i++;
            }
            j++;
        }
        return ans;
    }
    
}
public class Pair{
    private Integer a;
    private Integer b;
    public Pair(Integer x, Integer y){
        a =x;
        b=y;
    }
    void seta(Integer a){
        this.a=a;
    }
    void setb(Integer b){
        this.b=b;
    }
    Integer geta(){
        return a;
    }
    Integer getb(){
        return b;
    }

}
