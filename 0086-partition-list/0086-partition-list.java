
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode d1 = dummy1;
        ListNode d2 = dummy2;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                d1.next = temp;
               d1 = temp;
            }
            else {
                d2.next = temp;
                d2 = temp;
            }
           temp = temp.next;  
           
        }
       
            d2.next = null;
        d1.next = dummy2.next;
        return dummy1.next;
    }
}
