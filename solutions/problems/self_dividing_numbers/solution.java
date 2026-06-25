class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> b=new ArrayList<>();
        int d=0;
        for(int i=left;i<=right;i++){
            int a=i;
            while(a>0){
                int c=a%10;
                if(c==0||i%c!=0){
                    a=0;
                     d=1;
                }
                a=a/10;
            }
            if(d!=1){
                b.add(i);
            }
            d=0;
        }
        return b;
    }
}