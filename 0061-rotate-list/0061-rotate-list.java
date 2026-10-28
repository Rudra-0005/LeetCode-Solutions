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
    
    
    public ListNode GetIndex(ListNode head ,int k ){
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        int rotate = k%size;
        if(rotate == 0){
            return head;
        }
        int pos = size - rotate;
        ListNode temp2 = head;
        for(int i = 1 ;i<=pos ; i++){
            temp2 =temp2.next;
        }
        return temp2;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0) return head;
        ListNode rotationIndex = GetIndex(head,k);
         if (rotationIndex == head) {
            return head;
        }
        ListNode cut = head;
        while(cut.next!=rotationIndex){
            cut = cut.next;
        }
        cut.next = null;
       
        
        ListNode temp = rotationIndex;
        while(temp.next != null){
            temp = temp.next;
        }    
        temp.next = head;
        head = rotationIndex;   
        return head;
    }
}