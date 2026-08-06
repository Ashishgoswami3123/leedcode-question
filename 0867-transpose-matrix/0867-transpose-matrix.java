class Solution {
    public int[][] transpose(int[][] arr) {
        int row = arr.length;
        int colms = arr[0].length;
        int [][]brr = new int[colms][row];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<colms;j++){
                 brr[j][i] =arr[i][j];
            }
        }
        return brr;
    }
}