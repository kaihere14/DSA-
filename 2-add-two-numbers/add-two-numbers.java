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
    public void addRecursive(ListNode l1, ListNode l2 , int carry, ListNode curr) {
        if(l1 == null && l2 == null && carry == 0){
            return;
        }
        int x = (l1 != null) ? l1.val : 0;
        int y = (l2 != null) ? l2.val : 0;

        int val = x+y+carry;
        carry = 0;
        if(val>=10){
            carry = val / 10;
            val = val % 10;
        }
        curr.next =  new ListNode(val);
        curr = curr.next;
         
        

        addRecursive( l1 != null ? l1.next : null,
        l2 != null ? l2.next : null, carry, curr);

        return;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        addRecursive(l1, l2, 0, curr);

        return dummy.next;
    }
}