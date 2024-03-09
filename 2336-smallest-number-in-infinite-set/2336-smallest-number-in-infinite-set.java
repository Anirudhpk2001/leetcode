class SmallestInfiniteSet {
    PriorityQueue<Integer> minheap;
    HashSet<Integer> set;
    public SmallestInfiniteSet() {
        minheap=new PriorityQueue<>();
        set=new HashSet<>();
        for(int i=1;i<=1000;i++)
        {
            set.add(i);
            minheap.add(i);
        }
    }
    
    public int popSmallest() {
            int top=minheap.poll();
            if(set.contains(top))
            {
            set.remove(top);
            }
        
            
        
        return top;
        
    }
    
    public void addBack(int num) {
        if(!set.contains(num))
        {
            set.add(num);
            minheap.add(num);
        
        }
       
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */