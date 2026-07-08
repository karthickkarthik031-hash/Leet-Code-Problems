class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a=word1.length()*word2.length()*2;
        List<Character>b=new ArrayList<>();
        for(int i=0;i<a;i++){
            b.add('0');
        }
        int j=1;
        for(int i=0;i<word2.length();i++){
            b.set(j,word2.charAt(i));
            j+=2;
        }j=0;
        for(int i=0;i<word1.length();i++){
            b.set(j,word1.charAt(i));
            j+=2;
        }String c="";
         for(int i=0;i<b.size();i++){
            c=c+b.get(i);
         }
         c=c.replace("0","");
       return c;
    }
}