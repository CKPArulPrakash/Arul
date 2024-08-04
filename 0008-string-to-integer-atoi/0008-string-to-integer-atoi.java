class Solution {
    public int myAtoi(String s) {
     if (s == null || s.isEmpty()) {
            return 0;
        }

        int index = 0;
        int sign = 1; // Default positive sign
        long result = 0; // Use long to handle overflow

        // Step 1: Ignore leading whitespace
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        // Step 2: Determine sign
        if (index < s.length() && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // Step 3: Read the integer
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            result = result * 10 + digit;

            // Check for overflow
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            index++;
        }

        return (int) (result * sign);   
    }
}