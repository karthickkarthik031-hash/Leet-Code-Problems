class Solution {
    public String truncateSentence(String s, int k) {
        String b="";
        String a[]=s.split(" ");
        for(int i=0;i<k-1;i++){
            b=b+a[i]+" ";
        }
        b=b+a[k-1];
        return b;
    }
}