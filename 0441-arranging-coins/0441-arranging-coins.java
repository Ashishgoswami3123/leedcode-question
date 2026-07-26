class Solution {
    public int sqrt(long x){
        if(x==0 || x==1) return (int)x;
        long i =1;
        while((long)i*i<=x){
            i++;
        }
        return (int)i-1;

    }
    public int arrangeCoins(int n) {
        long m = n;
        return (sqrt(1+8*m)-1)/2;

    }
}