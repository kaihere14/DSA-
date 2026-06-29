/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp_a = headA;
        ListNode temp_b = headB;

        Set<ListNode> counter = new HashSet<>();
        while (temp_a!=null) {
            counter.add(temp_a);
            temp_a= temp_a.next;
        }
        while (temp_b!=null) {
            if(counter.contains(temp_b))return temp_b;
            temp_b = temp_b.next;
        }
        return null;
    }
}