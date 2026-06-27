class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        boolean[] isFriend = new boolean[101];

        for (int f : friends)
            isFriend[f] = true;

        int[] ans = new int[friends.length];
        int idx = 0;

        for (int x : order) {
            if (isFriend[x]) {
                ans[idx++] = x;
            }
        }

        return ans;
    }
}