class Solution {
    public void rotate(int[] nums, int k) {
          int n = nums.length;
            // Ensure k is within the bounds of the array size
            k = k % n;

            // Create a new array to store the rotated version
            int[] rotatedArray = new int[n];

            // Copy the last k elements to the beginning of the rotated array
            for (int i = 0; i < k; i++) {
                rotatedArray[i] = nums[n - k + i];
            }

            // Copy the remaining elements to the rotated array
            for (int i = k; i < n; i++) {
                rotatedArray[i] = nums[i - k];
            }

            // Copy the rotated array back to the original array
          for (int i = 0; i < n; i++) {
                nums[i] = rotatedArray[i];
            }
            System.out.println(nums);
    }
}
