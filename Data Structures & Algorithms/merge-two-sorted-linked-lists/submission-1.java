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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode h1=list1;
        ListNode h2=list2;
        ListNode ans=null;
        if(h1==null){
            return h2;
        } else if (h2==null){
            return h1;
        }
        if(h1!=null && h2!=null && h1.val<h2.val){
            ans=h1;
            h1=h1.next;
        } else  {
            ans=h2;
            h2=h2.next;
        }
        ListNode temp=ans;
        while(h1!=null && h2!=null){
            if(h1.val<h2.val){
                ans.next=h1;
                ans=ans.next;
                h1=h1.next;
            } else {
                ans.next=h2;
                ans=ans.next;
                h2=h2.next;
            }
        }
        while(h1!=null){
            
                ans.next=h1;
                ans=ans.next;
                h1=h1.next;
            
        }
        while(h2!=null){
            
                ans.next=h2;
                ans=ans.next;
                h2=h2.next;
            
        }
        ans.next=null;
        return temp;
    }
}