class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split("\\s+");
        String lastworld = arr[arr.length - 1];
        int count=0;
        for(int i = 0;i<lastworld.length();i++){
            count++;
        }
        return count;
    }
}