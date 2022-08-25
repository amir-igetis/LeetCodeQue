public class LongestPalinSubstr {
    public static void main(String[] args) {
        // https://leetcode.com/problems/longest-palindromic-substring
        // didn't post on linked in
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    static String longestPalindrome(String s){
        // nick white solution
        if (s==null || s.length()<1) {
            return " ";
        }
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len = middle(s, i, i);
            int len1 = middle(s, i, i+1);
            int currLen = Math.max(len, len1);
            if (currLen>end-start) {
                start = i-((currLen-1)/2);
                end = i+(len/2);
            }
        }
        return s.substring(start, end+1);
    }

    static int middle(String s, int left, int right){
        if (s==null || left>right) {
            return 0;
        }
        while (left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }

    // see solution with dynamic programming also
    static String longestPalindrome1(String s) {
        if(s==null || s.length()<=1)
            return s;
     
        int len = s.length();
        int maxLen = 1;
        boolean [][] dp = new boolean[len][len];
     
        String longest = null;
        for(int l=0; l<s.length(); l++){
            for(int i=0; i<len-l; i++){
                int j = i+l;
                if(s.charAt(i)==s.charAt(j) && (j-i<=2||dp[i+1][j-1])){
                    dp[i][j]=true;
     
                    if(j-i+1>maxLen){
                       maxLen = j-i+1; 
                       longest = s.substring(i, j+1);
                    }
                }
            }
        }
     
        return longest;
    }
}
