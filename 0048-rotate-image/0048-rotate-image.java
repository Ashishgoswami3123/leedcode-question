class Solution {
    public void rotate(int[][] arr) {
        for(int i = 1;i<arr.length;i++){
            for(int j = 0;j<i;j++){
                int temp = arr[i][j];
                 arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0;i<arr.length;i++){
            int strcol = 0;
            int endcol = arr[0].length-1;
            while(strcol<endcol){
                int temp = arr[i][strcol];
                arr[i][strcol] = arr[i][endcol];
                arr[i][endcol] = temp;
                strcol++;
                endcol--;
            }
        }
    }
}