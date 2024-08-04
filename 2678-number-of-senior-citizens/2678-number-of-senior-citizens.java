class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            if(Age(details[i])>60){
                count++;
            }
        }
        return count;
    }
    public int Age(String detail) {
        int age = (detail.charAt(11) - '0') * 10 + (detail.charAt(12) - '0');
        return age;
    }
}