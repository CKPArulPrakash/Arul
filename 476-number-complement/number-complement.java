class Solution {
    public int findComplement(int num) {
        int a = Integer.toBinaryString(num).length();
        int b = (1 << a) - 1;
        return num^b;
    }
}