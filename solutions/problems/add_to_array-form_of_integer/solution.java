import java.util.*;
import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] c, int a) {
        List<Integer> b = new ArrayList<>();
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < c.length; i++) {
            sum = sum.multiply(BigInteger.TEN);
            sum = sum.add(BigInteger.valueOf(c[i]));
        }
        sum = sum.add(BigInteger.valueOf(a));
        if (sum.equals(BigInteger.ZERO)) {
            b.add(0);
            return b;
        }
        while (sum.compareTo(BigInteger.ZERO) > 0) {
            BigInteger n = sum.mod(BigInteger.TEN);
            b.add(0, n.intValue());
            sum = sum.divide(BigInteger.TEN);
        }
        return b;
    }
}