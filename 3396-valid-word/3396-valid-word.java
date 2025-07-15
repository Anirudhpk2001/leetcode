class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3)
        {
            return false;
        }

        boolean vowel = false;
        boolean consonant = false;

        for(int i=0;i<word.length();i++)
        {   
            if(!Character.isLetterOrDigit(word.charAt(i)))
            {
                return false;
            }
            else if( word.charAt(i) == 'a'||word.charAt(i) == 'A'||word.charAt(i) == 'e'||word.charAt(i) == 'E'||word.charAt(i) == 'i'||word.charAt(i) == 'I'||word.charAt(i) == 'o'||word.charAt(i) == 'O'||word.charAt(i) == 'u'|| word.charAt(i) == 'U')
            {
                vowel = true;
            }
            else if(Character.isDigit(word.charAt(i)))
            {
                continue;
            }
            else
            {
                consonant = true;
            }
             
        }


        return vowel == consonant;
    }
}