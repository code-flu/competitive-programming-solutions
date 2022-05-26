class Solution {
 public:
  bool checkEqualTree(TreeNode* root) {
    if (!root)
      return false;

    unordered_set<int> seen;
    const int sum = root->val + dfs(root->left, seen) + dfs(root->right, seen);
    return sum % 2 == 0 && seen.count(sum / 2);
  }

 private:
  int dfs(TreeNode* root, unordered_set<int>& seen) {
    if (!root)
      return 0;

    const int sum = root->val + dfs(root->left, seen) + dfs(root->right, seen);
    seen.insert(sum);
    return sum;
  }
};
