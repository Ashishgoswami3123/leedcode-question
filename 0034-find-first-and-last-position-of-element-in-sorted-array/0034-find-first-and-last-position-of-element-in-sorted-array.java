class Solution {
    public int[] searchRange(int[] arr, int target) {
        int low1 = 0;
    int hi1 = arr.length-1;
    int firstidx = -1;
    while(low1<=hi1){
        int mid = (low1+hi1)/2;
        if(arr[mid]<target)     low1 = mid+1;
        else if(arr[mid]>target) hi1 = mid-1;
        else{//target == arr[mid]
            firstidx = mid;
            hi1 = mid -1;
        }
    
    }   
        int low2 = 0;
    int hi2 = arr.length-1;
    int secidx = -1;
    while(low2<=hi2){
        int mid1 = (low2+hi2)/2;
        if(arr[mid1]<target)     low2 = mid1+1;
        else if(arr[mid1]>target) hi2 = mid1-1;
        else{//target == arr[mid]
            secidx = mid1;
           low2 = mid1+1;
        }
    
    }

    return new int[]{firstidx,secidx};
    }
}