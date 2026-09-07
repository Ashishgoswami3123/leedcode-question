class Solution {
    public boolean isMiddleElementUnique(int[] arr) {
        int mid = (arr.length-1)/2;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==arr[mid] && i!=mid){
                return false;
            }
        }
        return true;
    }
}