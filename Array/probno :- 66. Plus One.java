class Solution {
    public int[] plusOne(int[] l) {
        int n = l.length;

        for(int i = n-1; i>=0; i--){
            if(l[i]<9){
            l[i]++;
            return l;
            }
            l[i]=0;
        }
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
}
