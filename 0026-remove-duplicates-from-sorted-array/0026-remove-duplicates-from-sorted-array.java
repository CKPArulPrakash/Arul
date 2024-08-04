class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;int j=1;
        nums[0]=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i-1]!=nums[i]){
                nums[j]=nums[i];
                j++;
            }
            else{

            }
        }
        return j;
       // return nums;
    }
   /* public boolean removeDuplicate(int[] nums,int[] a,int n,int i){
        for(int j=0;j<i;j++){
            if(nums[i] == a[j]){
                return false;
            }
        }
        return true;
    }*/
}