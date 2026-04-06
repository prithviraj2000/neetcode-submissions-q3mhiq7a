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
    public void reorderList(ListNode head) {
        Deque<ListNode>dq = new ArrayDeque<>();
        ListNode t = head;
        while(t!=null){
            dq.addLast(t);
            t=t.next;
        }
        System.out.println(dq.size());
        int flip=0;
        t=null;
        while(dq.size()>0){
            if(flip==0){
                ListNode x = dq.removeFirst();
                x.next=null;
                if(t==null){
                    t=x;
                    head=t;
                } else {
                    t.next=x;
                    t=t.next;
                }
                flip=1;
            } else {
                ListNode x = dq.removeLast();
                x.next=null;
                t.next=x;
                t=t.next;
                flip=0;
            }
        }
    }

}
