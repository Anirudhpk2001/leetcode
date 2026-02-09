class Solution {
    public int minimumDeletions(String s) {
        int count = 0;
        int result = 0;

        for( char ch : s.toCharArray())
        {
            if(ch == 'b')
            {
                count++;
            }

            else if(count >0)
            {
                count --;
                result++;
            }
        }

        return result;
    }
}