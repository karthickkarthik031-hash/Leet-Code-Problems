class Solution {
    public int mostWordsFound(String[] sentences) {
        int c=0;
        for(int i=0;i<sentences.length;i++){
            String a[]=sentences[i].split(" ");
            if(c<a.length){
                c=a.length;
            }
        }
        return c;
    }
}