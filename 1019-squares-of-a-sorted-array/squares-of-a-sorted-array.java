class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int ans[] = new int[n];
        int index = 0;

        for(int i = 0; i < n; i++)
        {
            int val = Math.abs(nums[i] * nums[i]);

            ans[index++] = val;
        }
        Arrays.sort(ans);
        return ans;
    }
}