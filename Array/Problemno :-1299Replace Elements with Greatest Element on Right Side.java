class Solution {
    public int[] replaceElements(int[] arr) {
         int n = arr.length;
         int[] ans = new int[arr.length];
         ans[ans.length-1] = -1;
        int nge = arr[n-1];
         for (int i = n-2; i >= 0; i--) {
            ans[i] = nge;
            nge = Math.max(nge,arr[i]);
        }
        
        for (int ele: ans){
            System.out.print(ele+" ");
        }
        return ans;
    }
}
