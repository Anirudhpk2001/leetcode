class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix.length-1;
        
        while(i<=j)
        {
            int mid = i + (j-i)/2;
            if(target == matrix[mid][0])
            {
                return true;
            }
            if(target < matrix[mid][0])
            {
                j = mid -1;
            }
            else
            {
                i=mid+1;
            }

        }
        System.out.println(j);

       

        int row = j;

         if (row < 0) {
            return false;
        }

        i=0;
        j=matrix[row].length-1;

        while(i<=j)
        {
            int mid =i + (j-i)/2;

            if(matrix[row][mid] == target)
            {
                return true;
            }

            if(target > matrix[row][mid])
            {
                i = mid+1;
            }
            else
            {
                j = mid-1;
            }
        }


        return false;

    }
}