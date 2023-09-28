class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Create a HashMap to store the count of occurrences for each number.
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Create a HashSet to store unique counts.
        Set<Integer> out = new HashSet<>();
    
        // Iterate through the array to count occurrences.
        for(int i = 0; i < arr.length; i++) {
            // Use getOrDefault to safely increment the count.
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        // Iterate through the values in the map (occurrence counts).
        for(int num : map.values()) {
            out.add(num);
        }
        
        // Check if the number of unique occurrences matches the number of unique counts.
        // If they are equal, return true; otherwise, return false.
        return map.size() != out.size() ? false : true;
    }
}
