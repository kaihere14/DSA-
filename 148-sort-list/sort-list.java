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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head; 
            ListNode temp = head;
            int length  = 0 ;
            while (temp!=null) {
                length++;
                temp = temp.next;
            }
            int values[] = new int[length];
            temp = head;
            int counter = 0;
            while (temp!=null) {
                values[counter++] = temp.val;
                temp = temp.next;
            }
            Arrays.sort(values);
            temp = head;
            counter = 0;
            while (temp!=null) {
                temp.val = values[counter++];
                temp = temp.next;
            }

            return head;
    }
}