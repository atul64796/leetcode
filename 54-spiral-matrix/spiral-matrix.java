class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int n = matrix[0].length-1; //last col
        int m = matrix.length-1; // last row

        int i = 0;
        int j = 0; 

        
        ArrayList<Integer> ans = new ArrayList<>();

        while(i <= m && j <= n )
        {
            for(int k = j; k <= n; k++) // left to right
            {
                ans.add(matrix[i][k]);
            }
            i++;

            for(int k = i; k <= m; k++) // top to bottom
            {
                ans.add(matrix[k][n]);
            }
            n--;

            if(i <= m) // right to left
            {
                for(int k = n; k >= j; k--)
                {
                    ans.add(matrix[m][k]);
                }
                m--;
            }

            if(j <= n)  // bottom to top
            {
                for(int k = m; k >= i; k--)
                {
                    ans.add(matrix[k][j]);
                }
                j++;
            }

        }
        return ans;
    }
}