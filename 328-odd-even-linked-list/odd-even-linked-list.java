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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)return head;

            int length = 0;
            ListNode temp = head;
            while (temp!=null) {
                length++;
                temp = temp.next;
            }
            int formated[] = new int[length];
            int counter = 0;
            temp = head;
            while(temp!=null && temp.next!=null){
                formated[counter++] = temp.val;
                temp = temp.next.next;
            }
            if(temp!=null)formated[counter++] = temp.val;
            temp = head.next;
            while(temp!=null && temp.next!=null){
                formated[counter++] = temp.val;
                temp = temp.next.next;
            }
            if(temp!=null)formated[counter++] = temp.val;

            temp = head;
            counter = 0;
            while (temp!=null) {
                temp.val = formated[counter++];
                temp = temp.next;
            }
            
            return head;
    }
}