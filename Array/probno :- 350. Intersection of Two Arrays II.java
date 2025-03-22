class Solution {
    public int[] intersect(int[] n, int[] m) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < n.length ; i++){
            for(int j = 0; j < m.length ; j++){
                if(n[i]==m[j]){
                    result.add(m[j]);
                    m[j] = -1;
                    break;
                }
             }
        }
        int[] ans = new int[result.size()];
        for(int i = 0 ; i < ans.length ; i++){
            ans[i] = result.get(i);
         }
        return ans;
    }
}
