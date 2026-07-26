class Solution {
    public int sqrt(long x){
        if(x==0) return 0;
        long lo  =1,hi = x;
        while(lo<=hi){
            long mid = lo +(hi-lo)/2;
            if(mid==x/mid) return (int)mid;
            else if(mid>x/mid) hi = mid-1;
            else lo = mid +1;

        }
        return (int)hi;

    }
    public int arrangeCoins(int n) {
        long m = n;
        return (sqrt(1+8*m)-1)/2;

    }
}