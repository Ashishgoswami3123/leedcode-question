class Solution {
public Node deepCopy(Node head1) {
if (head1 == null) return null;
    Node dummy = new Node(-1);
    Node temp1 = head1;
    Node temp2 = dummy;

    while (temp1 != null) {
        Node t = new Node(temp1.val);
        temp2.next = t;

        temp2 = temp2.next;
        temp1 = temp1.next;
    }

    return dummy.next;
}

public void merge(Node head1, Node head2) {
    Node temp1 = head1;
    Node temp2 = head2;

    while (temp1 != null && temp2 != null) {
        Node next1 = temp1.next;
        Node next2 = temp2.next;

        temp1.next = temp2;
        temp2.next = next1;

        temp1 = next1;
        temp2 = next2;
    }
}

public void randomconnection(Node head1, Node head2) {
    Node temp1 = head1;

    while (temp1 != null) {
        Node copy = temp1.next;

        if (temp1.random == null) {
            copy.random = null;
        } else {
            copy.random = temp1.random.next;
        }

        temp1 = copy.next;
    }
}

public Node split(Node head1) {
    Node dummy = new Node(-1);
    Node temp = dummy;
    Node curr = head1;

    while (curr != null) {
        Node copy = curr.next;

        curr.next = copy.next;
        temp.next = copy;

        temp = temp.next;
        curr = curr.next;
    }

    return dummy.next;
}

public Node copyRandomList(Node head) {
    if (head == null) return null;

    // Step 1: Create a deep copy
    Node head2 = deepCopy(head);

    // Step 2: Merge original and copied nodes
    merge(head, head2);

    // Step 3: Assign random pointers
    randomconnection(head, head2);

    // Step 4: Split original and copied lists
    return split(head);
}

}
