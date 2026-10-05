class Solution {
    public ListNode middleNode(ListNode head) {
    ListNode temp = head;
    int size = 0;
    while(temp!=null){
        size++;
        temp = temp.next;
    }
    temp = head;
    for(int i =  1;i<=size/2;i++){
        temp = temp.next;
    }
    return temp;
    }
}