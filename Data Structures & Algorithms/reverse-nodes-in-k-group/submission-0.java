/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    ArrayList<Integer>a = new ArrayList<>();
    public ListNode reverseKGroup(ListNode head, int k) {
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        
        for(int i=0;i<=a.size()-k;i+=k){
            //System.out.print(a.size()+" "+i+" "+(i+k-1)+" ");
            reverse(a,i,i+k-1);
        }
        // for(int i=0;i<a.size();i++){
        //     System.out.print(a.get(i)+" ");
        // }
        
        ListNode x = new ListNode(0);
        ListNode temp = x;
        for(int i=0;i<a.size();i++){
            temp.next = new ListNode(a.get(i));
            temp=temp.next;
        }

        return x.next;

    }
    void reverse(ArrayList<Integer>a,int l ,int r){
        while(l<r){
            int temp = a.get(l);
        a.set(l, a.get(r));
        a.set(r, temp);
        l++;
        r--;
        }
    }
}
