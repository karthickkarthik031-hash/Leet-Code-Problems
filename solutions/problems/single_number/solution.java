class Solution {
    public int singleNumber(int[] arr) {
        int a,b=0;
        for (int i=0;i<arr.length;i++) {
            a=0;
            for (int j=0;j<arr.length;j++) {
                if(i!=j&&arr[i]==arr[j]){
                    a=1;
                }
            }
            if(a!=1)
            {
                b=arr[i];
                break;
            }
           
        }
        return b; 
    }
}