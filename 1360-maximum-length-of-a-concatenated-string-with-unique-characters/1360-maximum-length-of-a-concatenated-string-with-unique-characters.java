class Solution {

    private boolean isDuplicate(String str1,String str2)
    {
        int[] alphacount=new int[26];
        Arrays.fill(alphacount,0);

        for(int i=0;i<str1.length();i++)
        {
            if(alphacount[str1.charAt(i)-'a'] >0)
            {
                return true;
            }
            alphacount[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++)
        {
            if(alphacount[str2.charAt(i)-'a'] >0)
            {
                return true;
            }
         
        }


        return false;
    }

    private int solve(List<String> arr,StringBuilder temp, int i)
    {
        if(i>=arr.size())
        {
            return temp.length();
        }

        int exclude=0;
        int include=0;
        String current = arr.get(i);
        if(isDuplicate(current,temp.toString()))
        {
            exclude=solve(arr,temp,i+1);
        }
        else
        {
            exclude = solve(arr,temp,i+1);
            temp.append(arr.get(i));
            include = solve(arr,temp,i+1);
            temp.setLength(temp.length()-current.length());
        }

        return Math.max(include,exclude);
    }
    public int maxLength(List<String> arr) {
        StringBuilder temp=new StringBuilder();

        return solve(arr,temp,0);
    }
}