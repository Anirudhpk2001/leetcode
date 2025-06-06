class Solution {
    public int compress(char[] chars) {
        
     
    int i =0;

    int write =0;

    while(i<chars.length)
    {
        int count =0;
        char ch = chars[i];

        while(i<chars.length && chars[i] == ch)
        {
            i++;
            count++;
        }

        chars[write] = ch;
        write++;

        if(count >1)
        {
            String str = ""+count;
            for(char c : str.toCharArray())
            {
                chars[write] = c;
                write++;
            }
            
        }
    }


    return write;


       
       
        

    }
}