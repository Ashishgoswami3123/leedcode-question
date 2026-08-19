class Solution { 
    public boolean isPowerOfFour(int n) { 
        
        if(n <= 0) return false;
        if(n == 1) return true;

        int m = 1; 
        
        while(m <= n / 4) { 
            m = m * 4;
            
            if(m == n) return true;
        }
        
        return false; 
    } 
}