class Solution {

    public int sqrt(long x) {
        if (x == 0 || x == 1) return (int)x;

        long i = 1;
        while (i * i <= x) {
            i++;
        }

        return (int)(i - 1);
    }

    public int arrangeCoins(int n) {
        return (sqrt(1L + 8L * n) - 1) / 2;
    }
}