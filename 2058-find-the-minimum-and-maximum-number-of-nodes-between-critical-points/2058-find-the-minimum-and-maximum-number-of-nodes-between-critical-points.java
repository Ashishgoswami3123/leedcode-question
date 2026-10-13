class Solution {
public int[] nodesBetweenCriticalPoints(ListNode head) {
int[] ans = {-1, -1};
    ListNode a = head;
    ListNode b = head.next;
    ListNode c = b.next;

    int idx = 1;
    int firstidx = -1;
    int lastidx = -1;
    int mindis = Integer.MAX_VALUE;

    while (c != null) {
        if ((b.val > a.val && b.val > c.val) ||
            (b.val < a.val && b.val < c.val)) {

            if (firstidx == -1) {
                firstidx = idx;
            }

            if (lastidx != -1) {
                int dist = idx - lastidx;
                mindis = Math.min(dist, mindis);
            }

            lastidx = idx;
        }

        idx++;
        a = a.next;
        b = b.next;
        c = c.next;
    }

    if (firstidx == lastidx) {
        return ans;
    }

    int maxdistance = lastidx - firstidx;

    ans[0] = mindis;
    ans[1] = maxdistance;

    return ans;
}

}
