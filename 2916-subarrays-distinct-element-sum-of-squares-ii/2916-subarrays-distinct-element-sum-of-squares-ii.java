
class Solution {
    static final long MOD = 1_000_000_007L;

    long[] sum, sumSq, lazy;
    int n;

    void apply(int node, int l, int r, long val) {
        long len = r - l + 1L;

        long change = (2L * val % MOD) * sum[node] % MOD;
        change = (change + (val * val % MOD) * len % MOD) % MOD;

        sumSq[node] = (sumSq[node] + change) % MOD;
        sum[node] = (sum[node] + val * len % MOD) % MOD;
        lazy[node] = (lazy[node] + val) % MOD;
    }

    void push(int node, int l, int r) {
        if (lazy[node] == 0 || l == r) {
            return;
        }

        int mid = l + (r - l) / 2;
        long val = lazy[node];

        apply(node * 2, l, mid, val);
        apply(node * 2 + 1, mid + 1, r, val);

        lazy[node] = 0;
    }

    void update(int node, int l, int r, int ql, int qr) {
        if (qr < l || r < ql) {
            return;
        }

        if (ql <= l && r <= qr) {
            apply(node, l, r, 1);
            return;
        }

        push(node, l, r);

        int mid = l + (r - l) / 2;

        update(node * 2, l, mid, ql, qr);
        update(node * 2 + 1, mid + 1, r, ql, qr);

        sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;
        sumSq[node] = (sumSq[node * 2] + sumSq[node * 2 + 1]) % MOD;
    }

    public int sumCounts(int[] nums) {
        n = nums.length;

        sum = new long[4 * n];
        sumSq = new long[4 * n];
        lazy = new long[4 * n];

        int[] last = new int[100001];
        java.util.Arrays.fill(last, -1);

        long ans = 0;

        for (int r = 0; r < n; r++) {
            int x = nums[r];

            update(1, 0, n - 1, last[x] + 1, r);

            last[x] = r;

            ans = (ans + sumSq[1]) % MOD;
        }

        return (int) ans;
    }
}
