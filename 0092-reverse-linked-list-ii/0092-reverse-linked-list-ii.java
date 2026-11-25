class Solution {

    public ListNode reverse(ListNode head, int left, int right) {

        int iterations = right - left + 1;

        ListNode curr = head;
        ListNode prev = null;

        for(int i = 1; i <= iterations; i++) {

            ListNode forward = curr.next;

            curr.next = prev;

            prev = curr;
            curr = forward;
        }

        // Original head of this segment is now its tail
        head.next = curr;

        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || left == right) {
            return head;
        }

        ListNode RunNode = head;
        ListNode prevNode = null;

        // Move RunNode to position left
        // prevNode will store the node before left
        for(int i = 1; i < left; i++) {
            prevNode = RunNode;
            RunNode = RunNode.next;
        }

        ListNode revHead = reverse(RunNode, left, right);

        // Connect the reversed portion to the original list
        if(prevNode == null) {
            head = revHead;
        }
        else {
            prevNode.next = revHead;
        }

        return head;
    }
}