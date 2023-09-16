class Solution {
    public boolean isSubsequence(String s, String t) {
     int i=0;
     int j=0;
    int k=s.length();
    int l=t.length();
    int count=0;
    while(i<k && j<l)
    {
        if(s.charAt(i)==t.charAt(j))
        {
            count++;
            i++;
            j++;
        }
        else
        {
            j++;
        }
    }  
    if(count==k)
    {
        return true;
    }
    else
    return false;
    }
}