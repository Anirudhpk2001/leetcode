class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) > (s.length() + 1) / 2) {
                return ""; 
            }
        }


        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(map.entrySet());

        StringBuilder result = new StringBuilder();

        while (maxHeap.size() > 1) {
            Map.Entry<Character, Integer> entry1 = maxHeap.poll();
            Map.Entry<Character, Integer> entry2 = maxHeap.poll();

            result.append(entry1.getKey());
            result.append(entry2.getKey());

            if (entry1.getValue() - 1 > 0) {
                entry1.setValue(entry1.getValue() - 1);
                maxHeap.add(entry1);
            }

            if (entry2.getValue() - 1 > 0) {
                entry2.setValue(entry2.getValue() - 1);
                maxHeap.add(entry2);
            }
        }


        if (!maxHeap.isEmpty()) {
            result.append(maxHeap.poll().getKey());
        }

        return result.toString();
    }
}
