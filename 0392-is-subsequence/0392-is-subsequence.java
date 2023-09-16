class Solution {
    public boolean isSubsequence(String s, String t) {
     int i=0;
     int j=0;
    int k=s.length();
    int l=t.length();
    
    while(i<k && j<l)
    {
        if(s.charAt(i)==t.charAt(j))
        {
            i++;
            j++;
        }
        else
        {
            j++;
        }
    }  
    if(i==k)
    {
        return true;
    }
    else
    return false;
    }
}