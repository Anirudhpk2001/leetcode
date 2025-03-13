class Solution {
    public void recursion(ArrayList<Integer> circle,int i,int k)
    {
        if(circle.size()==1)
        {
            return ;
        }
        i=((i+k)%circle.size())-1;
        if(i==-1)
        {
            i=circle.size()-1;
        }
        circle.remove(circle.get(i));

        recursion(circle,i,k);


        
        
    }
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> circle=new ArrayList<>();

        for(int i=1;i<=n;i++)
        {
            circle.add(i);
        }

        recursion(circle,0,k);

        return circle.get(0);
    }
}