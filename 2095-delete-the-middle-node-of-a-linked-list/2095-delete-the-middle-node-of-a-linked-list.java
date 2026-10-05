class Solution {
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        temp = head;

        for (int i = 1; i < size / 2; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}