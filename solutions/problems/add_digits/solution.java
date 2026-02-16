class Solution {
    public int addDigits(int a) {
        if(a<10)
        return a;
        while(a>=10){
            int sum=0;
           while(a>0){
            sum=sum+a%10;
            a=a/10;
          }a=sum;
        }
        return a;
    }
}