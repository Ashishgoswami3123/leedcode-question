class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1 || n==4) return true;
       int m = 1;
       while(m<=n/4){
        
        m = m*4;
        if(m==n) return true;
        
       }
       return false;
    }
}