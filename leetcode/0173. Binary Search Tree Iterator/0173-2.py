class BSTIterator:
  def __init__(self, root: Optional[TreeNode]):
    self.stack = []
    self.pushLeftsUntilNull_(root)

  def next(self) -> int:
    root = self.stack.pop()
    self.pushLeftsUntilNull_(root.right)
    return root.val

  def hasNext(self) -> bool:
    return self.stack

  def pushLeftsUntilNull_(self, root: Optional[TreeNode]) -> None:
    while root:
      self.stack.append(root)
      root = root.left
