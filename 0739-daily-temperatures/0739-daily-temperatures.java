class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> Monotonic = new Stack<>();

        for(int i=temperatures.length-1;i>=0;i--)
        {
           
            while(!Monotonic.isEmpty() && temperatures[i] >= Monotonic.peek()[0])
            {
                Monotonic.pop();
            }
            if(Monotonic.isEmpty())
            {
                result[i]=0;
                Monotonic.push(new int[]{temperatures[i],i});
            }
            else
            {
                result[i] = Monotonic.peek()[1] - i;
                Monotonic.push(new int[]{temperatures[i],i});
            }
            
        }

        return result;
    }
}