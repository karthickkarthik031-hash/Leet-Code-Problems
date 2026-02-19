class Solution {
    public int[] smallerNumbersThanCurrent(int[] a) {
        int b[]= new int[a.length];
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
             if(a[j]<a[i])
             count++;
            }
            b[i]=count;
        }return b;
    }
}