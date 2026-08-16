class Solution {
    public List<Integer> spiralOrder(int[][] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        int m = arr.length;       // rows
        int n = arr[0].length;    // columns

        int firstrow = 0;
        int lastrow = m - 1;

        int firstclm = 0;
        int lastclm = n - 1;

        while (firstrow <= lastrow && firstclm <= lastclm) {

            // 1. Left -> Right
            for (int i = firstclm; i <= lastclm; i++) {
                ans.add(arr[firstrow][i]);
            }
            firstrow++;

            // 2. Top -> Bottom
            for (int i = firstrow; i <= lastrow; i++) {
                ans.add(arr[i][lastclm]);
            }
            lastclm--;

            // 3. Right -> Left
            if (firstrow <= lastrow) {
                for (int i = lastclm; i >= firstclm; i--) {
                    ans.add(arr[lastrow][i]);
                }
                lastrow--;
            }

            // 4. Bottom -> Top
            if (firstclm <= lastclm) {
                for (int i = lastrow; i >= firstrow; i--) {
                    ans.add(arr[i][firstclm]);
                }
                firstclm++;
            }
        }

        return ans;
    }
}