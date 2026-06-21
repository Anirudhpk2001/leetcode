# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:

        if not root:
            return []

        result = []

        q = deque()

        q.append(root)
        level = -1
        while q :
            size = len(q)
            level +=1
            result.append([])
            for i in range(0,size):
                current = q.popleft()

                if current.left:
                    q.append(current.left)
                
                if current.right:
                    q.append(current.right)
                
                result[level].append(current.val)
        

        return result
        