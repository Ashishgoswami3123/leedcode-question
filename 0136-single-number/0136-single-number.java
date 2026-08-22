class Solution {
    public int singleNumber(int[] arr) {
     int unique = 0;
     for(int ele:arr){
        unique = unique^ele;
     }
     return unique;
    }
}