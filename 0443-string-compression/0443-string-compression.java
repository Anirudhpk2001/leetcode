class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1)
        {
            return 1;
        }

        int i = 0;
        int n = chars.length;
        int j = 0;

        while(i < n)
        {
            
            int count = 1;
            while(i < n-1 && chars[i] == chars[i+1])
            {
                i++;
                count++;
            }
            System.out.println(count);
            chars[j] = chars[i];
            j++;

            if(count > 1)
            {
                String countString = ""+count;

                char[] countchar = countString.toCharArray();
                for(char ch:countchar)
                {
                    chars[j] = ch;
                    j++;
                }
            }
            i++;
        }

        return j;
    }
}