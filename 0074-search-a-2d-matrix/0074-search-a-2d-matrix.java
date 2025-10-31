class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = 0;
        int col = 0;
        int m = matrix.length-1;
        int n = matrix[0].length-1;

        int left = 0;
        int right = m;

       while(left <= right)
       {
            int mid = (left+right)/2;

            if(matrix[mid][col] == target)
            {
                return true;
            }
            else if(matrix[mid][col] > target)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
       }

        row = right;
        if(row<0)
        {
            return false;
        }
        // System.out.println(row);
        left = 0;
        right = n;
       while(left <= right)
       {
         int mid = (left+right)/2;

         if(matrix[row][mid] == target)
         {
            return true;
         }

         else if(matrix[row][mid] > target)
         {
            right = mid-1;
         }
         else
         {
            left = mid+1;
         }
       }


       return false;


    }
}