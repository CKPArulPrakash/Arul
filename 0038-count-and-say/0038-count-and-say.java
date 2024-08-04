class Solution {
    public String countAndSay(int n) {
        String sequence = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder nextTerm = new StringBuilder();
            int count = 1;

            for (int j = 1; j < sequence.length(); j++) {
                if (sequence.charAt(j) == sequence.charAt(j - 1)) {
                    count++;
                } else {
                    nextTerm.append(count).append(sequence.charAt(j - 1));
                    count = 1;
                }
            }

            nextTerm.append(count).append(sequence.charAt(sequence.length() - 1));
            sequence = nextTerm.toString();
        }

        return sequence;
    }
}