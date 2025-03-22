class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(nums.length==0){
            return 0;
        }
        
        // int[] ans = new int[n];
        int k = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];  
            }
        }
        return k+1;
    }
}
