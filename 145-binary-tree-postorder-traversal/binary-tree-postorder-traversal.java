class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        post(root, result);
        return result;
    }

    private void post(TreeNode root, List<Integer> result) {
        if (root == null) return;
        post(root.left, result);
        post(root.right, result);
        

        result.add(root.val);
        
       
    }
}