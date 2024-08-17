class Solution {
    public String shortestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        String rev_s = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev_s;
        int[] lps = computeLPSArray(combined);

        int addLength = s.length() - lps[lps.length - 1];
        return rev_s.substring(0, addLength) + s;
    }

    private int[] computeLPSArray(String s) {
        int[] lps = new int[s.length()];
        int length = 0;
        int i = 1;

        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}