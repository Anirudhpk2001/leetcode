class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) return 0;

        // Map stop -> list of buses (routes) that go through this stop
        Map<Integer, List<Integer>> stopToBuses = new HashMap<>();
        for (int bus = 0; bus < routes.length; bus++) {
            for (int stop : routes[bus]) {
                stopToBuses.computeIfAbsent(stop, k -> new ArrayList<>()).add(bus);
            }
        }

        // Queue for BFS over stops
        Queue<Integer> stopQueue = new LinkedList<>();
        stopQueue.add(source);

        // Track visited stops and buses to avoid cycles
        Set<Integer> visitedStops = new HashSet<>();
        Set<Integer> visitedBuses = new HashSet<>();
        visitedStops.add(source);

        int busesTaken = 0;

        while (!stopQueue.isEmpty()) {
            int size = stopQueue.size();
            busesTaken++; // we are exploring one more bus level

            for (int i = 0; i < size; i++) {
                int currStop = stopQueue.poll();

                // All buses that pass through current stop
                List<Integer> buses = stopToBuses.getOrDefault(currStop, new ArrayList<>());
                for (int bus : buses) {
                    if (visitedBuses.contains(bus)) continue;
                    visitedBuses.add(bus); // mark this bus as taken

                    // Add all stops of this bus
                    for (int stop : routes[bus]) {
                        if (stop == target) return busesTaken;
                        if (!visitedStops.contains(stop)) {
                            visitedStops.add(stop);
                            stopQueue.add(stop);
                        }
                    }
                }
            }
        }

        // Target not reachable
        return -1;
    }
}
