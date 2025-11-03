class BrowserHistory {
    
    class Node{
        String url;
        Node prev;
        Node front;
        public Node(String url)
        {
            this.url = url;
            this.prev = null;
            this.front = null;
        }

    }
    Node home;
    public BrowserHistory(String homepage) {
        home = new Node(homepage);
    }
    
    public void visit(String url) {
        Node temp = new Node(url);
        temp.prev = home;
        home.front = temp;
        home = temp;
    }
    
    public String back(int steps) {
        while(home.prev!=null && steps>0)
        {
            home = home.prev;
            steps--;
        }
        return home.url;
    }
    
    public String forward(int steps) {
        while(home.front!=null && steps>0)
        {
            home = home.front;
            steps--;
        }
        return home.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */