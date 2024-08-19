class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int i;
        int a=0;
        int b=0;
        int c=0;
        for(i=0;i<n-1;i++){
            c=Math.max(c,i+nums[i]);
            if(i==b){
                b=c;
                a++;
            }
        }
        return a;
    }
}