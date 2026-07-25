class Solution {
    public int searchInsert(int[] arr, int k) {

        int low = 0;
        int hi = arr.length - 1;

        while(low <= hi){

            int mid = (low + hi) / 2;

            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] < k){
                low = mid + 1;
            }
            else{
                hi = mid - 1;
            }
        }

        return low;
    }
}