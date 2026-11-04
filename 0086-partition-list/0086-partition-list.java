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
    public ListNode partition(ListNode head, int x) {
        ListNode Lhead = new ListNode(-1);
        ListNode Ltail = Lhead;

        ListNode Ghead = new ListNode(-1);
        ListNode Gtail = Ghead;

        ListNode temp = head;

        while(temp != null){
            if(temp.val < x){
                ListNode InsertNode = temp;
                temp = temp.next;

                InsertNode.next = null;
                Ltail.next = InsertNode;
                Ltail = InsertNode;
            }
            else{
                ListNode InsertNode = temp;
                temp = temp.next;

                InsertNode.next = null;
                Gtail.next = InsertNode;
                Gtail = InsertNode;
            }  
        }
        Ltail.next = Ghead.next;
        Gtail.next =null;
        Lhead = Lhead.next;
        return Lhead;
    }
}