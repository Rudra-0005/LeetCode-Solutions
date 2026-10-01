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
    public ListNode mergeNodes(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        int sum = 0;
        
        while(curr != null){
            if(curr.val != 0){
                sum = sum + curr.val;
                curr = curr.next;
            }
            else{
            prev.val = sum;
            prev.next = curr.next;
            curr = curr.next;
            sum = 0;
            prev = curr;
            }
        }
        return head;
    }
}