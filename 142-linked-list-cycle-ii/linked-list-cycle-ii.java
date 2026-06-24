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
    public ListNode detectCycle(ListNode head) {
        if(head==null)return null;
        HashMap<ListNode,Integer> store = new HashMap<>();
        while(head.next!=null){
            if(store.containsKey(head)&& store.get(head)==1)return head;
            store.put(head,1);
            head = head.next;
        }
        return null;
    }
}