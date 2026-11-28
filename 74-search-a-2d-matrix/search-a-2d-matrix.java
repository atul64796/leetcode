class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) 
        {
            return false;
        }
        
       int m = matrix.length;
       int n = matrix[0].length;

       int start = 0;
       int end = m * n - 1;


       while(start <= end)
       {
            int mid = start + (end - start) / 2;

            int midval = matrix[mid / n][mid % n];

            // System.out.println(midval);

            if(midval == target)
            {
                return true;
            }
            else if(midval > target) // 7  >  8
            {
                end = mid - 1;
            }
            else 
            {
                start = mid + 1;
            }

       }
        return false;
    }
}