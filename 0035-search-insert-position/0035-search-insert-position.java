class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int k=0;
        if(nums[0]>=target ){
               k=0;
        }
        else{
        for(int i=0;i<n;i++){
           if(nums[i]>=target){
            k=i;
            break;
           }
        }
        if(k==0){
            k=n;
        }}
        return k;
    }
}