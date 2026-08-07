class Node {
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key,int value){
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {

    Map<Integer, Node> map = new HashMap<>();
    int capacity = 0;
    int u_capacity = 0;
    int last_used = -1;
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);

    public LRUCache(int capacity) {
        this.capacity = capacity;
       

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        last_used = key;
        if(map.get(key)!= null){
            Node node = map.get(key);
            node.prev.next = node.next;
            node.next.prev = node.prev;
            
            node.prev = tail.prev;
            node.prev.next = node;
            node.next = tail;
            tail.prev = node;
            return node.value;
        }else{
            return -1;
        }

    }
    
    public void put(int key, int value) {
        if(map.get(key)!=null){
            Node node = map.get(key);
            node.value = value;

        
            node.prev.next = node.next;
            node.next.prev = node.prev;
            
            node.prev = tail.prev;
            node.prev.next = node;
            node.next = tail;
            tail.prev = node;

        }else{
            if(capacity<=u_capacity){
    
            
            Node lru = head.next;
            int lru_key = lru.key;
            head.next = head.next.next;
            lru.prev = null;
            lru.next.prev = head;
            lru.next = null;
            map.remove(lru_key);
        }

        Node node = new Node(key,value);
            Node p_lru = tail.prev;
            node.prev = tail.prev;
            node.prev.next = node;

            tail.prev = node;
            node.next = tail;
            this.map.put(key,node);
            u_capacity++;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */