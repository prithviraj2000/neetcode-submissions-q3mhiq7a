class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] t : times) {
            adj.get(t[0]).add(new int[]{t[1], t[2]});
        }

        int[] dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[k] = 0;

        PriorityQueue<int[]> pq =
            new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        pq.offer(new int[]{k, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();

            int node = curr[0];
            int time = curr[1];

            if (time > dis[node]) {
                continue;
            }

            for (int[] nei : adj.get(node)) {
                int nextNode = nei[0];
                int weight = nei[1];

                if (time + weight < dis[nextNode]) {
                    dis[nextNode] = time + weight;
                    pq.offer(new int[]{nextNode, dis[nextNode]});
                }
            }
        }

        int res = 0;

        for (int i = 1; i <= n; i++) {
            if (dis[i] == Integer.MAX_VALUE) {
                return -1;
            }

            res = Math.max(res, dis[i]);
        }

        return res;
    }
}