class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int ans = nums[0];
        int k = nums[0];
        for (int i = 1; i < n; i++) {

            if (nums[i] > nums[i - 1]) {
                k += nums[i];
            }
            else{
                k = nums[i];
            }
            ans = Math.max(ans,k);
        }
        return ans;
    }
}
