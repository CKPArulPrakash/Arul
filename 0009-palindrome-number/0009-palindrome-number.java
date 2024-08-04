class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negative numbers are not palindromes
        }

        String strX = String.valueOf(x);
        int left = 0;
        int right = strX.length() - 1;

        while (left < right) {
            if (strX.charAt(left) != strX.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}