class Solution {
    public void moveZeroes(int[] nums) {
        int[] num=new int[nums.length];
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){a++;}
            else{num[b]=nums[i];b++;}
        }
        for(int i=0;i<a;i++){num[b]=0;b++;}
        for(int i=0;i<num.length;i++){ nums[i]=num[i];}
    }
}