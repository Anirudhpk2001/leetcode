class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        int[] ans=new int[n];
        Queue<Integer> q=new LinkedList<>();
        Arrays.sort(deck);
        for(int i=0;i<n;i++)
        {
            q.offer(i);
        }
        
        for(int i=0;i<n;i++)
        {
            ans[q.poll()]=deck[i];
            q.offer(q.poll());
        }
        return ans;
    }
}