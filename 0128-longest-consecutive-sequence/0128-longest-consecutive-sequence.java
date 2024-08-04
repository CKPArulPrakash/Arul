class Solution {
    public int longestConsecutive(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        if(n==0){
            return 0;
        }
        int count=1,max=1;
        int i;
        for(i=0;i<=n-2;i++){
            if(arr[i]+1==arr[i+1]){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else if(arr[i]==arr[i+1]){
                continue;
            }
            else{
                count=1;
            }
        }
        return max;
        
    }
}