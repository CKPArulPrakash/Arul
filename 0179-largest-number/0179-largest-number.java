class Solution {
    public String largestNumber(int[] nums) {
        String[] S = new String[A.length];
        for (int i = 0; i < A.length; i++) {
            S[i] = String.valueOf(A[i]);
        }

        Arrays.sort(S, new Comparator<String>() {
            public int compare(String a, String b) {
                String a1 = a + b;
                String a2 = b + a;
                return a2.compareTo(a1); 
            }
        });

        if (S[0].equals("0")) {
            return "0";
        }

        StringBuilder largestNum = new StringBuilder();
        for (String num : S) {
            largestNum.append(num);
        }

        return largestNum.toString();
    }
}