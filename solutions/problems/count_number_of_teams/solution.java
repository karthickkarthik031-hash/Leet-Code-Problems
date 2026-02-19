class Solution {
    public int numTeams(int[] b) {
     int a=b.length;
     int count=0;
       for(int i=0;i<=a-3;i++){
        for(int j=i+1;j<=a-2;j++){
            for(int k=j+1;k<=a-1;k++){
                if(b[i]>b[j]){
                    if(b[j]>b[k]){
                    count++;}
                }
                else{
                    if(b[j]<b[k]){
                        count++;
                    }
                }
            } 
        } 
       } 
       return count;
    }
}