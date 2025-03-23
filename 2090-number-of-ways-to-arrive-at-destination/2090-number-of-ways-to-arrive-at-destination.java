import java.util.*;

class Solution {
    public int countPaths(int n, int[][] roads) {
        // Create adjacency list for graph representation
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Populate the graph with bidirectional roads
        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int t = road[2];
            graph.get(u).add(new int[]{v, t});
            graph.get(v).add(new int[]{u, t});
        }

        // Distance and ways arrays
        long[] dist = new long[n];
        int[] ways = new int[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        Arrays.fill(ways, 0);

        // Priority queue for Dijkstra's algorithm (min-heap based on distance)
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        // Initialize starting point
        dist[0] = 0;
        ways[0] = 1;
        pq.offer(new long[]{0, 0}); // {distance, node}

        long MOD = 1000000007;

        while (!pq.isEmpty()) {
            long[] curr = pq.poll();
            long d = curr[0];
            int u = (int) curr[1];

            // Ignore outdated distances
            if (d > dist[u]) continue;

            for (int[] neighbor : graph.get(u)) {
                int v = neighbor[0];
                long time = neighbor[1];

                // If a shorter path is found
                if (dist[u] + time < dist[v]) {
                    dist[v] = dist[u] + time;
                    ways[v] = ways[u];
                    pq.offer(new long[]{dist[v], v});
                }
                // If another shortest path is found
                else if (dist[u] + time == dist[v]) {
                    ways[v] = (int)((ways[v] + ways[u]) % MOD);
                }
            }
        }

        return ways[n - 1];
    }
}
