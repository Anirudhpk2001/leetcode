class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int n=s.length();
        int count=0;
        int j=k;
        int max=0;
        for(int q=0;q<k;q++)
        {
            if(s.charAt(q)=='a'||s.charAt(q)=='e'||s.charAt(q)=='i'||s.charAt(q)=='o'||s.charAt(q)=='u')
            {
                count++;
            }

        }

        max=Math.max(max,count);

        while(j<s.length())
        {   
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' )
            {
                count--;
            }
            if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u' )
            {
                count++;
            }
            i++;
            j++;
            max=Math.max(max,count);
        }

        return max;
    }

}