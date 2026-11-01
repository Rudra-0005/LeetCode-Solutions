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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode start = head;
        
        for(int i = 1 ; i<k ; i++){
            start = start.next;
        }
        ListNode temp = start.next;
        ListNode end = head;

        while(temp != null){
            temp = temp.next;
            end = end.next;
        }
        if(start == end){
            return head;
        }
        ListNode copy = new ListNode();
        copy.val = start.val;
        start.val = end.val;
        end.val = copy.val;

        return head;
    }
}