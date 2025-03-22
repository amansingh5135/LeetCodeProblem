class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int ele : arr){
            if(ele%2==1){
                count++;
                if(count==3){
                    return true;
                }
            } else count=0;
        }
        return false;
    }
}
