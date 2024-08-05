class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false; // Negative numbers and zero are not powers of three
        }

        // Keep dividing n by 3 until it becomes 1 (or not divisible anymore)
        while (n % 3 == 0) {
            n /= 3;
        }

        // If n is 1 after the loop, it's a power of three
        return n == 1;
    }
}