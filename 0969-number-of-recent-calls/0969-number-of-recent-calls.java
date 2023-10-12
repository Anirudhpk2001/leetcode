class RecentCounter {
    int counter=0;
    Queue<Integer> q;

    public RecentCounter() {
      q=new PriorityQueue<>();
    }
    
    public int ping(int t) {
        q.add(t);
        while(!q.isEmpty() && q.peek()<(t-3000))
        {
            q.poll();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */