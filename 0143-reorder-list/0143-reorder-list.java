
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
    
    public void reorderList(ListNode head) {
        ListNode slow  = head;
        ListNode fast = head;
        ListNode temp = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
       
        ListNode i = head;
        ListNode j = head2;
        while(j != null){
          ListNode t = i.next;
          i.next = j;
          i = j;
          j = j.next;
          i.next= t;
          i = t;
        }
        


    }
}