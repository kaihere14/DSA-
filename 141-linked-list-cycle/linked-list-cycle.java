/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        // Write your logic here
        if(head==null)return false;
        Stack<ListNode> store = new Stack<>();
        while(head.next!=null){
            if(store.contains(head.next))return true;
            store.add(head.next);
            head = head.next;
        }
        return false;
    }
}
