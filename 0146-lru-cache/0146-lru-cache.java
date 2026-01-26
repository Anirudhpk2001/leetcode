class Node{
    int key;
    int val;
    Node prev;
    Node front;

    public Node(int key,int val)
    {
        this.key = key;
        this.val = val;

    }
}

class LRUCache {

    int cap;
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);

    HashMap<Integer,Node> map ;

    private void addNode(Node node)
    {
        Node headfront = head.front;
        head.front = node;
        node.prev = head;
        node.front = headfront;
        headfront.prev = node;
    }

    private void deleteNode(Node node)
    {
        Node PrevNode = node.prev;
        Node FrontNode = node.front;

        PrevNode.front = FrontNode;
        FrontNode.prev = PrevNode;
    }

    public LRUCache(int capacity) {
        cap = capacity;
        map = new HashMap<>();
        head.front = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
            Node node = map.get(key);
            deleteNode(node);
            addNode(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            Node node = map.get(key);
            node.val = value;
            deleteNode(node);
            addNode(node);
            map.put(key,node);
        }
        else {
            if(map.size() == cap)
            {
                Node lastNode = tail.prev;
                map.remove(lastNode.key);
                deleteNode(lastNode);
                Node node = new Node(key,value);
                addNode(node);
                map.put(key,node);
            }
            else
            {
                Node node = new Node(key,value);
                addNode(node);
                map.put(key,node);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */