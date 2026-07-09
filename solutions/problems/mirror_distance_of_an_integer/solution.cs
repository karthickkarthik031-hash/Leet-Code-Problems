public class Solution {
    public int MirrorDistance(int n) {
        int sum=0;
        int b=0;
        int c=n;
        while(n>0){
            int a=n%10;
            sum=sum*10+a;
            n=n/10;
        }
        b=sum-c;
        if(b<0){
            b=b*(-1);
        }
        return b;
    }
}