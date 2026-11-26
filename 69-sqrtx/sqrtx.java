class Solution {
    public int mySqrt(int x) {
     
      if(x < 2)
      {
            return x;
      }

      int left = 1;
      int right = x / 2; // 8 / 2 = 4
      int ans = 0;

      while(left <= right)
      {
            int mid = left + (right - left) / 2; 
            long square = (long) mid * mid;

            if(square == x)
            {
                return mid;
            }
            else if(square < x) // 4 * 4 = 16 < 4  //  < 4
            {
                ans = mid;
                left = mid + 1; // 4 + 1 = 5 
            }
            else
            {
                right = mid - 1;
            }
      }
        return ans;
    }
}