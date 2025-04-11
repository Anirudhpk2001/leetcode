class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;

        for(int i=low;i<=high;i++)
        {
            String str=Integer.toString(i);

            if(str.length()%2!=0)
            {
                continue;
            }


            int half=str.length()/2;

            int leftSum=0;
            int RightSum=0;


            for(int j=0;j<half;j++)
            {
                leftSum+=str.charAt(j)-'0';
            }
            for(int j=half;j<str.length();j++)
            {
                RightSum+=str.charAt(j)-'0';
            }

            if(leftSum==RightSum)
            {
                count++;
            }
        }

        return count;
        
    }
}