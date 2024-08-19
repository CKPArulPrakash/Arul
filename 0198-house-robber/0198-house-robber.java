class Solution 
{
    public int rob(int[] nums) 
    {
        int n=nums.length;
        int a=nums[0];
        int b=0;
        for(int i=1;i<=n;i++)
        {
         int pick=nums[i];
         if(i>1)
         { 
            pick+=b;
         }
            int notpick=a;
            int curr=Math.max(pick, notpick);
            b=a;
            a=curr;
        }
        return a;
    }
}