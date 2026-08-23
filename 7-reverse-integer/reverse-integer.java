class Solution {
    public int reverse(int x) {

       int n = Math.abs(x); 
       int s = 0;


       while(n > 0)
       {
            int lastDigit = n % 10;

            if (s > (Integer.MAX_VALUE - lastDigit) / 10) {
                return 0;
            }

            s = (s * 10) + lastDigit;
            n /= 10;
       }

      if(x < 0)
      {
            return -s;
      }
      
        return s;
    }
}