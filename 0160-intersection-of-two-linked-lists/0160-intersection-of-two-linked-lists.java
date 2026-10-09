
public class Solution {
    public ListNode getIntersectionNode(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        int s1 = 0;
        int s2 = 0;
        while(t1!=null){
            s1++;
            t1 = t1.next;
        }while(t2!=null){
            s2++;
            t2 = t2.next;
        }
        t1 = l1;
        t2 = l2;
        if(s1>s2){
            for(int i = 1;i<=s1-s2;i++){
                t1 = t1.next;
            }
        }
        else{
            for(int i = 1;i<=s2-s1;i++){
                t2 = t2.next;
            }
        }
        while(t1!=t2){
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }
}
