class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=0;
        int c=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                sum=sum+i;
            }
            else{
                c=c+i;
            }
        }
        int l=c-sum;
        return l;
    }
}