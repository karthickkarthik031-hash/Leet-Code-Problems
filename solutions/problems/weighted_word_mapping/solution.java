class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String e="";
         int sum=0;
        for(int i=0;i<words.length;i++){
          for(int j=0;j<words[i].length();j++){
            int a= words[i].charAt(j)-'a';
            sum=sum+weights[a];
        }  
        System.out.println(sum);
        sum=sum%26;
        int sum1=26-sum+96;
        char b=(char) sum1;
        e=e+b;
        sum=0;
        }
        return e;
    }
}