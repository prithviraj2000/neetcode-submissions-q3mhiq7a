class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(a.val, b.val)
        );

        for (int[] p : points) {
            double d = p[0] * p[0] + p[1] * p[1];
            pq.add(new Pair(d, p));
        }

        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().x;
        }

        return ans;
    }
}

class Pair {
    double val;
    int[] x;

    Pair(double v, int[] a) {
        val = v;
        x = a;
    }
}
