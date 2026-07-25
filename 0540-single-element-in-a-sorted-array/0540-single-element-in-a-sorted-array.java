class Solution {
    public int singleNonDuplicate(int[] arr) {
       int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-2]!=arr[n-1]) return arr[n-1];
        int low = 0,hi = n-1;
        while(low<=hi){
            int mid = (low+hi)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
            int f = mid , s  = mid;
            if(arr[mid]==arr[mid-1]){
                f = mid-1;
            }
            else if(arr[mid]==arr[mid+1]){
                s = mid+1;

            }
            int leftelement = f-low;
            int rightelement = hi-s;
            if(leftelement%2==0){
                low = s+1;
            }
            else if(rightelement%2==0){
                hi = f -1;
            }

        }
        return 234;
    }
}
