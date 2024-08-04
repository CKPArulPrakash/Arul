class Solution {
    public int removeElement(int[] nums, int val) {
       int a=0;
      int  n=nums.length;
      int [] b=new int[n];
       for(int i=0;i<n;i++){
        if(nums[i]==val){
          
          }
        else{
           b[a]=nums[i];
            a++;
        }
       } 
       for(int i=0;i<n;i++){
        nums[i]=b[i];
       }
       return a;
    }
}