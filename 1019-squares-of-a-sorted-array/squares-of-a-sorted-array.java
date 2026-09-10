class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int index = 0;
        for(int i = 0; i < n; i++)
        {
            int val = Math.abs(nums[i] * nums[i]);
            nums[index++] = val;
        }
        Arrays.sort(nums);
        return nums;
    }
}