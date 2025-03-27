class Solution {
    List<String> result;
    public boolean isValid(StringBuilder sb)
    {
        int count=0;

        for(char ch:sb.toString().toCharArray())
        {
             if(count<0 )
           {
            return false;
           }
           if(count>sb.length()/2)
           {
            return false;
           }


           if(ch=='(')
           {
            count++;
           }
           else
           {
            count--;
           }
        }
         if(count<0 || count!=0)
           {
            return false;
           }
           if(count>sb.length()/2)
           {
            return false;
           }

        return true;
    }
    public void dp(StringBuilder sb,int n)
    {
        System.out.println(sb.toString());
        if(sb.length()==(2*n))
        {
            if(isValid(sb))
            {
                result.add(sb.toString());
            }
            return;
        }

        sb.append("(");
        dp(sb,n);
        sb.deleteCharAt(sb.length()-1);
        sb.append(")");
        dp(sb,n);
        sb.deleteCharAt(sb.length()-1);
        
       
    }
    public List<String> generateParenthesis(int n) {
        result=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        dp(sb,n);

        return result;
        
    }
}