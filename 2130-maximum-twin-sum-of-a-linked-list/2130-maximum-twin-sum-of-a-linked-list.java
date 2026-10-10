
class Solution {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        

    
        while(head!=null){
            ListNode nextNode = head.next;
             head.next = prev;
             prev = head;
             head = nextNode;

        }
        return prev;
    }
    public int pairSum(ListNode head) {
        int sum = 0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        ListNode i = head;
        ListNode j = head2;
        while(j!=null){
           if ((i.val + j.val) > sum) {
            sum = i.val + j.val;
            }
            i = i.next;
            j = j.next;
        }
        return sum;
    }
}