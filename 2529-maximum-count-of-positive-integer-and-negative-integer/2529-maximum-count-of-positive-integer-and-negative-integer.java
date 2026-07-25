class Solution {
    public int maximumCount(int[] arr) {
        int greatzero = 0;
        int lowzero = 0;
        for (int j = 0; j < arr.length; j++) {
            
        
        if(arr[j]<0){
            lowzero++;

        }
        else if(arr[j]>0){
            greatzero++;
        }
    }

        if(greatzero>lowzero) return greatzero;
        else return lowzero;
    }
    
}