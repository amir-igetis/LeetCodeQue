public class RemoveNthNodeList {
    public static void main(String[] args) {
        // https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    }

    static ListNode removeNthFromEnd(ListNode head, int n){
        // solution from programmecreek
        ListNode fast = head;
        ListNode slow = head;

        if(head == null){
            return null;
        }

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast==null) {
            head = head.next;
            reuturn head;
        }
        while (fast.next!=null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    static ListNode removeNthFromEnd1(ListNode head, int n){
        // solution from nick white
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 1; i <= n+1; i++) {
            fast = fast.next;
        }
        while (fast!=null) {
            slow = slow.next;
            fast=fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
