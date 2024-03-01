class Solution {
    public String maximumOddBinaryNumber(String s) {
        // String res="";
        int num_1=0;
        int num_0=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='1')
            {
                num_1++;
            }
            else{
                num_0++; 
            }
               
        }
        StringBuilder res=new StringBuilder();
        res.append("1".repeat(num_1-1));
        res.append("0".repeat(num_0));
        res.append("1");
        return res.toString();

        // if(num_1==0)
        // {
        //     return s;
        // }

        // else
        // {
        //     for(int i=0;i<num_1-1;i++)
        //     {
        //         res=res+"1";
        //     }
        //     for(int j=0;j<num_0;j++)
        //     {
        //         res=res+"0";
        //     }
        //     res=res+1;
        // }
        // return res;
    }
}