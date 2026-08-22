class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        solve(s, wordDict, 0, "", ans);
        return ans;
    }

    void solve(String s, List<String> dict, int i, String str, List<String> ans) {
        if (i == s.length()) {
            ans.add(str.trim());
            return;
        }

        for (String word : dict) {
            if (s.startsWith(word, i)) {
                solve(s, dict, i + word.length(), str + word + " ", ans);
            }
        }
    }
}