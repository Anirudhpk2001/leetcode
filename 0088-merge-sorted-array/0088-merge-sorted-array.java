class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int len=nums1.length;


        while(len>=0 && m>0 && n>0 )
        {
            if(m>0 && n>0 && nums1[m-1]>nums2[n-1])
            {
                nums1[len-1]=nums1[m-1];
                m--;
                
            }
            else if(m>0 && n>0 && nums1[m-1]<=nums2[n-1])
            {
                nums1[len-1]=nums2[n-1];
                n--;
                
            }
            
            len--;


        }

        if(m==0)
        {
            for(int i=0;i<n;i++)
            {
                nums1[m+i]=nums2[i];
            }
        }


    }
}