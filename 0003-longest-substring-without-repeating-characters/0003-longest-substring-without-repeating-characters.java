class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int maxLength = 0;
        int left = 0;
        int right = 0;
        Set<Character> charSet = new HashSet<>();

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            if (!charSet.contains(currentChar)) {
                charSet.add(currentChar);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                charSet.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength; 
    }
}