class Solution 
{
    public void solve(int[] candidates,int target,int i,List<Integer>list,List<List<Integer>>r)
    {
        if(target==0){
            r.add(new ArrayList<>(list));
            return;
        }
        if(target<0  || i>=candidates.length){
            return;
        }
        else{
            list.add(candidates[i]);
            solve(candidates,target-candidates[i],i,list,r);
            list.remove(list.size()-1);
            solve(candidates,target,i+1,list,r);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>r=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        solve(candidates,target,0,list,r);
        return r;
    }
}