class Solution {
    public int search(int[] arr, int k) {
        int n = arr.length;
        int low = 0;
        int hi = n-1;
        int idx = -1;
        while(low<=hi){
            int mid = (low+hi)/2;
            if(arr[mid]<k)     low = mid+1;
            else if(arr[mid]>k)    hi = mid-1;
            else{
                idx = mid;
                hi = mid-1; 
            }
        }
        return idx;
    }
}