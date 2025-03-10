class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transpose = new int[n][m];

        for (int i = 0; i < n; i++) { //cols
            for (int j = 0; j < m; j++) { //rows
                transpose[i][j] = matrix[j][i];
            }
        }
       return transpose;
    }
}
