class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        double Average = 100;
        int i = 0;
        int j = n-1;
        int k = 0;
        double[] pop = new double[n/2];
        
        while(i<=j){
           double lol = (nums[i] + nums[j]) / 2f;
           pop[k] = lol;
           k++;
           i++;
           j--;
        }
        Arrays.sort(pop);
        Average = pop[0];
        return Average;
    }

}
