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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode pre= head;
        ListNode temp = pre.next;
        pre.next = null;
        while(temp!=null){
            ListNode temp2 = temp.next;
            temp.next= pre;
            pre = temp;
            temp = temp2;
        }
        System.out.println(pre);
        return pre;
    }
}