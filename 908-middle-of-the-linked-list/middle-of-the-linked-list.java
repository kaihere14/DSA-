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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int counter =0;
        while(temp!=null){
            counter++;
            temp = temp.next;
        }
        int newCounter = 0;
        ListNode temp2 = head;
        
            while(temp2!=null){
                if(newCounter==(counter)/2){
                    return temp2;
                }
                newCounter++;
                temp2 = temp2.next;
            }
        

        return temp;
    }
}