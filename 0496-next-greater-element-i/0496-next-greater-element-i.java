class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> st=new Stack<>();

        HashMap<Integer,Integer> map=new HashMap<>();

        st.push(-1);

        for(int i=nums2.length-1;i>=0;i--)
        {
            
            if(st.peek()<nums2[i])
            {
                while( !st.empty() && st.peek()<nums2[i] )
                {
                    st.pop();
                
                }
                 if(st.empty())
                {
                    st.push(nums2[i]);
                    map.put(nums2[i],-1);
                    
                }
                else
                {
                    map.put(nums2[i],st.peek());
                    st.push(nums2[i]);
                }
            }
            else
            {
                map.put(nums2[i],st.peek());
                st.push(nums2[i]);

            }
            
              
            
            
        }
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++ )
        {
            res[i]=map.get(nums1[i]);
        }


        return res;
    }
}