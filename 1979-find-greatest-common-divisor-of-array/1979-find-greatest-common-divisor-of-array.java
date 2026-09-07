class Solution {
    public int findGCD(int[] nums) {
        int hcf = 1;
        int small  = Integer.MAX_VALUE;
        int larg = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(small>nums[i]) small = nums[i];
            if(larg<nums[i]) larg = nums[i];

        }
        for(int i =2;i<=Math.min(small,larg);i++){
            if(small%i==0 && larg%i==0) hcf = i;
        }
         return hcf;
    }
   
}