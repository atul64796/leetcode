class Solution {

    public void reverse(int row[])
    {
        int i = 0;
        int j = row.length-1;

        while(i < j)
        {
            int temp = row[j];
            row[j] = row[i];
            row[i] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[][] matrix) {
        
        int n = matrix.length;

        //Transpose (i,j) --> (j,i)

        for(int i=0; i <n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                //swap (i,j) --> (j,i)

                if(i < j)
                {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        // reverse matrix
        for(int i=0; i <n;i++)
        {
            reverse(matrix[i]);
        }
    }
}