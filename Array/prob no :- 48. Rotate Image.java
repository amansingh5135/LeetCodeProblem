class Solution {
    public void rotate(int[][] arr) {
       
      int m = arr.length , n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
     //firstly transposing the array
     for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                     int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
             }
        }
         //rotate -> reverse each row
        for (int i = 0; i < m; i++) {
            int a = 0 , b = m-1;
            while(a<b){
                //swap arr[i][a] and arr[i][b]
                 int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
