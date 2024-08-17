class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int q_size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<q_size;i++){
                TreeNode temp = q.poll();
                list.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}