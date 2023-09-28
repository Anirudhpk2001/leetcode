class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
	    Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        // output list
        List<List<Integer>> out =  new ArrayList<>();
        out.add(new ArrayList<Integer>());
        out.add(new ArrayList<Integer>());

        // adding the elements to the set
        for (int i: nums1) {
            s1.add(i);
        }
        for (int i: nums2) {
            s2.add(i);
        }

        // checking and adding the elements to the output list
        for (int i: s1) {
            if (!s2.contains(i)) out.get(0).add(i);
        }
        for (int i: s2) {
            if (!s1.contains(i)) out.get(1).add(i);
        }
        return out;
        
    }
}