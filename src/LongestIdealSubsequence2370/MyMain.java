package LongestIdealSubsequence2370;

import java.util.Arrays;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.longestIdealString("acfgbd", 2));
//        System.out.println(main.longestIdealString("abcd", 3));
    }

    public int longestIdealString(String s, int k) {
        int N = s.length();

        // Initialize all dp values to -1 to indicate non-visited states
        int[][] dp = new int[N][26];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], -1);
        }

        // Find the maximum dp[N-1][c] and return the result
        int res = 0;
        for (int c = 0; c < 26; c++) {
            res = Math.max(res, dfs(N - 1, c, dp, s, k));
        }
        return res;
    }

    public int dfs(int i, int c, int[][] dp, String s, int k) {
        // Memoized value
        if (dp[i][c] != -1) {
            return dp[i][c];
        }

        // State is not visited yet
        dp[i][c] = 0;
        boolean match = c == (s.charAt(i) - 'a');
        if (match) {
            dp[i][c] = 1;
        }

        // Non base case handling
        if (i > 0) {
            dp[i][c] = dfs(i - 1, c, dp, s, k);
            if (match) {
                for (int p = 0; p < 26; p++) {
                    if (Math.abs(c - p) <= k) {
                        dp[i][c] = Math.max(dp[i][c], dfs(i - 1, p, dp, s, k) + 1);
                    }
                }
            }
        }
        return dp[i][c];
    }
//    public int longestIdealString(String s, int k) {
//        int N = s.length();
//        int[] dp = new int[26];
//
//        int res = 0;
//        // Updating dp with the i-th character
//        for (int i = 0; i < N; i++) {
//            int curr = s.charAt(i) - 'a';
//            int best = 0;
//            for (int prev = 0; prev < 26; prev++) {
//                if (Math.abs(prev - curr) <= k) {
//                    best = Math.max(best, dp[prev]);
//                }
//            }
//
//            // Appending s[i] to the previous longest ideal subsequence allowed
//            dp[curr] = Math.max(dp[curr], best + 1);
//            res = Math.max(res, dp[curr]);
//        }
//        return res;
//    }
}
