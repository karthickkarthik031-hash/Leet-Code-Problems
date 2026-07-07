class Solution {
    public long sumAndMultiply(int n) {
        List<Integer>a=new ArrayList<>();
        int sum = 0;
        int b = n;
        while (b > 0) {
            int d = b % 10;
            if (d != 0)
                a.add(0,d);
            sum =sum + d;
            b =b/ 10;
        }
        int num=0;
        for(int i=0;i<a.size();i++){
            num=num*10+a.get(i);
        }
        return (long) num * sum;
    }
}