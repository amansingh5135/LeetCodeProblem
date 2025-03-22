class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum =0;
        for(int i = 0 ; i < chalk.length ; i++){
            sum += chalk[i];
        }
        int remainingchalk =(int) (k % sum);
        for(int i = 0 ; i < chalk.length ; i++){
            if(remainingchalk < chalk[i]){
                return i;
            }
            remainingchalk -= chalk[i];
        }
        return -1;
     }
}
