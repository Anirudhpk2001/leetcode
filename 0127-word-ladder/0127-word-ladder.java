class Solution {
    private boolean isValid(String str1,String str2)
    {
        int diff=0;

        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)!=str2.charAt(i) )
            {
                diff++;
            }
            if(diff>=2)
            {
                return false;
            }
            

        }

        return true;


    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();

        Queue<String> q=new LinkedList<>();
        HashSet<String> set=new HashSet<>();

        q.add(beginWord);
        set.add(beginWord);
        int count=1;
        while(!q.isEmpty())
        {
            int size=q.size();
            
            for(int j=0;j<size;j++)
            {
                 String str=q.poll();
            
                if(str.equals(endWord))
                {
                    return count;
                }
                for(int i=0;i<wordList.size();i++)
                {
                    if(isValid(str,wordList.get(i)) && !set.contains(wordList.get(i)))
                    {
                        q.add(wordList.get(i));
                        set.add(wordList.get(i));
                    }
                    
                }
            }

            count++;
        }


        return 0;
        

    }
}