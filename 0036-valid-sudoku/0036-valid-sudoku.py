class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        
        row = [set() for _ in range(9)]
        col = [set() for _ in range(9)]

        blocks = [[set() for _ in range(3)] for _ in range(3)] 

        for i in range(9):
            for j in range(9):
                if board[i][j] == ".":
                    continue
                
                if board[i][j] in row[i]:
                    return False
                else:
                    row[i].add(board[i][j])

                if board[i][j] in col[j]:
                    return False
                else:
                    col[j].add(board[i][j])

                if board[i][j] in blocks[i//3][j//3]:
                    return False
                else:
                    blocks[i//3][j//3].add(board[i][j])

        

        return True