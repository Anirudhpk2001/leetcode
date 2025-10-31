class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> Monotonic = new Stack<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!Monotonic.isEmpty() && nums2[i]>Monotonic.peek())
            {
                Monotonic.pop();
            }
            if(Monotonic.isEmpty())
            {
                map.put(nums2[i],-1);
            }
            else
            {
                map.put(nums2[i],Monotonic.peek());
            }
            Monotonic.push(nums2[i]);
        }

        int[] result = new int[nums1.length];

        for(int i=0;i<nums1.length;i++)
        {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}