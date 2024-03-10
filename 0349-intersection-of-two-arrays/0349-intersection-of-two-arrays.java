class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> answerset=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set.add(nums1[i]);
        }
        
        for(int j=0;j<nums2.length;j++)
        {
            if(set.contains(nums2[j]))
            {
                answerset.add(nums2[j]);
            }
        }
        
      
        return answerset.stream().mapToInt(i -> i).toArray();
    }
}