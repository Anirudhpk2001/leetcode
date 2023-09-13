class Solution {
    public Boolean checkvowel(char x)
    {
        if(x=='a'|| x=='e'||x=='i'|| x=='o'|| x=='u')
        return true;
        else 
        return false;
    }
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        int  j=s.length()-1;

        while(i<j)
        {   
            if(checkvowel(Character.toLowerCase(s.charAt(i)))&& checkvowel(Character.toLowerCase(s.charAt(j))))
            {   
              char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;

            }
            else if ( !checkvowel(Character.toLowerCase(s.charAt(j))))
            {
                j--;
            }
            else
            {
                i++;

            }

           
        }
        return sb.toString();
    }
}