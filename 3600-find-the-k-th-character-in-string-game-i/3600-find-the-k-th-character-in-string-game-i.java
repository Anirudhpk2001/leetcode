class Solution {
    public void recursion(StringBuilder sb,int k)
    {
        if(sb.length()>=k)
        {
            return ;
        }
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<sb.length();i++)
        {
            int c=sb.charAt(i);
            sb2.append(String.valueOf( (char) (c + 1)));
        }

        sb.append(sb2);

        recursion(sb,k);
    }

    public char kthCharacter(int k) {

       StringBuilder sb=new StringBuilder("a");

        recursion(sb,k);

        return sb.charAt(k-1);




    }
}