class Solution {
    public void sortColors(int[] nums) {
       int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[j] <= nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int ele : nums){
            System.out.print(ele + " ");
        }
    }
}
