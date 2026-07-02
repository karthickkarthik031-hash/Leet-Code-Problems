class Solution {
    public void setZeroes(int[][] matrix) {
        int a[][]=new int [matrix.length][matrix[0].length];
         for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
           a[i][j]= matrix[i][j];
           }}
        for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
            for(int k=0;k<matrix.length;k++){ 
                a[k][j]=0;
            }
           for(int l=0;l<matrix[0].length;l++){ 
            a[i][l]=0;
           }
            }
    }}
          for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
            matrix[i][j]=a[i][j];
           }
           }
           }
}