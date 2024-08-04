class Solution {
    public int[] plusOne(int[] digits) {
        int a = digits.length;
        for (int i = a - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] n = new int[a + 1];
        n[0] = 1;
        return n;
    }
}