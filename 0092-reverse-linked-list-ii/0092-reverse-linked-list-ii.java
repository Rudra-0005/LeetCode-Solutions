class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || left == right){
            return head;
        }

        ListNode prevNode = null;
        ListNode temp = head;

        // Reach the node at position left
        for(int i = 1; i < left; i++){
            prevNode = temp;
            temp = temp.next;
        }

        ListNode start = temp;
        ListNode prev = null;
        ListNode curr = temp;

        int iterations = right - left + 1;

        for(int i = 1; i <= iterations; i++){
            ListNode forward = curr.next;

            curr.next = prev;

            prev = curr;
            curr = forward;
        }

        // Connect the original start (now tail) to the remaining list
        start.next = curr;

        // Connect the node before the reversed section
        if(prevNode == null){
            head = prev;
        }
        else{
            prevNode.next = prev;
        }

        return head;
    }
}