class Solution {
    public boolean isStrictlyPalindromic(int n) {
        String b="";
        for(int j=2;j<n;j++){
            b="";
            String a=Integer.toString(n,j);
        for(int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        if(!a.equals(b)){
            return false;
        }
    }
    return true;
    }
}