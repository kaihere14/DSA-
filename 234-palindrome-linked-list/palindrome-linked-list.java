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
    public boolean isPalindrome(ListNode head) {
        int length = 1;
        ListNode temp = head;
        while(temp!=null && temp.next!=null){
            length++;
            temp = temp.next;
        }
        ListNode arr[] = new ListNode[length];
        int start = 0;
        temp = head;
        while(temp!=null ){
            arr[start++]=temp;
            temp = temp.next;
        }
        for(int i  = 0;i<arr.length;i++){
            if(arr[i].val != arr[arr.length-1-i].val){
                return false;
            }
        }
        return true;
    }
}