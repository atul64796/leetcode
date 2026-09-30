class Solution {
    public boolean canJump(int[] nums) {

        int fastest = 0;
        int n = nums.length;

        for(int i = 0; i < n;i++)
        {
            if(i > fastest)
            {
                return false;
            }

            fastest = Math.max(fastest, i + nums[i]);

            if(fastest >= n - 1)
            {
                return true;
            }
        }
        return true;
    }
}