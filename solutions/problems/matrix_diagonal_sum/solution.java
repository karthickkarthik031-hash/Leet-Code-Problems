class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int a = mat.length;
        for(int i=0;i<a;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j|| i+j==a-1){
                    sum+=(mat[i][j]);
                }
            }
        }   
           return sum;
   }
}