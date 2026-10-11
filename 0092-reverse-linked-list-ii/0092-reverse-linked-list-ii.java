
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
    public ListNode reverseBetween(ListNode head, int l, int r) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        dummy.next = head;
        for(int i = 1;i<l;i++){
                temp = temp.next;
        }
        ListNode tail1 = temp;
        ListNode head2 = temp.next;
       
        temp = dummy;
        for(int i = 1;i<=r;i++){
                temp = temp.next;
        }
            ListNode tail2 = temp;
        ListNode head3 = temp.next;
         tail1.next = null;
         tail2.next = null;
         ListNode tail = head2;
        head2 = reverse(head2);
        tail1.next = head2;
        tail.next = head3;
        return dummy.next;
    }
}