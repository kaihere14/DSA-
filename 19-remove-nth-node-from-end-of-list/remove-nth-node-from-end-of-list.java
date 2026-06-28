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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null  )return head;
        if(head.next==null && n==1)return null;
            int length = 0 ;
            ListNode temp = head;
            while (temp!=null) {
                length++;
                temp = temp.next;
            }
            temp = head;
            int counter =1;
            if(length==n){
                temp = temp.next;
                return temp;
            }
            while (counter<length-n) {
                temp = temp.next;
                counter++;
            }
            if(temp.next.next!=null){
                temp.next = temp.next.next;
            }else{
                temp.next= null;
            }
            return head;
    }
}