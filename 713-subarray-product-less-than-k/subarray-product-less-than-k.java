class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int low = 0;
        int product = 1;
        int res = 0;
        for (int high = 0; high < nums.length; high++) {
            product *= nums[high];
            while (product >= k) {
                product /= nums[low];
                low++;
            }
            res += high - low + 1;
        }
        return res;
    }
}