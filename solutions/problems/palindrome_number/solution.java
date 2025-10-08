class Solution {
    public boolean isPalindrome(int x) {
        long sum=0;
        int a=x;
        if(a<0)
        {
            return false;
        }
        while(x!=0){
            int n=x%10;
            sum=sum*10+n;
            x=x/10;
        }
        if(a==sum)
        {
            return true;
        }
        return false;
    }
}