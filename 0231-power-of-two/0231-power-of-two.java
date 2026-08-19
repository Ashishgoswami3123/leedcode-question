class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        int length = n/2;
        int m = 2;
        for(int i=0;i<n/2;i++){
            if(m==n) return true;
            m *=2;
        }
        
        return false;
    }
}