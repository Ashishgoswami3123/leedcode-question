class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int mutl = 1;
        int m = n;
        while(n!=0){
            sum +=(n%10);
            mutl *=(n%10);
            n = n/10;
        }
        if(m%(sum+mutl)==0){
            return true;
        }
        return false;
    }
}